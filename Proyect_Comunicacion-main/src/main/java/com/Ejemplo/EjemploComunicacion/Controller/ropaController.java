package com.Ejemplo.EjemploComunicacion.Controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Ejemplo.EjemploComunicacion.domain.ropaEntity;
import com.Ejemplo.EjemploComunicacion.repositories.ropaRepositories;

@RestController
@RequestMapping("/api")
public class ropaController {
    private final ropaRepositories ropaR;
    public ropaController(ropaRepositories ropaR){
        this.ropaR= ropaR;
    }

        @GetMapping("/readRopa")
    public String readCamas(){
        return String.valueOf(ropaR.findAll());
    }
    @GetMapping("/readRopa/{id}")
    public Optional<ropaEntity> readRopa(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return ropaR.findById(Long.valueOf(id));
    }


    @GetMapping("/deleteRopa")
    public String deleteRopa(){
        return "Ropa eliminada satisfactoriamente";
    }
    @GetMapping("/deleteRopa/{id}")
    public String deleteRopa(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Ropa eliminada satisfactoriamente"+id;
    }


    @GetMapping("/createRopa")
    public String createRopa(){
        return "Ropa creada satisfactoriamente";
    }
    @GetMapping("/updateRopa")
    public String updateRopa(){
        return "Ropa actializada satisfactoriamente";
    }
}


