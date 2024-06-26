import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ControlePessoasEndereco {
    private List<PessoasEndereco> listaPessoasEnderecos;

    public ControlePessoasEndereco() {
        this.listaPessoasEnderecos = new ArrayList<>();
    }

    public void adicionarPessoaEndereco(PessoasEndereco pessoaEndereco) {
        listaPessoasEnderecos.add(pessoaEndereco);
    }

    public void listarPessoasEnderecos() {
        for (PessoaEndereco pe : listaPessoasEnderecos) {
            System.out.println(pe);
        }
    }

    public void escreverCSV(String nomeArquivo) throws IOException {
        FileWriter writer = new FileWriter(nomeArquivo);
        writer.append("nome,idade,rua,cidade,estado\n");

        for (PessoaEndereco pe : listaPessoasEnderecos) {
            writer.append(pe.toCSV()).append("\n");
        }

        writer.flush();
        writer.close();
    }

    // Getters e Setters, se necessário
    public List<PessoasEndereco> getListaPessoasEnderecos() {
        return listaPessoasEnderecos;
    }

    public void setListaPessoasEnderecos(List<PessoaEndereco> listaPessoasEnderecos) {
        this.listaPessoasEnderecos = listaPessoasEnderecos;
    }
}

