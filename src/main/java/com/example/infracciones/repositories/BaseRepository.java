package com.example.infracciones.repositories;

import com.example.infracciones.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean // no implementa la interfaz
public interface BaseRepository< E extends Base, ID extends Serializable> extends JpaRepository<E, ID>{

}

