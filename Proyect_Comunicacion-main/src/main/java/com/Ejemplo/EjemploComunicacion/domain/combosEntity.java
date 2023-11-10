package com.Ejemplo.EjemploComunicacion.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class combosEntity {
    private String nombre;
    @Id
    private Long id;
    private Integer precio;
    private Float descuento;
    private Long idp1;
    private Long idp2;
    private Long idp3;
    @Override
    public String toString() {
        return "combosEntity [nombre=" + nombre + ", id=" + id + ", precio=" + precio + ", descuento=" + descuento
                + ", idp1=" + idp1 + ", idp2=" + idp2 + ", idp3=" + idp3 + "]";
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public Float getDescuento() {
        return descuento;
    }
    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }
    public Long getIdp1() {
        return idp1;
    }
    public void setIdp1(Long idp1) {
        this.idp1 = idp1;
    }
    public Long getIdp2() {
        return idp2;
    }
    public void setIdp2(Long idp2) {
        this.idp2 = idp2;
    }
    public Long getIdp3() {
        return idp3;
    }
    public void setIdp3(Long idp3) {
        this.idp3 = idp3;
    }
    public combosEntity(String nombre, Integer precio, Float descuento, Long idp1, Long idp2, Long idp3) {
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
        this.idp1 = idp1;
        this.idp2 = idp2;
        this.idp3 = idp3;
    }
     public combosEntity(){
     
        
     }
}
