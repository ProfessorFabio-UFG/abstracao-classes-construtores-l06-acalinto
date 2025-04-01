public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private double valor;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(int codigo, String nome, int quantidade, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void vender(int quantidadeVendida) {
        if (quantidadeVendida > this.quantidade) {
            System.out.println("Estoque insuficiente para venda!");
        } else {
            this.quantidade -= quantidadeVendida;
            System.out.println("Venda realizada! Total: R$" + (quantidadeVendida * this.valor));
        }
    }

    public void comprar(int quantidadeComprada, double novoValor) {
        this.quantidade += quantidadeComprada;
        this.valor = novoValor;
        System.out.println("Compra realizada! Novo estoque: " + this.quantidade);
    }

    public void comprar(int quantidadeComprada) {
        this.quantidade += quantidadeComprada;
        System.out.println("Compra realizada! Novo estoque: " + this.quantidade);
    }

    public void inserir(String nome, int quantidade, String tipo, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
        System.out.println("Dados atualizados!");
    }

    public boolean igual(Produto outro) {
        return this.nome.equals(outro.nome) && this.tipo.equals(outro.tipo);
    }

    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Quantidade: " + quantidade + ", Tipo: " + tipo + ", Valor: R$" + valor;
    }
}
