package br.com.psdit.api.adapters.inbound.mapper;

import br.com.psdit.api.adapters.inbound.entity.UsuarioEntity;
import br.com.psdit.api.adapters.inbound.request.UsuarioRequest;
import br.com.psdit.api.application.core.domain.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class UsuarioMapper {
    public abstract UsuarioEntity toEntity(UsuarioRequest usuarioRequest);

    public abstract UsuarioEntity toEntity(Usuario usuario);

    public abstract Usuario toDomain(UsuarioRequest usuarioRequest);

    public abstract Usuario toDomain(UsuarioEntity usuarioEntity);
}
