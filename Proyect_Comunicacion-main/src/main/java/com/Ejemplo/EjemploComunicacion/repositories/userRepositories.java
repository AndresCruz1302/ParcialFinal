package com.Ejemplo.EjemploComunicacion.repositories;

import com.Ejemplo.EjemploComunicacion.domain.userEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface userRepositories extends CrudRepository<userEntity, Long>{
    
    userEntity findByEmail(@Param(("email")) String email);

}
