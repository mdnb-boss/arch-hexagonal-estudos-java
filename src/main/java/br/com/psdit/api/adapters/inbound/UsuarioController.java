package br.com.psdit.api.adapters.inbound;

import br.com.psdit.api.adapters.inbound.mapper.UsuarioMapper;
import br.com.psdit.api.adapters.inbound.request.UsuarioRequest;
import br.com.psdit.api.application.core.domain.Usuario;
import br.com.psdit.api.application.ports.in.SalvarUsuarioServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioMapper mapper;

    @Autowired
    private SalvarUsuarioServicePort salvarUsuarioServicePort;

    @PostMapping
    public Usuario salvarUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        var usuario = mapper.toDomain(usuarioRequest);
        return salvarUsuarioServicePort.salvarUsuario(usuario);
    }

}
