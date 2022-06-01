package exerciciopoo01;

public class Pessoa {
    
    private String nome;
    private int dia;
    private int mes;
    private int ano;
    private float altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int dia, int mes, int ano, float altura) {
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
        System.out.println("Altura: " + altura);
    }

    public int idade(int idade) {
        idade = 2022 - ano;
        if (mes > 5) {
            idade--;
        }
        return idade;
    }
}