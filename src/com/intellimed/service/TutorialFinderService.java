package com.intellimed.service;

public class TutorialFinderService {
	public String getBestTutorialSite(String language){
		if (language.equals("java")){
			return "Java Online Resources";
		} else {
			return "Language not supported yet!";
		}
	}
}
