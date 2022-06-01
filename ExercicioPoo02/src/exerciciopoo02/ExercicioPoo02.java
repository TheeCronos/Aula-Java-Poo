package exerciciopoo02;

public class ExercicioPoo02 {
    
    public static void main(String[] args) {
        
        //------------------------ Exercício 02 ------------------------------//
        /*
            2. Crie uma classe para implementar uma ContaCorrente. A classe deve 
        possuir os seguintes atributos: número da conta, nome do correntista e 
        saldo. Os métodos são os seguintes: alterarNome, depósito e saque; No 
        construtor, saldo é opcional, com valor default zero e os demais 
        atributos são obrigatórios.
         */
        //--------------------------- Código ---------------------------------//
        
        ContaCorrente c1 = new ContaCorrente(1, "A", 100);
        c1.setSaldo(100.00f);
        c1.alterarNome("josé");
        c1.saque(50.00f);
        c1.deposito(250.00f);
        
        System.out.println("Numero da conta: " + c1.getNumero());
        System.out.println("Nome do correntista: " + c1.getNome());
        System.out.println("Saldo: " + c1.getSaldo());
    }
}
