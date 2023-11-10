package com.Ejemplo.EjemploComunicacion.Controller;

import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ejemplo.EjemploComunicacion.domain.camasEntity;
import com.Ejemplo.EjemploComunicacion.repositories.camasRepositories;

@RestController
@RequestMapping("/api")
public class camasController {
    private final camasRepositories camasR;
    @Autowired
    public camasController(camasRepositories camasR){
        this.camasR=camasR;
    }

    @GetMapping("/readCamas")
    public String readCamas(){
        return String.valueOf(camasR.findAll());
    }
    @GetMapping("/readCamas/{id}")
    public Optional<camasEntity> readCamas(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return camasR.findById(Long.valueOf(id));
    }


    @GetMapping("/deleteCama")
    public String deleteCamas(){
        return "Cama eliminada satisfactoriamente";
    }
    @GetMapping("/deleteCamas/{id}")
    public String deleteCamas(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Cama borrada satisfactoriamente "+id;
    }


    @GetMapping("/createCama")
    public ResponseEntity<camasEntity> createCamas(@RequestBody camasEntity camaAdd){
        camasEntity camaAgregada= camasR.save(camaAdd);
        return new ResponseEntity<>(camaAgregada, HttpStatus.CREATED);
    }
    
    @GetMapping("/updateCama")
    public String updateCamas(){
        return "Cama actializada satisfactoriamente";
    }
    @GetMapping("/updateCamas/{id}")
    public String updateCamas(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Cama actualizada satisfactoriamente "+id;
    }


}
