package com.hexa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hexa.model.Bus;

public interface BusRepository extends CrudRepository<Bus,Integer>{
	
	
	  public List<Bus> findByBusLocation(String busLocation); 
	  public List<Bus> findByBusDestination(String busDestination);
	@Query("from Bus where busId>?1 order by busDestination")
	public List<Bus> findBySortedBusDestination(int busId);

}
