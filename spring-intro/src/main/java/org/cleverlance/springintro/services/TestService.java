package org.cleverlance.springintro.services;

import org.cleverlance.springintro.interf.IService;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

//@Component
public class TestService implements IService {

	@Override
	public void Yell(String text) {
		Assert.notNull(text, "Text can not be null.");
		
		System.out.println("HEY " + text.toUpperCase());
	}

	@Override
	public void Say(String text) {
		System.out.println("Hey: " + text);
		
	}

}
