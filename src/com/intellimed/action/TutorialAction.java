package com.intellimed.action;

import com.intellimed.service.TutorialFinderService;

public class TutorialAction {
	private String bestTutorialSite;
	
	public String execute(){
		//System.out.println(">>> Hello from execute()");
		//return "failure";
		
		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		 setBestTutorialSite(tutorialFinderService.getBestTutorialSite());
		//System.out.println(bestTutorialSite);
		return "success";
	}

	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}
	
	
}
