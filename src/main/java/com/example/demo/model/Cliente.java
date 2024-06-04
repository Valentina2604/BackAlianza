package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cliente {
    private Long id;
    private String nombre;
    private String sharedKey;
    private String email;
    private String telefono;
}
