package com.miempresa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.miempresa.modelo.Entrada;
import com.miempresa.servicio.EntradaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class EntradaController {
    private final EntradaService entradaService;

    public EntradaController(EntradaService entradaService) {
        this.entradaService = entradaService;
    }

    @GetMapping("/entradas")
    public String getEntradas(Model model) {
        List<Entrada> entradas = entradaService.obtenerEntradas();
        model.addAttribute("entradas", entradas);
        return "entradas";
    }
}