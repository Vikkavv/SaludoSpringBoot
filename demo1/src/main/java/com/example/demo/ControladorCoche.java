package com.example.demo;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coches")
public class ControladorCoche {
    @GetMapping("/coche")
    public ResponseEntity<Coche> obtenerCoche() {
        Coche coche = new Coche("Mercedes", "Deportivo", "Negro obisdiana", "Gasolina",300, 1200);
        return ResponseEntity.ok(coche);
    }

    @PostMapping("/coche")
    public ResponseEntity<Coche> ejemploCoche(@RequestBody Coche coche) {
        System.out.println(coche);
        return ResponseEntity.ok(coche);
    }
}
