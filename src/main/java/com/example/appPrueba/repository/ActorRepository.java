package com.example.appPrueba.repository;

import com.example.appPrueba.domain.model.Actor;
import com.example.appPrueba.domain.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ActorRepository extends JpaRepository<Actor, UUID> {
}
