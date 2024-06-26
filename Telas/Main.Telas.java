package Telas;

import java.util.List;
import java.util.ArrayList;

public class MainTelas {
    
        // Exemplo de uso do Gerenciador de Pessoas
        GerenciadorPessoas gerenciadorPessoas = new GerenciadorPessoas();

        // Adicionar pessoas
        gerenciadorPessoas.adicionarPessoa(new Pessoa("João", 30));
        gerenciadorPessoas.adicionarPessoa(new Pessoa("Maria", 25));
        gerenciadorPessoas.adicionarPessoa(new Pessoa("Pedro", 28));

        // Listar pessoas
        System.out.println("### Listagem de Pessoas ###");
        gerenciadorPessoas.listarPessoas();
        System.out.println();

        // Remover uma pessoa
        System.out.println("### Remoção de Pessoa ###");
        gerenciadorPessoas.removerPessoa("Maria");
        System.out.println();

        // Listar pessoas novamente para verificar a remoção
        System.out.println("### Listagem de Pessoas Após Remoção ###");
        gerenciadorPessoas.listarPessoas();
        System.out.println();

        // Exemplo de uso do Gerenciador de Pessoas com Endereço
        GerenciadorPessoaEndereco gerenciadorPessoaEndereco = new GerenciadorPessoaEndereco();

        // Criar pessoas e endereços
        Pessoa pessoa1 = new Pessoa("João", 30);
        Pessoa pessoa2 = new Pessoa("Maria", 25);
        Endereco endereco1 = new Endereco("Rua das Flores", "São Paulo", "SP");
        Endereco endereco2 = new Endereco("Avenida Principal", "Rio de Janeiro", "RJ");

        // Adicionar pessoas com endereços
        gerenciadorPessoaEndereco.adicionarPessoaEndereco(pessoa1, endereco1);
        gerenciadorPessoaEndereco.adicionarPessoaEndereco(pessoa2, endereco2);

        // Listar pessoas com endereços
        System.out.println("### Listagem de Pessoas com Endereços ###");
        gerenciadorPessoaEndereco.listarPessoasEnderecos();
        System.out.println();

        // Remover uma pessoa com endereço
        System.out.println("### Remoção de Pessoa com Endereço ###");
        gerenciadorPessoaEndereco.removerPessoaEndereco("João");
        System.out.println();

        // Listar pessoas com endereços novamente para verificar a remoção
        System.out.println("### Listagem de Pessoas com Endereços Após Remoção ###");
        gerenciadorPessoaEndereco.listarPessoasEnderecos();
        System.out.println();

        // Exemplo de uso do Gerenciador de Vendedores
        GerenciadorVendedores gerenciadorVendedores = new GerenciadorVendedores();

        // Adicionar vendedores
        gerenciadorVendedores.adicionarVendedor(new Vendedor(1, "João"));
        gerenciadorVendedores.adicionarVendedor(new Vendedor(2, "Maria"));
        gerenciadorVendedores.adicionarVendedor(new Vendedor(3, "Pedro"));

        // Listar vendedores
        System.out.println("### Listagem de Vendedores ###");
        gerenciadorVendedores.listarVendedores();
        System.out.println();

        // Remover um vendedor
        System.out.println("### Remoção de Vendedor ###");
        gerenciadorVendedores.removerVendedor(2);
        System.out.println();

        // Listar vendedores novamente para verificar a remoção
        System.out.println("### Listagem de Vendedores Após Remoção ###");
        gerenciadorVendedores.listarVendedores();
        System.out.println();
    }




   