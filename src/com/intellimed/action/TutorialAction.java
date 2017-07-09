package com.intellimed.action;

import com.intellimed.service.TutorialFinderService;

public class TutorialAction {
	private String bestTutorialSite;
	private String language;
	
	//Rename execute method and configure the struts.xml accordingly!
	//public String execute(){
	public String getTutorial(){

		//System.out.println(">>> Hello from execute()");
		//return "failure";
		
		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		//System.out.println(">>>> Language: " + getLanguage());
		 setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
		//System.out.println(bestTutorialSite);
		 
		System.out.println(">>> getTutorial has been executed..");
		return "success";
	}
	
	public String addTutorial(){
		System.out.println(">>> addTutorial has been executed..");
		return "success";
	}

	public String editTutorial(){
		System.out.println(">>> editTutorial has been executed..");
		return "success";
	}
	
	public String deleteTutorial(){
		System.out.println(">>> deleteTutorial has been executed..");
		return "success";
	}
	
	
	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
