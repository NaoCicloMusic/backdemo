package com.example.demo.Controller;

import com.example.demo.Models.Message;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/mensajes")
@CrossOrigin(origins = "http://localhost:4200")
public class MessageController {

    @GetMapping
    public List<Message> listarMensajes() {
        List<Message> mensajes = new ArrayList<>();
        // IMPORTANTE: El orden debe ser (id, nombre, contenido, imagen)
        mensajes.add(new Message(1, "Aaron", "Esta es la descripción del mensaje", "https://picsum.photos/200"));
        mensajes.add(new Message(2, "Julian", "Prueba de imagen con descripción", "https://picsum.photos/201"));
        return mensajes;
    }
}