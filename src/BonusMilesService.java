public class BonusMilesService {
    public int calculate(int price) {
        int oneBonus = 20;
        int mile = price / oneBonus;
        return mile;
    }
}
