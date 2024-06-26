package modelos.daos;


    import java.util.ArrayList;
import java.util.List;

public class GerenciadorEndereco {
    private List<String> listaEnderecos;

    public GerenciadorEndereco() {
        this.listaEnderecos = new ArrayList<>();
    }

    // Método para adicionar um endereço à lista
    public void adicionarEndereco(String endereco) {
        listaEnderecos.add(endereco);
    }

    // Método para listar todos os endereços
    public void listarEnderecos() {
        System.out.println("Listagem de Endereços:");
        for (String endereco : listaEnderecos) {
            System.out.println(endereco);
        }
    }

    // Método para remover um endereço da lista
    public void removerEndereco(String endereco) {
        if (listaEnderecos.contains(endereco)) {
            listaEnderecos.remove(endereco);
            System.out.println("Endereço removido com sucesso.");
        } else {
            System.out.println("Endereço não encontrado na lista.");
        }
    }

    // Getters e Setters, se necessário
    public List<String> getListaEnderecos() {
        return listaEnderecos;
    }

    public void setListaEnderecos(List<String> listaEnderecos) {
        this.listaEnderecos = listaEnderecos;
    }
}


