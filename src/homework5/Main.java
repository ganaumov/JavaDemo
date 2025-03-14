package homework5;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(21233464, 1268);
        CreditCard card2 = new CreditCard(43285678, 6529);
        CreditCard card3 = new CreditCard(96534567, 6542);

        card1.addBalance(320);
        card2.addBalance(670);
        card3.minusBalance(1000);

        card1.showInfo();
        System.out.println();
        card2.showInfo();
        System.out.println();
        card3.showInfo();

    }
}

