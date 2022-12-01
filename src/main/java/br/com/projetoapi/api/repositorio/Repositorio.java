package br.com.projetoapi.api.repositorio;
import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.projetoapi.api.modelo.Hospedagem;


@Repository
public interface Repositorio extends CrudRepository<Hospedagem, Integer>{
    
    List<Hospedagem> findAll();

    Hospedagem findByCodigo(int codigo);

}
