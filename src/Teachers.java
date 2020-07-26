public class Teachers extends Staff {
    private String name;
    public Teachers(String name) {
        this.name = name;
    }

    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public int TotalMoneyEarn() {
        return 0;
    }
}
