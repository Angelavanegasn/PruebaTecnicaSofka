package com.vanegas.co.retotecnico.service;

import com.vanegas.co.retotecnico.repository.NaveRepository;
import com.vanegas.co.retotecnico.modell.Nave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*Esta clase de servicio funciona como una estrategia ya que expone dos metodos que interactuan con la sgt capa
que es la de repository de forma directa ,esos metodos son : buscarUnaNave,buscarTodasLasNaves.
Por el contrario se tiene otro metodo con el nombre guardar que dependiendo el tipo de nave llama a una estrategia
de implementacion especifica
 */

@Service
public class NaveServiceEstrategia {
    @Autowired
    private NaveServiceTipoUnoImp servicetipouno;

    @Autowired
    private NaveServiceTipoDosImp servicetipodos;

    @Autowired
    private NaveServiceTipoTresImp servicetipotres;

    @Autowired
    private NaveRepository repository;

    Nave navecontipo = new Nave();

    public Nave guardar(Nave nave) {

        if(nave.getTipoNave() == 1) {

            navecontipo =  servicetipouno.guardar(nave);
        }
        else if (nave.getTipoNave() == 2){

            navecontipo =  servicetipodos.guardar(nave);
        }
        else {

            navecontipo =  servicetipotres.guardar(nave);
        }

        return navecontipo;
    }
//retorna lista de naves ,nos busca todos de la entidad nave con la que estamos trabajando
    public List<Nave> buscarTodasLasNaves(){


        return (List<Nave>) repository.findAll();

    }


    public Optional<Nave> buscarUnaNave(Long id) {

        Optional<Nave> nave = repository.findById(id);

        if(nave.isPresent()) {
            return nave;
        }

        return nave;

    }

}

