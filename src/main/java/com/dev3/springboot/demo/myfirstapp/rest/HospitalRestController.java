package com.dev3.springboot.demo.myfirstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalRestController {

    //expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    //expose a new endpoint for "patient"
    @GetMapping("/patient")
    public String getPatient() {
        return "Get well soon!";
    }

    //expose a new endpoint for "doctor"

     @GetMapping("/doctor")
     public String getDoctor(){
         return "The best doctor in the branch.";
     }

     //inject properties for: doctor.name and clinic.name

     @Value("${doctor.name}")
     private String doctorName;

     @Value("${clinic.name}")
     private String clinicName;

     //expose new endpoint for "clinicinfo"
     @GetMapping("/clinicinfo")
     public String getClinicInfo(){
         return "Doctor: " + doctorName + ", Clinic name: " + clinicName;
     }


}
