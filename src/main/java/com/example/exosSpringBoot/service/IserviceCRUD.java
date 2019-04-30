package com.example.exosSpringBoot.service;

import java.util.List;

public interface IserviceCRUD<T> {

	T findOneById(Long id);
	T save(T t);
	void delete(T t);
	List<T> getAll();
}
