package Projects.Project1OOP.model.objects.Deposits;

public class ImmutableDeposit extends Deposit{

    public ImmutableDeposit(Integer rate, Integer minSum, Integer duration) {
        super("ImmutableDep", rate, minSum, duration, false);
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append("\n\t")
                .append("NOT SUPPORT PRETERM OPERATIONS")
                .toString();
    }

}
