public class Produto {

    private String nome;
    private int codigo;
    private double preco;

    public Produto (int codigo, String nome, double preco)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Produto)) // Verifica se o tipo de objeto passado é do tipo Produto
            return false;
        Produto outroProduto = (Produto) object;

        if (this.hashCode() == outroProduto.hashCode())
            return true;
        else return false;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
