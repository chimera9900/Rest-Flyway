package com.developer.storesws.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Store {
	
	private String url;
	private UUID uuid;
	private int version;
	
	
	public Store() {
	}
	
	public Store(String url) {
		this.url = url;
	}

	@JsonCreator
	public Store(@JsonProperty("url") String url,
			@JsonProperty("uuid") UUID uuid,
			@JsonProperty("version") int version) {
		this.url = url;
		this.uuid = uuid;
		this.version = version;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public  Store withUuid(UUID uuid) {
		return new Store(url, uuid, version);
		
	}
	public  Store withUrl(String url) {
		return new Store(url, uuid, version);
		
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	

}
