public class Main {
    public static void main(String[] args) {
        System.out.println("Расчет колличества миль за купленные билеты:");

        int priceTicket = 13676;
        int byeTicket = 1;
        int price = 20;
        int miles = (priceTicket / price) * byeTicket;
        System.out.println("Стоимость билета - " + priceTicket);
        System.out.println("Куплено билетов - " + byeTicket);
        System.out.println("Начислено миль - " + miles);

    }
}