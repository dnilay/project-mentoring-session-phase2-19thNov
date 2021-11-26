package com.example.helloworldrestapi.repo;

import com.example.helloworldrestapi.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository extends JpaRepository<Beer,Integer> {
}
