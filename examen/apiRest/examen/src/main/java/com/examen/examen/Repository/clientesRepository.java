package com.examen.examen.Repository;

import com.examen.examen.Document.clientes;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.Serializable;
import java.util.List;

@Repository
@CrossOrigin(value = {})

public interface clientesRepository extends MongoRepository<clientes, Serializable>{

    @RestResource(path = "apellido",rel = "apellido")
    public List<clientes> findByApellidoOrderByNombre(@Param("apellido")String apellido, Pageable pageable);

    @RestResource(path = "borrarPorNombre", rel = "borrarPorNombre")
    public long deleteByNombre(@Param("nombre")String nombre);
}
