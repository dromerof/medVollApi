package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.dto.medico.DatosRegistroMedico;
import med.voll.api.dto.medico.datoslistadoMedicos;
import med.voll.api.model.Medico;
import med.voll.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public void registrarMedicos(@RequestBody @Valid DatosRegistroMedico datosRegistroMedico){
       medicoRepository.save(new Medico(datosRegistroMedico));
    }

    @GetMapping
    public Page<datoslistadoMedicos> listadoMedicos(@PageableDefault(size = 5) Pageable paginacion){
        return medicoRepository.findAll(paginacion).map(datoslistadoMedicos::new);
    }
}
