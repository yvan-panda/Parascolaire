package com.zsmart.parascolaire.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zsmart.parascolaire.bean.Mandat;

@Repository
public interface MondatDao extends JpaRepository<Mandat, Long> {

}
