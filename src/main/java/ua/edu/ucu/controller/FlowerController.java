package ua.edu.ucu.controller;

import org.springframework.web.bind.annotation.*;
import ua.edu.ucu.model.Flower;
import ua.edu.ucu.model.FlowerColor;
import ua.edu.ucu.model.FlowerType;

import java.util.List;

@RestController //ability to work by httpzators (get, post...)
@RequestMapping("/api/v1")//шлях до запиту
public class FlowerController {

    @GetMapping("/flower")
    public List<Flower> getFlower(){
        return List.of(new Flower(FlowerColor.RED, FlowerType.ROSE, 10, 10));
    }

}
