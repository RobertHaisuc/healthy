package com.healty.controller;

import com.healty.models.Doctor;
import com.healty.models.Speciality;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class DoctorsController {


    @GetMapping("/doctors")
    public Doctor getDoctorDetails( final String name){
        return null;
    }

    @PostMapping("/doctors")
    public List<Doctor> getDoctorsBySpeciality(@RequestBody final Speciality speciality){
        return null;
    }
}
