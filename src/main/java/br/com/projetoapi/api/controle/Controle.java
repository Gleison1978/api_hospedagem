package br.com.projetoapi.api.controle;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.projetoapi.api.modelo.Hospedagem;
import br.com.projetoapi.api.repositorio.Repositorio;


@RestController
public class Controle {

    @Autowired
    private Repositorio acoes;

    @PostMapping(path = "/api/hospedagem/cadastro")
    public Hospedagem cadastrarHospedagem(@RequestBody Hospedagem hosp){
        return acoes.save(hosp);
    }

    @GetMapping(path = "/api/hospedagem/consultar")
    public List<Hospedagem> selecionar(){
        return acoes.findAll();
    }

    @GetMapping(path = "/api/hospedagem/consultar/{codigo}")
    public Hospedagem selecionarId(@PathVariable int codigo){
        return acoes.findByCodigo(codigo);
    }
    
    @PutMapping(path = "/api/hospedagem/alterar")
    public Hospedagem alterar(@RequestBody Hospedagem hosp){
        return acoes.save(hosp);
    }

    @DeleteMapping(path = "/api/excluir/{codigo}")
    public void excluir(@PathVariable int codigo){
        Hospedagem hosp = selecionarId(codigo);

        acoes.delete(hosp);
    }

}
