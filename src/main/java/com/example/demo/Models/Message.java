package com.example.demo.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private int id;
    private String name;
    private String content;  // Aquí se guardará lo que escribas en "Descripción"
    private String imageUrl; // Aquí se guardará el enlace de la "Imagen"
}