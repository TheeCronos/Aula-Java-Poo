package exerciciopoo01;

public class ExercicioPoo01 {
    
    public static void main(String[] args) {

        //------------------------ Exercício 01 ------------------------------//
        /*
            1. Crie uma classe para representar uma Pessoa com os atributos 
        privados de nome, data de nascimento e altura. Crie os métodos públicos 
        necessários para getters e setters e também um método para imprimir todos 
        dados de uma pessoa. Crie um método para calcular a idade da pessoa.
         */
        //--------------------------- Código ---------------------------------//
        Pessoa p1 = new Pessoa("A", 26, 06, 1995, 1.85f);
        p1.imprimir();
        System.out.println("Idade: " + p1.idade(0));
    }
}
