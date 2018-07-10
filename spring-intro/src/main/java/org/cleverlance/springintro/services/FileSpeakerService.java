package org.cleverlance.springintro.services;

import java.io.FileWriter;
import java.io.IOException;

import org.cleverlance.springintro.interf.ISpeaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FileSpeakerService implements ISpeaker {
	/* (non-Javadoc)
	 * @see org.cleverlance.springintro.ISpeaker#speak(java.lang.String)
	 */
	
	@Value("${speaker.log.path}")
	String logPath;
	
	@Value("${speaker.log.name}")
	String logName;
	
	@Override
	public void speak(String text) {
		FileWriter fw;
		try {
			fw = new FileWriter(logPath + logName, true);
			fw.write(text + "\n");
			fw.flush();
		} catch (IOException e) {
			System.out.println("Log cannot be written.");
			e.printStackTrace();
		}
	}
}
