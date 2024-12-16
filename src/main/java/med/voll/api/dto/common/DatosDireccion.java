package med.voll.api.dto.direccion;

public record DatosDireccion(
        String calle,
        String distrito,
        String ciudad,
        int numero,
        String complemento
) {
}
