package com.dev.backend.controller;

import com.dev.backend.entity.Estado;
import com.dev.backend.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Hello {

    @GetMapping
    public String hello(){
        return "Olá mundo Spring" + new Date();
    }

}
