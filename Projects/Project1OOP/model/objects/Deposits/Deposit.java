package Projects.Project1OOP.model.objects.Deposits;

public abstract class Deposit implements Comparable<Deposit>{

    public static final int DAYS_PER_YEAR = 365;

    protected String name;

    protected Integer rate;

    protected Integer minSum;

    protected Integer duration;

    private boolean eWithdrawal;


    public Deposit(String name, Integer rate, Integer minSum, Integer duration, boolean eWithdrawal) {
        this.name = name;
        this.rate = rate;
        this.minSum = minSum;
        this.duration = duration;
        this.eWithdrawal = eWithdrawal;

    }

    public String getName() {
        return name;
    }

    public Integer getRate() {
        return rate;
    }

    public Integer getMinSum() {
        return minSum;
    }

    public Integer getDuration() {
        return duration;
    }


    public Integer getProfit() {
        return this.getRate() * this.getMinSum() * this.getDuration() / DAYS_PER_YEAR / 100;
    }

    @Override
    public String toString() {
        return new StringBuilder("\n").append("DEPOSIT NAME: ").append(getName())
                .append("\n\t").append("RATE: ").append(getRate()).append("%")
                .append("\n\t").append("MINIMAL SUMM: ").append(getMinSum()).append("$")
                .append("\n\t").append("DURATION: ").append(getDuration()).append(" DAYS")
                .append("\n\t").append("DEFAULT PROFIT: ").append(this.getProfit()).append("$")
                .append("\n\t").append("EARLY WITHDRAWAL: ").append(this.eWithdrawal)
                .append("\n\t").append("PROFIT: ").append(this.getProfit())
                .toString();
    }

    @Override
    public int compareTo(Deposit o) {
        return o.getProfit() - this.getProfit();
    }
}
