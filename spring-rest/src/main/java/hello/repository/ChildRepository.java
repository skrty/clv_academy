package hello.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import hello.entity.Child;

@Component
public class ChildRepository {
	
	private static long last_id;
	
	public Child add(Child child) {
		child.setId(last_id++);
		return child;
	}
	
	public List<Child> getAll() {
		return null;
	}
	
	public void edit(Child child) {
		
	}
	
	public void remove(long id) {
		
	}
}
