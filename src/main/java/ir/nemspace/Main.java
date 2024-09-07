package ir.nemspace;

public class Main {
    public static void main(String[] args) {
        Bank my_bank = new Bank();
        ATM my_atm = new ATM(200.0f);
        System.out.println("Hello world!");
        System.out.println(my_bank.name);
        System.out.println(my_atm.cash);
    }
}
