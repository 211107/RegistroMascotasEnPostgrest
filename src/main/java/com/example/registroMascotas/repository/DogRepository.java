package com.example.registroMascotas.repository;

import com.example.registroMascotas.entity.Datosdog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Datosdog,Integer> {
}
