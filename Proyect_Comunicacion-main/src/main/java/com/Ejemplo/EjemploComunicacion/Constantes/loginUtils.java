package com.Ejemplo.EjemploComunicacion.Constantes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class loginUtils {

    private loginUtils(){

    }
    public static ResponseEntity<String> getResponseEntity(String message, HttpStatus httpstatus){
        return new ResponseEntity<String>("Mensaje: "+message, httpstatus);
    }

}