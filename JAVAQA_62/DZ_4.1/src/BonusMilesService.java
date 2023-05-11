public class BonusMilesService {
    public int calculate(int price){

        int result;
        int bonusDivider = 20;

        result = price / bonusDivider;
        return result;

    }
}
