import java.util.ArrayList;
import java.util.List;

public class Pedido{
    private Cliente cliente;
    private String pagamento;
    private List<ItemPedido> itens; 

    public Pedido(Cliente c){
        cliente = c;
        pagamento = "Indefinido";
        this.itens = new ArrayList<>();
    }

    public void AddItem(ItemPedido i){
        itens.add(i);
    }

    public void setCliente(Cliente c){
        cliente = c;
    }

    public void setPagamento(String p){
        pagamento= p;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public String getPagamento(){
        return pagamento;
    }

    public List<ItemPedido> getItens(){
        return itens;
    }

    public double getTotal(){
        double total=0;

        for(ItemPedido item:itens){
            total+=item.geProduto().getPreco()*item.getQtd();
        }
        return total;
    }


}