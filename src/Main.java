//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int priceTicket = 15000; /*цена билета*/
        int priceMile = 20; /*цена 1 мили*/
        int amountMile;  /*количество начисленных миль*/
        amountMile = priceTicket / priceMile;
        System.out.println("Количество начисленных бонусных миль: " + amountMile);
    }
}