package com.example.demo.Controller;

import com.example.demo.Models.Message;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/mensajes") // Antes decía /mensaje, ahora coincide con el front
@CrossOrigin(origins = "http://localhost:4200") // Permiso para tu página de Angular
public class MessageController {

    @GetMapping
    public List<Message> listarMensajes() {
        List<Message> mensajes = new ArrayList<>();
        // Datos de prueba para que veas que sí carga
        mensajes.add(new Message(1, "Aaron", "aaron@correo.com", "¡Ya funciona el backend!"));
        mensajes.add(new Message(2, "Julian", "julian@correo.com", "Conexión exitosa."));
        return mensajes;
    }
}               