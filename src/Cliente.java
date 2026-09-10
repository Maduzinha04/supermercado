public class Cliente {
    private String nome;
    private String CPF;

    public Cliente(String n, String c){
        nome = n;
        CPF = c;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        nome = n;
    }

    public String getCpf(){
        return CPF;
    }
    public void setCpf(String c){
        CPF = c;
    }
}
