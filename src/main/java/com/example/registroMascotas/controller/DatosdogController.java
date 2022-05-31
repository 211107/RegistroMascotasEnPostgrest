package com.example.registroMascotas.controller;

import com.example.registroMascotas.Service.DatosdogService;
import com.example.registroMascotas.entity.Datosdog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datosdog")
public class DatosdogController {
    @Autowired
    private DatosdogService datosdogService;

    @GetMapping
    public List<Datosdog> listar(){
        return  DatosdogService.listar();
    }
    @PostMapping
    public Datosdog insertar(@RequestBody Datosdog datosdog){
        return DatosdogService.insertar(datosdog);
    }
    @PutMapping
    public Datosdog actualizar(@RequestBody Datosdog datosdog){
        return DatosdogService.actualizar(datosdog);
    }
    @DeleteMapping
    public void eliminar(Datosdog datosdog){
        datosdogService.eliminar(datosdog);
    }

}
