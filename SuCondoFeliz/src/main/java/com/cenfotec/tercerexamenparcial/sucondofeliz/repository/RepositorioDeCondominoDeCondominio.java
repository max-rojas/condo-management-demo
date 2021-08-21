package com.cenfotec.tercerexamenparcial.sucondofeliz.repository;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Condominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.CondominoDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.EstadoDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.EstadoDeCondominoDeCondominio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioDeCondominoDeCondominio extends JpaRepository<CondominoDeCondominio, Long>  {

    List<CondominoDeCondominio> findAllByCondominio_Id(Long id);
}
