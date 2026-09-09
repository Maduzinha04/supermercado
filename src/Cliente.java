public class Cliente {
    private String nome;
    private int CPF;

    public Cliente(String n, int c){
        nome = n;
        CPF = c;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        nome = n;
    }

    public int getCpf(){
        return CPF;
    }
    public void setCpf(int c){
        CPF = c;
    }
}
