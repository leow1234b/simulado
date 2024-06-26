package modelos.daos;


    import java.util.ArrayList;
import java.util.List;

public class GerenciadorVendedores {
    private List<Vendedor> listaVendedores;

    public GerenciadorVendedores() {
        this.listaVendedores = new ArrayList<>();
    }

    // Método para adicionar um vendedor à lista
    public void adicionarVendedor(Vendedor vendedor) {
        listaVendedores.add(vendedor);
    }

    // Método para listar todos os vendedores
    public void listarVendedores() {
        System.out.println("Listagem de Vendedores:");
        for (Vendedor vendedor : listaVendedores) {
            System.out.println(vendedor);
        }
    }

    // Método para remover um vendedor da lista pelo código
    public void removerVendedor(int codigo) {
        Vendedor vendedorRemovido = null;
        for (Vendedor vendedor : listaVendedores) {
            if (vendedor.getCodigo() == codigo) {
                vendedorRemovido = vendedor;
                break;
            }
        }
        if (vendedorRemovido != null) {
            listaVendedores.remove(vendedorRemovido);
            System.out.println("Vendedor removido com sucesso.");
        } else {
            System.out.println("Vendedor não encontrado na lista.");
        }
    }

    // Getters e Setters, se necessário
    public List<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(List<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }
}


