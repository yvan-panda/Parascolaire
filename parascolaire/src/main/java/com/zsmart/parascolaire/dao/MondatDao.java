package com.zsmart.parascolaire.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zsmart.parascolaire.bean.Mondat;

@Repository
public interface MondatDao extends JpaRepository<Mondat, Long> {

}
