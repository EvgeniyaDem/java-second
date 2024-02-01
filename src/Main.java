//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int price_ticket = 15000; /*цена билета*/
        int price_mile = 20; /*цена 1 мили*/
        int amount_mile;  /*количество начисленных миль*/
        amount_mile = price_ticket / price_mile;
        System.out.println("Количество начисленных бонусных миль:" + amount_mile);
    }
}