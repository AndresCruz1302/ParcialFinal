package com.Ejemplo.EjemploComunicacion.service.impl;

import com.Ejemplo.EjemploComunicacion.Constantes.loginCodes;
import com.Ejemplo.EjemploComunicacion.Constantes.loginUtils;
import com.Ejemplo.EjemploComunicacion.domain.userEntity;
import com.Ejemplo.EjemploComunicacion.repositories.userRepositories;
import com.Ejemplo.EjemploComunicacion.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.Objects;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private userRepositories UserDao;

    @Override
    public ResponseEntity<String> SignUp(Map<String, String> requestMap) {
        log.info("Registro de usuario {}", requestMap);
        try {
            if (validateSignUpMap(requestMap)) {
                userEntity user = UserDao.findByEmail(requestMap.get("email"));
                if (Objects.isNull(user)) {
                    UserDao.save(getUserFromMap(requestMap));
                    return loginUtils.getResponseEntity(loginCodes.SUCCESS, HttpStatus.CREATED);
                } else {
                    return loginUtils.getResponseEntity("Usuario ya existe!!", HttpStatus.CREATED);
                }
            } else {
                return loginUtils.getResponseEntity(loginCodes.INVALID_DATA, HttpStatus.BAD_REQUEST);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return loginUtils.getResponseEntity(loginCodes.INVALID_DATA, HttpStatus.BAD_REQUEST);
    }

    private boolean validateSignUpMap(Map<String, String> requestMap) {
        if (requestMap.containsKey("nombre") && requestMap.containsKey("email") && requestMap.containsValue("status")
                && requestMap.containsValue("password") && requestMap.containsValue("role")) {
            return true;
        } else {
            return false;
        }
    }

    private userEntity getUserFromMap(Map<String, String> requestMap) {
        userEntity User = new userEntity();
        User.setName(requestMap.get("nombre"));
        User.setEmail(requestMap.get("email"));
        User.setPassword(requestMap.get("password"));
        User.setStatus(requestMap.get("status"));
        User.setRole(requestMap.get("role"));
        return User;
    }
}