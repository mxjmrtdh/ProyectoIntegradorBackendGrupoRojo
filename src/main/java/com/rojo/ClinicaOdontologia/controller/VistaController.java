package com.rojo.ClinicaOdontologia.controller;

import com.rojo.ClinicaOdontologia.entity.Paciente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.rojo.ClinicaOdontologia.service.impl.PacienteService;

import java.util.Optional;

@Controller
public class VistaController {
//    private PacienteService pacienteService;
//
//    public VistaController(PacienteService pacienteService) {
//        this.pacienteService = pacienteService;
//    }
//
//    @GetMapping("/index")
//    public String buscarPaciente(Model model, @RequestParam Integer id){
//        Optional<Paciente> paciente = pacienteService.buscarPorId(id);
//
//        model.addAttribute("nombre", paciente.get());
//        model.addAttribute("apellido", paciente.getApellido());
//        return "vista/paciente";
//    }
}
