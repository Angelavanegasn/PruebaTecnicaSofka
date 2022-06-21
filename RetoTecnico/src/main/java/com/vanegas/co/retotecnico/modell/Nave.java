package com.vanegas.co.retotecnico.modell;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//la siguiente etiqueta esta relacionada con el uso de JPA
//en el framework Spring Boot

@Entity
@Table(name = "naveespacial")
// clase que va a permitir crear los diferfentes tipos de clases
public class Nave {

    // caracteristicas de la clase

    // las 2 sigueintes etiquetas sirven para indicarle a Jpa que este es el
    // id por dpnde debe hacer las busquedas a estas tablas y ademas que
    // va a usar una estrategia de autoincrementacion
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="id")
    private Long idNave;

    @Column (name="empuje")
    private  double empuje;
    @Column (name="potencia")
    private double potencia;
    @Column (name="proposito")
    private String proposito;
    @Column (name="nombre")
    private String nombre;
    @Column (name="tipoCombustible")
    private String tipoCombustible;
    @Column (name="peso")
    private double peso;
    @Column (name="velocidad")
    private double velocidad;
    @Column (name="tipoNave")
    private int tipoNave;

    @Column (name="distanciaEnOrbirta")
    private double distanciaEnOrbirta;
    @Column (name="tiempoEnOnbirta")
    private double tiempoEnOnbirta;

    @Column (name="capacidadPersonas")
    private int capacidadPersonas;
    @Column (name="tipoDeDespliegue")
    private String tipoDeDespliegue;

    // en esta parte se construiran los constructores de esta clase y cada uno de ellos
    // permitirá crear cada uno de los tipos de naves como objetos

    //siempre que usemosconstructores de clase con varios atributos tenemos que declarar
    // de forma explicita el constructor vacio
    public Nave() {

    }

    // constructor para una clase de tipo LANZADERA

    public Nave(double empuje, double potencia, String proposito, String nombre, String tipoCombustible, double peso,
                double velocidad, int tipoNave) {

        this.empuje = empuje;
        this.potencia = potencia;
        this.proposito = proposito;
        this.nombre = nombre;
        this.tipoCombustible = tipoCombustible;
        this.peso = peso;
        this.velocidad = velocidad;
        this.tipoNave = tipoNave;
    }
    // constructor para una clase de tipo NO TRIPILULADA

    public Nave(String proposito, String nombre, String tipoCombustible, double peso, double velocidad,
                double distanciaEnOrbirta, double tiempoEnOnbirta,int tipoNave) {

        this.proposito = proposito;
        this.nombre = nombre;
        this.tipoCombustible = tipoCombustible;
        this.peso = peso;
        this.velocidad = velocidad;
        this.distanciaEnOrbirta = distanciaEnOrbirta;
        this.tiempoEnOnbirta = tiempoEnOnbirta;
        this.tipoNave = tipoNave;
    }

    // constructor para una clase de tipo TRIPILULADA

    public Nave(String proposito, String nombre, String tipoCombustible, double peso, double velocidad, int tipoNave,
                int capacidadPersonas, String tipoDeDespliegue) {

        this.proposito = proposito;
        this.nombre = nombre;
        this.tipoCombustible = tipoCombustible;
        this.peso = peso;
        this.velocidad = velocidad;
        this.tipoNave = tipoNave;
        this.capacidadPersonas = capacidadPersonas;
        this.tipoDeDespliegue = tipoDeDespliegue;
    }

    // ya que los atributos de clase son privados estan encapsulador y la unica forma de po
    // acceder a ellos para conocer sus valores o para modificarlos se debe hacer a trevas
    // de los metodos getter y setter


    public double getEmpuje() {
        return empuje;
    }



    public void setEmpuje(double empuje) {
        this.empuje = empuje;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public String getProposito() {
        return proposito;
    }
    public void setProposito(String proposito) {
        this.proposito = proposito;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public int getTipoNave() {
        return tipoNave;
    }
    public void setTipoNave(int tipoNave) {
        this.tipoNave = tipoNave;
    }
    public double getDistanciaEnOrbirta() {
        return distanciaEnOrbirta;
    }
    public void setDistanciaEnOrbirta(double distanciaEnOrbirta) {
        this.distanciaEnOrbirta = distanciaEnOrbirta;
    }
    public double getTiempoEnOnbirta() {
        return tiempoEnOnbirta;
    }
    public void setTiempoEnOnbirta(double tiempoEnOnbirta) {
        this.tiempoEnOnbirta = tiempoEnOnbirta;
    }
    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }
    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }
    public String getTipoDeDespliegue() {
        return tipoDeDespliegue;
    }
    public void setTipoDeDespliegue(String tipoDeDespliegue) {
        this.tipoDeDespliegue = tipoDeDespliegue;
    }



}

