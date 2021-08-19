package com.cenfotec.tercerexamenparcial.sucondofeliz.repository;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Condominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.EstadoDeCondominio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioDeCondominio extends JpaRepository<Condominio, Long> {

    List<Condominio> findAllByEstadoEquals(EstadoDeCondominio estadoDeCondominio);
}
