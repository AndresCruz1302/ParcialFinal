package com.Ejemplo.EjemploComunicacion.Controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ejemplo.EjemploComunicacion.domain.aseoEntity;
import com.Ejemplo.EjemploComunicacion.domain.comidaEntity;
import com.Ejemplo.EjemploComunicacion.repositories.comidaRepositories;

@RestController
@RequestMapping("/api")
public class comidaController {
    private final comidaRepositories comidaR;
    public comidaController(comidaRepositories comidaR){
        this.comidaR= comidaR;
    }


    @GetMapping("/readComida")
    public String readCamas(){
        return String.valueOf(comidaR.findAll());
    }
    @GetMapping("/readComida/{id}")
    public Optional<comidaEntity> readComida(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return comidaR.findById(Long.valueOf(id));
    }
    

    @GetMapping("/deleteComida")
    public String deleteComida(){
        return "Comida eliminada satisfactoriamente";
    }
    @GetMapping("/deleteComida/{id}")
    public String deleteComida(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Comida eliminada satisfactoriamente "+id;
    }


    @GetMapping("/createComida")
    public String createComida(){
        return "Comida creada satisfactoriamente";
    }
    @GetMapping("/createComida/{id}")
    public String createComida(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Comida creada satisfactoriamente "+id;
    }


    @GetMapping("/updateComida")
    public String updateComida(){
        return "Comida actializada satisfactoriamente";
    }
    @GetMapping("/updateComida/{id}")
    public String updateComida(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Comida actualizada satisfactoriamente "+id;
    }


}


