package mx.ipn.escom.ProyectoFinal.Controllers;

import mx.ipn.escom.ProyectoFinal.models.Sismo;
import mx.ipn.escom.ProyectoFinal.services.SismoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class VistaSismoController {

    @Autowired
    private SismoService sismoService;

    @GetMapping("/mapa")
    public String mostrarMapa(Model model) {
        List<Sismo> sismos = sismoService.obtenerTodosLosSismos();
        model.addAttribute("sismos", sismos);
        return "mapa";
    }

}
