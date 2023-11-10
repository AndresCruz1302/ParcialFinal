package com.Ejemplo.EjemploComunicacion.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class camasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String size;
    private String tipo;
    private Integer precio;
    private String color;
    private String marca;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public camasEntity(String nombre, String size, String tipo, Integer precio, String color, String marca) {
        this.nombre = nombre;
        this.size = size;
        this.tipo = tipo;
        this.precio = precio;
        this.color = color;
        this.marca = marca;
    }
    public camasEntity() {
     
    }
    @Override
    public String toString() {
        return "camasEntity [id=" + id + ", nombre=" + nombre + ", size=" + size + ", tipo=" + tipo + ", precio="
                + precio + ", color=" + color + ", marca=" + marca + "]";
    }
}
