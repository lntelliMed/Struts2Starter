package com.intellimed.action;

import com.intellimed.service.TutorialFinderService;

public class TutorialAction {
	private String bestTutorialSite;
	private String language;
	
	
	public String execute(){
		//System.out.println(">>> Hello from execute()");
		//return "failure";
		
		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		//System.out.println(">>>> Language: " + getLanguage());
		 setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
		//System.out.println(bestTutorialSite);
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
