package com.ejemplo.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/apiSaludos")
public class SaludoController {

    @GetMapping("/saludo")
    public String HolaMundo() {
    return "Hola Mundo!";
    }

    @GetMapping("/saludoNombre/{nombre}/{edad}")
    public String HolaMundoNombre(@PathVariable String nombre, @PathVariable String edad) {
    return "Hola " + nombre + "! Tu edad es: " + edad + " años";
    }
}
