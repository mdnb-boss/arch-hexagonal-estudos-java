package br.com.psdit.api.application.ports.in;

import br.com.psdit.api.application.core.domain.Usuario;

public interface SalvarUsuarioServicePort {
    Usuario salvarUsuario(Usuario usuario);
}
