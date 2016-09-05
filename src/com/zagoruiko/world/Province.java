package com.zagoruiko.world;

public class Province {
	
	public Province(String name, String shortName, Country country) {
		this.name = name;
		this.shortName = shortName;
		this.country = country;
	}
	
	public String getName(){
		String result = name;
		return result;
	}
	
	public String getShortName(){
		String result = shortName;
		return result;
	}
	
	public Country getCountry(){
		Country result = country;
		return result;
	}
	
	private String name;
	private String shortName;
	private Country country;
}
