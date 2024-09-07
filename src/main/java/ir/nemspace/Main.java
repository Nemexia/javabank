package ir.nemspace;

public class Main {
    public static void main(String[] args) {
        Bank my_bank = new Bank();
        ATM my_atm = new ATM(200.0f);
        Card my_card = new Card("123213", "1122", "0231", "22/22");
        System.out.println("Hello world!");
        System.out.println(my_bank.name);
        System.out.println(my_atm.cash);
        System.out.println(my_card);
    }
}
