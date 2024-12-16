package med.voll.api.dto.medico;

import med.voll.api.dto.common.DatosDireccion;

public record DatosRegistroMedico(
        String nombre,
        String email,
        String documento,
        Especialidad especialidad,
        DatosDireccion direccion
) {
}
