package com.Ejemplo.EjemploComunicacion.repositories;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.Ejemplo.EjemploComunicacion.domain.camasEntity;
import com.Ejemplo.EjemploComunicacion.domain.ropaEntity;

public interface ropaRepositories extends CrudRepository<ropaEntity, Long>{
    Optional<ropaEntity> findById(Long id);
}
