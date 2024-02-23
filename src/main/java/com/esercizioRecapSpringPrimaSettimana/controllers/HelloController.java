package com.esercizioRecapSpringPrimaSettimana.controllers;

import com.esercizioRecapSpringPrimaSettimana.entites.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
    @GetMapping("/name")
    public String sayname(@RequestParam String name){
        return "nome: " + name;
    }
    @GetMapping("/name/{surname}")
    public String saysurname(@PathVariable String surname){
        return "nome: " + surname;
    }
    @GetMapping("/user")
    public User returnUser(@RequestBody User user){
        return user;
    }

}
