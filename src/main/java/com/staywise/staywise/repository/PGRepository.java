package com.staywise.staywise.repository;

import com.staywise.staywise.entity.PG;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PGRepository extends JpaRepository<PG,Long> {

    List<PG> findByCityContainingIgnoreCase(String city);
}