public class BonusMilesService<miles> {
    public int calculate(int cost) {
        int bonus = 20;
        int miles = cost / bonus;

        return miles;

    }
}
