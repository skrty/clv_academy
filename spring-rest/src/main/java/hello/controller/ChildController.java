package hello.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.entity.Child;
import hello.entity.Gender;
import hello.entity.Greeting;
import hello.repository.ChildRepository;

@RestController
public class ChildController {

	@Autowired
	ChildRepository childRepository;
	
	@RequestMapping("/children")
	public List<Child> getAll() {
		return childRepository.getAll();
	}
	
	@RequestMapping("/children/add")
	public Child add(@RequestParam(value = "firstName") String firstName, 
			@RequestParam(value = "lastName") String lastName,
			@RequestParam(value = "birthNumber") String birthNumber,
			@RequestParam(value = "allergies") String allergies,
			@RequestParam(value = "gender") String gender) {
		
		List<String> parsedAllergies = Arrays.asList(allergies.split(",")); 
		Gender parsedGender = Gender.valueOf(gender);
		return childRepository.add(new Child(firstName, lastName, birthNumber, parsedAllergies, parsedGender));
	}
}
