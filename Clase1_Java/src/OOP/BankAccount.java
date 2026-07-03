package OOP;

public class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
        System.out.printf("Se crea cuenta bancario con un saldo de %.2f%n",balance);
    }
    public void deposit(double valor){
        balance +=valor;
        System.out.printf("El saldo restante es %.2f%n", balance);
    }
    public void showBalance(){
        System.out.printf("El saldo consultado es de %.2f%n", balance);
    }
}
