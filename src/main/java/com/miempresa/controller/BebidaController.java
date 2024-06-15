package com.miempresa.controller;

import com.miempresa.modelo.Bebida;
import com.miempresa.servicio.BebidaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BebidaController {

    private final BebidaService bebidaService;

    public BebidaController(BebidaService bebidaService) {
        this.bebidaService = bebidaService;
    }

    @GetMapping("/bebidas")
    public String getBebidas(Model model) {
        List<Bebida> bebidas = bebidaService.obtenerBebidas();
        model.addAttribute("bebidas", bebidas);
        return "bebidas"; 
    }
}
