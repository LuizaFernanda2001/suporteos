package com.curso.repositories;

import org.springframework.stereotype.Repository;

import com.curso.domains.Person;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface PersonRepository extends JpaRepository<Person, UUID>{

}
