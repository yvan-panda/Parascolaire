package com.zsmart.parascolaire.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zsmart.parascolaire.bean.Club;

@Repository
public interface ClubDao extends JpaRepository<Club, Long>{
	
	

}
