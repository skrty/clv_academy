package org.cleverlance.springintro;

import org.cleverlance.springintro.interf.IService;
import org.cleverlance.springintro.services.TalkativeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIntroApplication {
	
	public static void main(String[] args) {
		ApplicationContext appCtx = SpringApplication.run(SpringIntroApplication.class, args);
		IService service = appCtx.getBean(IService.class);
		TalkativeService service2 = appCtx.getBean(TalkativeService.class);
		service2.setName("Johnny");
		service.Say("Hello");
		service2.Yell("burn");
		
	}
}
