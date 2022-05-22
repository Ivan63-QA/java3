public class main {
    public static void main(String[] args) {
        int deposit = 1100;
        int bonus;
        int clientacc = 100;
        int futclientacc;

        if (deposit > 1000) {
            bonus = deposit / 100;
            futclientacc = clientacc + deposit + bonus;
            System.out.println("Клиентский счет после пополнения: " + futclientacc);
            System.out.println("Бонус: " + bonus);
        } else {
            futclientacc = clientacc + deposit;
            bonus = 0;
            System.out.println("Клиентский счет после пополнения: " + futclientacc);
            System.out.println("Бонус: " + bonus);
        }
    }
}
