package mx.ipn.escom.ProyectoFinal.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.Authentication;
import mx.ipn.escom.ProyectoFinal.services.SismoService;
import java.util.List;
import mx.ipn.escom.ProyectoFinal.models.Sismo;

@Controller
public class SismoController {

    private final SismoService sismoService;

    public SismoController(SismoService sismoService) {
        this.sismoService = sismoService;
    }

    @GetMapping("/sismos")
    public String mostrarSismos(Model model, Authentication authentication) {
        // Aquí puedes usar el objeto 'authentication' si necesitas información del usuario autenticado.
        List<Sismo> sismos = sismoService.obtenerTodosLosSismos();
        model.addAttribute("sismos", sismos);
        return "sismos"; // Nombre de la vista HTML para mostrar los sismos
    }
}
