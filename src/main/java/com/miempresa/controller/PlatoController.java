package com.miempresa.controller;

import com.miempresa.modelo.Plato;
import com.miempresa.servicio.PlatoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class PlatoController {
    private final PlatoService platoService;

    public PlatoController(PlatoService platoService) {
        this.platoService = platoService;
    }

    @GetMapping("/platos")
    public String getPlatos(Model model) {
        List<Plato> platos = platoService.obtenerPlatos();
        model.addAttribute("platos", platos);
        return "platos";
    }
}