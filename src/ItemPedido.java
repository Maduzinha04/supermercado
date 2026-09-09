public class ItemPedido {
    private Produto produto;
    private int qtd;

    public ItemPedido(Produto p, int q){
        produto = p;
        qtd = q;
    }

    public Produto geProduto(){
        return produto;
    }

    public int getQtd(){
        return qtd;
    }
}
