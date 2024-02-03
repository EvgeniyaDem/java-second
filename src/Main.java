//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);

        System.out.println();
        System.out.println(20_000);
        System.out.println(service.calculate(20_000));

        System.out.println();
        System.out.println(30_000);
        System.out.println(service.calculate(30_000));

    }
}