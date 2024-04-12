package br.com.unicuritiba.arenadopoder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.unicuritiba.arenadopoder.models.Arena;

public interface ArenaRepository extends JpaRepository<Arena, Long> {

}