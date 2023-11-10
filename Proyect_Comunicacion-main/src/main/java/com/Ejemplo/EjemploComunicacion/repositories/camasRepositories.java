package com.Ejemplo.EjemploComunicacion.repositories;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.Ejemplo.EjemploComunicacion.domain.camasEntity;

public interface camasRepositories extends CrudRepository<camasEntity, Long> {
    Optional<camasEntity> findById(Long id);

}
