package com.cenfotec.tercerexamenparcial.sucondofeliz.repository;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Amenidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioDeAmenidad extends JpaRepository<Amenidad, Long> {
}
