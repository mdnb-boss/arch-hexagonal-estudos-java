package br.com.psdit.api.application.ports.out;

import br.com.psdit.api.application.core.domain.Usuario;

public interface SalvarUsuarioPort {
    Usuario salvar(Usuario usuario);
}
