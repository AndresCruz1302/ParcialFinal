package com.Ejemplo.EjemploComunicacion.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Ejemplo.EjemploComunicacion.Constantes.loginCodes;
import com.Ejemplo.EjemploComunicacion.Constantes.loginUtils;
import com.Ejemplo.EjemploComunicacion.repositories.userRepositories;
import com.Ejemplo.EjemploComunicacion.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@RestController
@RequestMapping("/v1")
public class SignUpController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> registroUsuario(@RequestBody(required = true) Map<String, String> requestMap) {
        try {
            userService.SignUp(requestMap);
            return loginUtils.getResponseEntity(loginCodes.SUCCESS, HttpStatus.CREATED);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return loginUtils.getResponseEntity(loginCodes.SOMETHING_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}