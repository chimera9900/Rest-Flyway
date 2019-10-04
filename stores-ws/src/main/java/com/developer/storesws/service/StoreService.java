package com.developer.storesws.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developer.storesws.StoreDao;
import com.developer.storesws.model.Store;

@Service
public class StoreService {
	@Autowired
	StoreDao storeDao;
	
	public UUID addStore(Store store) {
		Store save = storeDao.save(store);
		return save.getUuid();
		
	}
	
	public Store find(UUID id) {
		return Optional.of(storeDao.findByUuid(id))
				.orElseThrow(() -> new NoSuchElementException());
	}
	
	public Collection<Store> findAll() {
		Collection<Store> list = new ArrayList<Store>();
		storeDao.findAll().forEach(x -> list.add(x));
		return list;
}
	
	public Store updateStore(UUID id, Store store) {
		find(id);
		return storeDao.save(store.withUuid(id));
	}

	public void remove(UUID id) {
		find(id);
		storeDao.delete(find(id));
	}
}