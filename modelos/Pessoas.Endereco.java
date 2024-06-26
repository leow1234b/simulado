package modelos;
import java.io.FileWriter;
import java.io.IOException;

public class Pessoas.Endereco {
    


public class PessoaEndereco {
    private String nome;
    private int idade;
    private String rua;
    private String cidade;
    private String estado;

    public PessoaEndereco(String nome, int idade, String rua, String cidade, String estado) {
        this.nome = nome;
        this.idade = idade;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
    }

    // Método para converter dados para formato CSV
    public String toCSV() {
        return String.format("%s,%d,%s,%s,%s", nome, idade, rua, cidade, estado);
    }

    // Método para escrever dados em um arquivo CSV
    public static void escreverCSV(String nomeArquivo, PessoaEndereco[] pessoasEnderecos) throws IOException {
        FileWriter writer = new FileWriter(nomeArquivo);
        writer.append("nome,idade,rua,cidade,estado\n");

        for (PessoaEndereco pe : pessoasEnderecos) {
            writer.append(pe.toCSV() + "\n");
        }

        writer.flush();
        writer.close();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

}
