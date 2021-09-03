package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import web.dao.CarDao;


@Controller
public class CarsController {

    private final CarDao carDao;
    @Autowired
    public CarsController(CarDao carDao) {
        this.carDao = carDao;
    }


    @GetMapping("/cars")
    public String getCarsPageByCount(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("carList", carDao.getCars(count));
        return "cars";
    }
}
