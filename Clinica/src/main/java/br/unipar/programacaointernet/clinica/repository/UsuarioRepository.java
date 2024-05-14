package br.unipar.programacaointernet.clinica.repository;

import br.unipar.programacaointernet.clinica.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
