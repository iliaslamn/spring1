package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] tab = 
		{ "Sourat al kahf",
		  "Sourat yacin",
		  "Sourat al bakara"
	     };
	
	  Random myRandom = new Random();
	  	  
@Override
	public String getFortune() {
		String valeur;
		int index = myRandom.nextInt(tab.length)+1;
		valeur = tab[index];
		return valeur;
	}
}
