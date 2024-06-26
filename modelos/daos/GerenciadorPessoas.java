package modelos.daos;

    import java.util.ArrayList;
import java.util.List;

public class GerenciadorPessoas {
    private List<Pessoa> listaPessoas;

    public GerenciadorPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    // Método para adicionar uma pessoa à lista
    public void adicionarPessoa(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    // Método para listar todas as pessoas
    public void listarPessoas() {
        System.out.println("Listagem de Pessoas:");
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }
    }

    // Método para remover uma pessoa da lista pelo nome
    public void removerPessoa(String nome) {
        Pessoa pessoaRemovida = null;
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa.getNome().equals(nome)) {
                pessoaRemovida = pessoa;
                break;
            }
        }
        if (pessoaRemovida != null) {
            listaPessoas.remove(pessoaRemovida);
            System.out.println("Pessoa removida com sucesso.");
        } else {
            System.out.println("Pessoa não encontrada na lista.");
        }
    }

    // Getters e Setters, se necessário
    public List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(List<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }
}


