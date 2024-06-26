package modelos.daos;

public class Gerenciador.PessoaEndereco {
    public class Main {
        public static void main(String[] args) {
            GerenciadorPessoaEndereco gerenciador = new GerenciadorPessoaEndereco();
    
            // Criar pessoas e endereços
            Pessoa pessoa1 = new Pessoa("João", 30);
            Pessoa pessoa2 = new Pessoa("Maria", 25);
            Endereco endereco1 = new Endereco("Rua das Flores", "São Paulo", "SP");
            Endereco endereco2 = new Endereco("Avenida Principal", "Rio de Janeiro", "RJ");
    
            // Adicionar pessoas com endereços
            gerenciador.adicionarPessoaEndereco(pessoa1, endereco1);
            gerenciador.adicionarPessoaEndereco(pessoa2, endereco2);
    
            // Listar pessoas com endereços
            gerenciador.listarPessoasEnderecos();
    
            // Remover uma pessoa com endereço
            gerenciador.removerPessoaEndereco("João");
    
            // Listar pessoas com endereços novamente para verificar a remoção
            gerenciador.listarPessoasEnderecos();
        }
    }
    
}
