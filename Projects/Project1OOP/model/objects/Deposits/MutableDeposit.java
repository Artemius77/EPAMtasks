package Projects.Project1OOP.model.objects.Deposits;

public class MutableDeposit extends Deposit {

    private final Integer minDurationForChange;

    private final Integer maxSumToTakePerMonth;

    public MutableDeposit(Integer rate, Integer minSum, Integer duration, Integer minDurationForChange,
                          Integer maxSumToTakePerMonth) {
        super("MutableDep", rate, minSum, duration, true);
        this.minDurationForChange = minDurationForChange;
        this.maxSumToTakePerMonth = maxSumToTakePerMonth;
    }

    public Integer getMinDurationForChange() {
        return minDurationForChange;
    }

    public Integer getMaxSummToTakePerMonth() {
        return maxSumToTakePerMonth;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t" +
                "SUPPORT PRETERM OPERATIONS:" +
                "\n\t" + "MINIMAL PERIOD BEFORE CHANGE: " + getMinDurationForChange() + " DAYS" +
                "\n\t" + "MAX SUMM TO TAKE PER MONTH: " + getMaxSummToTakePerMonth() + " $";
    }

}
