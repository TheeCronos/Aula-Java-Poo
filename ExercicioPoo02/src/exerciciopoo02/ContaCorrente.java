package exerciciopoo02;

public class ContaCorrente {
    
    private int numero;
    private String nome;
    private float saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(int numero, String nome, float saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public String alterarNome(String alterarNome){
        this.nome = alterarNome;
        return alterarNome;
    }
    
    public float deposito(float deposito){
        this.saldo = saldo + deposito;
        return deposito;
    }
    
    public float saque(float saque){
        this.saldo = saldo - saque;
        return saque;
    }
}
