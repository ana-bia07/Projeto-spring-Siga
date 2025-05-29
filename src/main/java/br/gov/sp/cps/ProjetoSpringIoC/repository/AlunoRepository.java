package br.gov.sp.cps.ProjetoSpringIoC.repository;

import br.gov.sp.cps.ProjetoSpringIoC.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
