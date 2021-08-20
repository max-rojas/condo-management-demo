package com.cenfotec.tercerexamenparcial.sucondofeliz.repository;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Condominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.CuotaCondominal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioDeCuotaCondominal extends JpaRepository<CuotaCondominal, Long>  {

    List<CuotaCondominal> findAllByCondominio_Id(Long id);
}
