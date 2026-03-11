package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Models.Message;

@RestController
@RequestMapping("/api/mensajes")
@CrossOrigin(origins = "http://localhost:4200")
public class MessageController {
    private List<Message> mensajes = new ArrayList<>();

    public MessageController() {
        // Solo Aaron y Julian
        mensajes.add(new Message(1, "23640278", "Aaron", "¡Hola, mi backend ya funciona!"));
        mensajes.add(new Message(2, "23640095", "Julian", "Conexión exitosa entre ambos."));
    }

    @GetMapping
    public List<Message> despliegueMensajes() {
        return mensajes;
    }
}