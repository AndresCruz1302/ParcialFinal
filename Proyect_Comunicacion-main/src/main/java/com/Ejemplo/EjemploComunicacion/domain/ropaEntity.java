package com.Ejemplo.EjemploComunicacion.domain;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ropaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marca;
    private Integer precio;
    private String razaAnimal;
    private String tipoAnimal;
    private String color;
    private String tipoAtuendo;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public String getRazaAnimal() {
        return razaAnimal;
    }
    public void setRazaAnimal(String razaAnimal) {
        this.razaAnimal = razaAnimal;
    }
    public String getTipoAnimal() {
        return tipoAnimal;
    }
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTipoAtuendo() {
        return tipoAtuendo;
    }
    public void setTipoAtuendo(String tipoAtuendo) {
        this.tipoAtuendo = tipoAtuendo;
    }
    public ropaEntity(String marca, Integer precio, String razaAnimal, String tipoAnimal, String color, String tipoAtuendo) {
        this.marca = marca;
        this.precio = precio;
        this.razaAnimal = razaAnimal;
        this.tipoAnimal = tipoAnimal;
        this.color = color;
        this.tipoAtuendo = tipoAtuendo;
    }
    public ropaEntity() {
    }
    @Override
    public String toString() {
        return "ropa [id=" + id + ", marca=" + marca + ", precio=" + precio + ", razaAnimal=" + razaAnimal
                + ", tipoAnimal=" + tipoAnimal + ", color=" + color + ", tipoAtuendo=" + tipoAtuendo + "]";
    }


}
