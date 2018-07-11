package hello.repository;

import org.springframework.data.repository.CrudRepository;

import hello.entity.Salesman;

public interface SalesmanRepository extends CrudRepository<Salesman, Long> {

}
