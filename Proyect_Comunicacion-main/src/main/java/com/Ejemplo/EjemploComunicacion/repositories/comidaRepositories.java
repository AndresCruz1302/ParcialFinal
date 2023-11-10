package com.Ejemplo.EjemploComunicacion.repositories;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.Ejemplo.EjemploComunicacion.domain.camasEntity;
import com.Ejemplo.EjemploComunicacion.domain.comidaEntity;

public interface comidaRepositories extends CrudRepository<comidaEntity, Long>{
    Optional<comidaEntity> findById(Long id);
}
