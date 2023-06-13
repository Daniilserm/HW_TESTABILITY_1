public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 15_495;
        int miles = service.calculate(price); // должно получиться 774
        System.out.println(miles);
    }
}