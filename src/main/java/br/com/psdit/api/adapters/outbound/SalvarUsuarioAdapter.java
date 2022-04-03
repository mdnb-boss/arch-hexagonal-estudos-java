package br.com.psdit.api.adapters.outbound;

import br.com.psdit.api.adapters.inbound.mapper.UsuarioMapper;
import br.com.psdit.api.adapters.outbound.repository.UsuarioRepository;
import br.com.psdit.api.application.core.domain.Usuario;
import br.com.psdit.api.application.ports.out.SalvarUsuarioPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@AllArgsConstructor
public class SalvarUsuarioAdapter implements SalvarUsuarioPort {

    private final UsuarioRepository usuarioRepository;

    private final UsuarioMapper usuarioMapper;

    @Override
    @Transactional
    public Usuario salvar(Usuario usuario) {
        var usuarioEntity = usuarioMapper.toEntity(usuario);

        return usuarioMapper.toDomain(usuarioRepository.save(usuarioEntity));
    }
}
