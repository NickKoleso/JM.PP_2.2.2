package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarsController {
    private CarService carService = new CarServiceImpl();
    @GetMapping(value = "/cars")
    public String getCarsPageByCount(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = new ArrayList<>();
        if (count == null) {
            count = carService.getAll().size();
        }
        cars = carService.getAll().stream().limit(count).collect(Collectors.toList());
        model.addAttribute("carsList", cars);
        return "cars";
    }


}
