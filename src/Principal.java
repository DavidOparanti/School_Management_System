public class Principal extends Staff implements administrative {
    private  String name;

    public Principal(String name) {
        super();
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
