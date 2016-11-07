package org.launchcode.models.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.launchcode.models.HelloLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface HelloLogDao extends CrudRepository<HelloLog, Integer> {

	public List<HelloLog> findAll();
	
	public HelloLog findByUid(Integer uid);
	
}
