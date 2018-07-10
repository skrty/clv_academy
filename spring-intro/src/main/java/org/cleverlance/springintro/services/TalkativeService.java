package org.cleverlance.springintro.services;

import org.cleverlance.springintro.interf.IService;
import org.cleverlance.springintro.interf.ISpeaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class TalkativeService implements IService {

	private String name;
	
	@Autowired
	private ISpeaker speakerService;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void Yell(String text) {
		Assert.notNull(text, "Text can not be null.");
		
		for (int i = 0; i < 5; i++) {
			speakerService.speak("HEY " + name + ": " + text.toUpperCase());
		}
	}

	@Override
	public void Say(String text) {
		for (int i = 0; i < 5; i++) {
			speakerService.speak("Hey " + name + ": " + text);
		}
	}

}
