package com.Ejemplo.EjemploComunicacion.domain;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class juguetesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marca;
    private Integer precio;
    private String razaAnimal;
    private String tipoAnimal;
    private String tipoJuguete;
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
    public String getTipoJuguete() {
        return tipoJuguete;
    }
    public void setTipoJuguete(String tipoJuguete) {
        this.tipoJuguete = tipoJuguete;
    }
    public juguetesEntity(String marca, Integer precio, String razaAnimal, String tipoAnimal, String tipoJuguete) {
        this.marca = marca;
        this.precio = precio;
        this.razaAnimal = razaAnimal;
        this.tipoAnimal = tipoAnimal;
        this.tipoJuguete = tipoJuguete;
    }
    public juguetesEntity() {
    }
    @Override
    public String toString() {
        return "juguetes [id=" + id + ", marca=" + marca + ", precio=" + precio + ", razaAnimal=" + razaAnimal
                + ", tipoAnimal=" + tipoAnimal + ", tipoJuguete=" + tipoJuguete + "]";
    }
}
