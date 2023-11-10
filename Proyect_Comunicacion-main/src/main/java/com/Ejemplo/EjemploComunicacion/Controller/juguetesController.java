package com.Ejemplo.EjemploComunicacion.Controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ejemplo.EjemploComunicacion.domain.aseoEntity;
import com.Ejemplo.EjemploComunicacion.domain.juguetesEntity;
import com.Ejemplo.EjemploComunicacion.repositories.juguetesRepositories;

@RestController
@RequestMapping("/api")
public class juguetesController {
    private final juguetesRepositories juguetesR;
    public juguetesController(juguetesRepositories juguetesR){
        this.juguetesR= juguetesR;
    }

        @GetMapping("/readJuguetes")
    public String readJuguetes(){
        return String.valueOf(juguetesR.findAll());
    }
    @GetMapping("/readJuguetes/{id}")
    public Optional<juguetesEntity> readJuguetes(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return juguetesR.findById(Long.valueOf(id));
    }


    @GetMapping("/deleteJuguetes")
    public String deleteJuguetes(){
        return "Juguete eliminado satisfactoriamente";
    }
    @GetMapping("/deleteJuguetes/{id}")
    public String deleteJuguetes(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Juguete eliminado satisfactoriamente"+id;
    }


    @GetMapping("/createJuguetes")
    public String createJuguetes(){
        return "Juguete creado satisfactoriamente";
    }
    @GetMapping("/createJuguetes/{id}")
    public String createJuguetes(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Juguete creado satisfactoriamente"+id;
    }


    @GetMapping("/updateJuguetes")
    public String updateJuguetess(){
        return "Juguete actializado satisfactoriamente";
    }
    @GetMapping("/updateJuguetes/{id}")
    public String updateJuguetes(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Juguete actualizado satisfactoriamente"+id;
    }


}

