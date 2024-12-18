package med.voll.api.dto.medico;

import med.voll.api.model.Medico;

public record datoslistadoMedicos(
        String nombre,
        String especialidad,
        String documento,
        String email

) {
    public datoslistadoMedicos(Medico medico){
        this(medico.getNombre(), medico.getDocumento(), medico.getEmail(), medico.getEspecialidad().toString());
    }
}
