package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private CarService carService;
    @Autowired
    public void carServ(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String allCars(@RequestParam(defaultValue = "5") Integer count, Model model) {
        List<Car> allCars = carService.getCarList(count);
        model.addAttribute("cars", allCars);
        return "cars";
    }

}
