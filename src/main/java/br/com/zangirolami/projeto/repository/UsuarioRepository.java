package br.com.zangirolami.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zangirolami.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
