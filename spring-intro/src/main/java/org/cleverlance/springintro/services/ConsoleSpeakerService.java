package org.cleverlance.springintro.services;

import org.cleverlance.springintro.interf.ISpeaker;
import org.springframework.stereotype.Component;

@Component
public class ConsoleSpeakerService implements ISpeaker {
	/* (non-Javadoc)
	 * @see org.cleverlance.springintro.ISpeaker#speak(java.lang.String)
	 */
	@Override
	public void speak(String text) {
		System.out.println("(speaker service: )" + text);
	}
}
