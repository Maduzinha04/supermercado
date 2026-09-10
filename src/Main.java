import java.util.Scanner;
public class Main{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  int op=3;
  Pedido pedidoAtual = null;
     while(op>0){
        System.out.println("Bem-vindo ao supermercado!\n1-Novo pedido\n2-Pagamento\n0-Sair") ;
        op = scanner.nextInt();
        scanner.nextLine();

        if(op==1){
            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digite seu CPF(APENAS NÚMEROS): ");
            String CPF = scanner.nextLine();
            scanner.nextLine();

            Cliente cliente = new Cliente(nome, CPF);
            pedidoAtual = new Pedido(cliente);

            System.out.println("Digite as informações dos produtos desejados:\n");
            int op2 = 1;
            while(op2>0){
                System.out.println("Digite o nome do produto: ");
                String desc = scanner.nextLine();
                System.out.println("Digite o preço do produto: ");
                String precoTexto= scanner.nextLine();
                double preco = Double.parseDouble(precoTexto.replace(",", "."));

                Produto produto = new Produto(desc, preco, 50);

                System.out.println("Quantidade do produto deseja? ");
                int qtd = scanner.nextInt();

                ItemPedido item = new ItemPedido(produto, qtd);
                pedidoAtual.AddItem(item);

                System.out.println("Deseja adicionar mais produtos?\n0-Não\n1-Sim ");
                op2 = scanner.nextInt();
                scanner.nextLine();
            }
        }else if(op == 2){
            if(pedidoAtual!=null){
                System.out.println("Cliente: "+pedidoAtual.getCliente().getNome());
                System.out.println("Total: "+pedidoAtual.getTotal());

                System.out.println("Digite a forma de pagamento(DINHEIRO, CHEQUE ou CARTAO): ");
                String pagamento = scanner.nextLine();
                pedidoAtual.setPagamento(pagamento);

                System.out.println("Pagamento rezlizado com sucesso!");
            }else{
                System.out.println("Nenhum pedido aberto.");
            }
        }

     }
     System.out.println("Saindo..");
     scanner.close();
    }
}
