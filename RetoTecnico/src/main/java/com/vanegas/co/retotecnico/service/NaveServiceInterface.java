package com.vanegas.co.retotecnico.service;
// esta es una inteerface y aqui solo se exponen metodos abstractos y como se lo habia dicho como es uan
//interface no se debe anotar con etiquetas de spring boot

import com.vanegas.co.retotecnico.modell.Nave;

public interface NaveServiceInterface {

    public Nave guardar(Nave nave);

    }


