public class Produto{
    private String descricao;
    private double preco;
    private int qtdEst;

    public Produto(String d, double p, int q){
        descricao = d;
        preco = p;
        qtdEst = q;
    }

    public String getDesc(){
        return descricao;
    }
    public void setDesc(String d){
        descricao = d;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double p){
        preco = p;
    }

    public int getQtd(){
        return qtdEst;
    }
    public void setQtd(int q){
        qtdEst = q;
    }
}
