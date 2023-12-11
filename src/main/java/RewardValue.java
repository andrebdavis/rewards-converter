public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    public RewardValue(double milesValue, boolean isMiles){
        this.milesValue = milesValue;
        this.cashValue = isMiles ? milesToCash(milesValue) : 0.0;
    }

    private double milesToCash(double milesValue) {
        return milesValue * 0.0035;
    }

    private double cashToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }
}
