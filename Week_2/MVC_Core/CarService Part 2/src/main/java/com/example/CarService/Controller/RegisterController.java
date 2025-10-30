package com.example.CarService.Controller;

import com.example.CarService.domain.Car;
import com.example.CarService.domain.Vehicle;
import com.example.CarService.service.CarRegistrationService;
import com.example.CarService.service.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
    @Autowired
    Registration registration;

/**
 1. Modify the below function.
 2. getRegistrationPage method accepts Model as argument.
**/

    @RequestMapping("/register")
    public String getRegistrationPage(Model uiModel){
        Vehicle vehicle = registration.getNewCar();
        uiModel.addAttribute("vehicle", vehicle);
        return "carregister";
    }


  /*
   1. getResponsePage method uses registerCar() method to register the car submitted from carregsiter.jsp.
   2. It should return "success" if registerCar() return true else it should return "carregister".
   3. getResponsePage method uses @ModelAttribute annotation to bind data with reference to car domain.
  */
    @RequestMapping("/done")
    public String getResponsePage(@ModelAttribute(value="vehicle") Car car){
        //Write your logic here
        if (car.getRegisterationNumber() == null || car.getRegisterationNumber().isEmpty() ||
                car.getCarName() == null || car.getCarName().isEmpty() ||
                car.getCarDetails() == null || car.getCarDetails().isEmpty() ||
                car.getCarWork() == null || car.getCarWork().isEmpty()) {
            return "carregister";
        }

        if (registration.registerCar(car.getRegisterationNumber(), car.getCarName(), car.getCarDetails(), car.getCarWork())) {
            return "success";
        }
        return "carregister";
    }
}
