package com.Ejemplo.EjemploComunicacion.domain;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class comidaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marca;
    private Integer precio;
    private String razaAnimal;
    private String tipoAnimal;
    private String tamaño;
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
    public String getTamaño() {
        return tamaño;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public comidaEntity(String marca, Integer precio, String razaAnimal, String tipoAnimal, String tamaño) {
        this.marca = marca;
        this.precio = precio;
        this.razaAnimal = razaAnimal;
        this.tipoAnimal = tipoAnimal;
        this.tamaño = tamaño;
    }
    public comidaEntity() {
    }
    @Override
    public String toString() {
        return "comida [id=" + id + ", marca=" + marca + ", precio=" + precio + ", razaAnimal=" + razaAnimal
                + ", tipoAnimal=" + tipoAnimal + ", tamaño=" + tamaño + "]";
    }
}
