package com.Ejemplo.EjemploComunicacion.repositories;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.Ejemplo.EjemploComunicacion.domain.aseoEntity;
import com.Ejemplo.EjemploComunicacion.domain.camasEntity;

public interface aseoRepositories extends CrudRepository<aseoEntity, Long>{
    Optional<aseoEntity> findById(Long id);
}
