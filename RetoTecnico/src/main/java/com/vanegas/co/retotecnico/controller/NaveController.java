package com.vanegas.co.retotecnico.controller;

import com.vanegas.co.retotecnico.modell.Nave;
import com.vanegas.co.retotecnico.service.NaveServiceEstrategia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//toda clase en spring boot tiene que anotarse para que sea reconocida dentro del contexto una vez que
//se levante el aplicativo
@RestController
public class NaveController {

    @Autowired
    private NaveServiceEstrategia serviceEstrategia;


    // como el protocolo de comunicacion a utilizar entre postamn y sprin boot es http entonces debemos hacer uso
    // de los verbos que este protocolo nos provee, como son GET ,POST,DELETE, UPDATE, PUT, OPTIONS, HEAD, ETC

    //la clase responsableentitiy es propia de spring wed
    // para que desde cualqier cliente como postman o alguna aplicacion fronted lleguen a este metodo
    // es necesario que se anote con el verbo de protocolo http adecuado en este caso como se trata de guardar
    //una o un objeto ala base de datos vamos hacer uso del verbo POST


// para hacer referencia a una clase desde aqui debo inyectar esa clase en esta clase con la etiqueta
    //@Autowired y se debe crear como atributo de esta clase


    @PostMapping("/guardar")
    public ResponseEntity<?> crearNave(@RequestBody Nave nave) {

        return ResponseEntity.ok(serviceEstrategia.guardar(nave));


    }


    //A continuacion se construira el metodo que permite consultar una nave desde la base de datos y como se esta
    // haciendo uso del protocolo http, entonces usamos el GET ,que corresponde
    // ala anotacion @Getmapping en spring boot

    @GetMapping("/buscar/{id}")
    public ResponseEntity<?> buscarUnaNave(@PathVariable Long id) {


        return ResponseEntity.ok(serviceEstrategia.buscarUnaNave(id));

    }

    @GetMapping("/buscar/all")
    public ResponseEntity<?> buscarTodasNave(){


        return ResponseEntity.ok(serviceEstrategia.buscarTodasLasNaves());

    }
}