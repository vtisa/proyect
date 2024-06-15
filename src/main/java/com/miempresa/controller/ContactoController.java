package com.miempresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.miempresa.modelo.Contacto;
import com.miempresa.servicio.ContactoService;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ContactoController {
    private final ContactoService contactoService;

    public ContactoController(ContactoService contactoService) {
        this.contactoService = contactoService;
    }

    @GetMapping("/contacto")
    public ModelAndView mostrarFormularioContacto() {
        ModelAndView modelAndView = new ModelAndView("contacto");
        return modelAndView;
    }

    @PostMapping("/contacto")
    public String procesarFormularioContacto(@ModelAttribute Contacto contacto) {
        contactoService.guardarContacto(contacto);
        return "redirect:/contacto?success=true";
    }
}

