package com.Ejemplo.EjemploComunicacion.Controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ejemplo.EjemploComunicacion.domain.aseoEntity;
import com.Ejemplo.EjemploComunicacion.repositories.aseoRepositories;


@RestController
@RequestMapping("/api")
public class aseoController {
    private final aseoRepositories aseoR;
    public aseoController(aseoRepositories aseoR){
        this.aseoR= aseoR;
    }

    @GetMapping("/readAseo")
    public String readAseo(){
        return String.valueOf(aseoR.findAll());
    }
    @GetMapping("/readAseo/{id}")
    public Optional<aseoEntity> readAseo(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return aseoR.findById(Long.valueOf(id));
    }


    @GetMapping("/deleteAseo")
    public String deleteAseo(){
        return "Producto eliminado satisfactoriamente";
    }
    @GetMapping("/deleteAseo/{id}")
    public String deleteAseo(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Producto eliminado satisfactoriamente "+id;
    }

    
    @GetMapping("/createAseo")
    public String createAseo(){
        return "Producto creado satisfactoriamente";
    }
    @GetMapping("/createAseo/{id}")
    public String createAseo(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Producto creado satisfactoriamente "+id;
    }
    
    @GetMapping("/updateAseo")
    public String updateAseo(){
        return "Producto actualizado satisfactoriamente";
    }
    @GetMapping("/updateAseo/{id}")
    public String updateAseo(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Producto actualizado satisfactoriamente "+id;
    }
}


