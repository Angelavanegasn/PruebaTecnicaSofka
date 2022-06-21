package com.vanegas.co.retotecnico.service;

import com.vanegas.co.retotecnico.repository.NaveRepository;
import com.vanegas.co.retotecnico.modell.Nave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//recibe una nave y la implementarlo a su manera usando el polimorfismo atraves de la sobre carga de constructor
@Service
public class NaveServiceTipoUnoImp implements NaveServiceInterface {
    @Autowired
    private NaveRepository repository;

    //todos los atributos de la nave qe estan entrenando, pero en la linea 21 se hace el filtro solo se mandaran
    //unos atributos
    @Override
    public Nave guardar(Nave nave) {

        Nave naveUno= null;


        naveUno = new Nave(nave.getEmpuje(), nave.getPotencia(), nave.getProposito(),
                nave.getNombre(), nave.getTipoCombustible(), nave.getPeso(),nave.getVelocidad(),
                nave.getTipoNave());


        naveUno = repository.save(naveUno);

        return naveUno;


    }


}


