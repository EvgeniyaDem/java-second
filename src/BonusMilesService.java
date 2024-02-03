public class BonusMilesService {
    public int calculate(int price) {
        int priceMile = 20; /*цена 1 мили*/
        int miles;  /*количество начисленных миль*/
        miles = price / priceMile;
    return miles;
    }
}
