package com.Ejemplo.EjemploComunicacion.repositories;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.Ejemplo.EjemploComunicacion.domain.camasEntity;
import com.Ejemplo.EjemploComunicacion.domain.juguetesEntity;

public interface juguetesRepositories extends CrudRepository<juguetesEntity, Long> {
    Optional<juguetesEntity> findById(Long id);
}
