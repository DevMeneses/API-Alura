package med.voll.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente (
        @NotBlank(message = "O campo nome é obrigatorio") String nome,
        @NotBlank (message = "O campo email é obrigatorio") @Email String email,
        @NotBlank String telefone,
        @NotBlank (message = "O campo CPF é obrigatorio") @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}") String cpf,
        @NotNull @Valid DadosEndereco endereco
) {
}