package med.voll.api.controller;

import med.voll.api.dto.medico.DatosRegistroMedico;
import med.voll.api.model.Medico;
import med.voll.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public void registrarMedicos(@RequestBody DatosRegistroMedico datosRegistroMedico){
       medicoRepository.save(new Medico(datosRegistroMedico));
    }
}
