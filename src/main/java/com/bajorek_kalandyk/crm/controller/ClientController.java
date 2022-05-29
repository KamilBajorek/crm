package com.bajorek_kalandyk.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController
{

    @GetMapping("/clients")
    public String clientList(Model model)
    {
        return "Clients";
    }
}