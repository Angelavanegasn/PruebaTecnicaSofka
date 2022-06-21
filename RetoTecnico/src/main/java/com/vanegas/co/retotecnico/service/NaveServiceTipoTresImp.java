package com.vanegas.co.retotecnico.service;

import com.vanegas.co.retotecnico.repository.NaveRepository;
import com.vanegas.co.retotecnico.modell.Nave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NaveServiceTipoTresImp implements NaveServiceInterface {
    @Autowired
    private NaveRepository repository;

// polimorfismo,interfaces y sobre carga de constructore.
    @Override
    public Nave guardar(Nave nave) {

        Nave naveTres= null;

        naveTres = new Nave(nave.getProposito(), nave.getNombre(), nave.getTipoCombustible(), nave.getPeso(), nave.getVelocidad(),
                nave.getTipoNave(),nave.getCapacidadPersonas(), nave.getTipoDeDespliegue())
        ;

        repository.save(naveTres);

        return naveTres;


    }
}
