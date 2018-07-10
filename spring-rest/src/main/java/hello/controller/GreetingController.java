package hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.entity.Greeting;

@RestController
public class GreetingController {

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="boy") String name) {
		return new Greeting(1, String.format("Hello, %s", name));
	}
}
