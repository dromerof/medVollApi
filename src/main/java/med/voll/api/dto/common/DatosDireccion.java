package med.voll.api.dto.common;

public record DatosDireccion(
        String calle,
        String distrito,
        String ciudad,
        int numero,
        String complemento
) {
}
