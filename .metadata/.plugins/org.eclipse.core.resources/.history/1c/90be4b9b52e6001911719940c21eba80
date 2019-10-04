package com.developer.storesws;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.developer.storesws.model.Store;

@Repository
public interface StoreDao extends CrudRepository<Store, UUID>  {
	
	Store findByUuid(UUID uuid);

}
