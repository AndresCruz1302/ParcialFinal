package com.Ejemplo.EjemploComunicacion.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.Ejemplo.EjemploComunicacion.domain.combosEntity;
import com.Ejemplo.EjemploComunicacion.repositories.combosRepositories;

public class combosController {
        private final combosRepositories combosR;
    @Autowired
    public combosController(combosRepositories combosR){
        this.combosR=combosR;
    }

    @GetMapping("/readCombos")
    public String readCombos(){
        return String.valueOf(combosR.findAll());
    }
    @GetMapping("/readCombos/{id}")
    public Optional<combosEntity> readCombos(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return combosR.findById(Long.valueOf(id));
    }


    @GetMapping("/deleteCombos")
    public String deleteCombos(){
        return "Combo eliminada satisfactoriamente";
    }
    @GetMapping("/deleteCombos/{id}")
    public String deleteCombos(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Combo borrado satisfactoriamente "+id;
    }


    @GetMapping("/createCombos")
    public ResponseEntity<combosEntity> createComboss(@RequestBody combosEntity combosAdd){
        combosEntity comboAgregado= combosR.save(combosAdd);
        return new ResponseEntity<>(comboAgregado, HttpStatus.CREATED);
    }
    
    @GetMapping("/updateCombos")
    public String updateComboss(){
        return "Combo actializado satisfactoriamente";
    }
    @GetMapping("/updateComboss/{id}")
    public String updateComboss(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Combo actualizado satisfactoriamente "+id;
    }
}
