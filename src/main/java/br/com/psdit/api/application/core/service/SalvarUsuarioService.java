package br.com.psdit.api.application.core.service;

import br.com.psdit.api.application.core.domain.Usuario;
import br.com.psdit.api.application.ports.in.SalvarUsuarioServicePort;
import br.com.psdit.api.application.ports.out.SalvarUsuarioPort;

public class SalvarUsuarioService implements SalvarUsuarioServicePort {

    private final SalvarUsuarioPort salvarUsuarioPort;

    public SalvarUsuarioService(SalvarUsuarioPort salvarUsuarioPort) {
        this.salvarUsuarioPort = salvarUsuarioPort;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return salvarUsuarioPort.salvar(usuario);
    }
}
