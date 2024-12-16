package med.voll.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void registrarMedicos(@RequestBody String parametro){
        System.out.println("El request llega perfectamente");
        System.out.println(parametro);
    }
}
