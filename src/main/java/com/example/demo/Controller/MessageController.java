package com.example.demo.Controller;

import com.example.demo.Models.Message;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/mensajes")
@CrossOrigin(origins = "http://localhost:4200")
public class MessageController {

    // Usamos 'static' para que la lista persista mientras el servidor esté encendido
    private static List<Message> mensajes = new ArrayList<>();

    // Bloque estático para inicializar datos de prueba una sola vez
    static {
        mensajes.add(new Message(1, "Aaron", "Bienvenido al sistema de mensajes.", "https://picsum.photos/200"));
        mensajes.add(new Message(2, "Julian", "Este es un mensaje de prueba con imagen.", "https://picsum.photos/201"));
    }

    @GetMapping
    public List<Message> listarMensajes() {
        return mensajes;
    }

    @PostMapping
    public Message crearMensaje(@RequestBody Message nuevoMensaje) {
        // Generamos un ID simple basado en el tamaño de la lista
        int nuevoId = mensajes.isEmpty() ? 1 : mensajes.get(mensajes.size() - 1).getId() + 1;
        nuevoMensaje.setId(nuevoId);
        
        mensajes.add(nuevoMensaje);
        System.out.println("Mensaje guardado: " + nuevoMensaje.getName());
        return nuevoMensaje;
    }
}