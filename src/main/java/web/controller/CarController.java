package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Dao.CarDao;
import web.Service.CarService;
import web.Service.CarServiceImpl;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping("")
    public String limitedCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        CarServiceImpl carService = new CarServiceImpl();
        List<String> messages = new ArrayList<>();
        if(count != null) {
            for(Car car: carService.getLimitedCars(count)) {
                messages.add(car.toString());
            }
        } else {
            for(Car car: carService.getCars()) {
                messages.add(car.toString());
                model.addAttribute("message", messages);
            }
        }
        model.addAttribute("message", messages);
        return "cars";
    }

}
