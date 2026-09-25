package model;

public class Produto {
    private String nome;
    private float preco;
    private int quantidadeEstoque;

    public Produto(String nome, float preco, int quantidadeEstoque) {

        if (quantidadeEstoque < 0)
            quantidadeEstoque = 0;

        if (preco < 0)
            preco = 0;

        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(float valor) {
        if (valor < 0) {
            System.out.println("Não é possível definir preços negativos!");
            return;
        }

        preco = valor;
    }
    public void setQuantidadeEstoque(int valor) {
        if (valor < 0)
        {
            System.out.println("Não é possível definir estoque negativo!");
            return;
        }

        quantidadeEstoque = valor;
    }

    public String getNome() {
        return nome;
    }
    public float getPreco() {
        return preco;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}