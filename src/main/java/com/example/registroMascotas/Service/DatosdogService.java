package com.example.registroMascotas.Service;

import com.example.registroMascotas.entity.Datosdog;
import com.example.registroMascotas.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatosdogService {
    @Autowired
    private DogRepository dogRepository;

    public Datosdog insertar (Datosdog datosdog){
        return dogRepository.save(datosdog);
    }
    public Datosdog actualizar (Datosdog datosdog){
        return dogRepository.save(datosdog);
    }
    public List<Datosdog> listar(){
        return  dogRepository.findAll();
    }
    public void eliminar(Datosdog datosdog){
        dogRepository.delete(datosdog);
    }


}
