package com.vanegas.co.retotecnico.repository;

import com.vanegas.co.retotecnico.modell.Nave;

import org.springframework.data.repository.CrudRepository;


// esta clase como es una interface para spring boot no necesira ser anotada

    //una interface tiene todos sus metodos astractos osea que no se implementan, para este interface sus metodos
    //abstratcctos son todos aquellos que hereda de JpaRepositoryy la clase que vaya a usar esta interface debe


    public interface NaveRepository extends CrudRepository<Nave,Long> {

    }

