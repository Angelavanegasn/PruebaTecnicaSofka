package com.vanegas.co.retotecnico.service;

import com.vanegas.co.retotecnico.repository.NaveRepository;
import com.vanegas.co.retotecnico.modell.Nave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NaveServiceTipoDosImp implements NaveServiceInterface {
    @Autowired
    private NaveRepository repository;


    @Override
    public Nave guardar(Nave nave) {

        Nave naveDos = null;


        naveDos = new Nave(nave.getProposito(), nave.getNombre(), nave.getTipoCombustible(), nave.getPeso(), nave.getVelocidad(),
                nave.getDistanciaEnOrbirta(), nave.getTiempoEnOnbirta(), nave.getTipoNave());


        repository.save(naveDos);

        return naveDos;


    }
}


