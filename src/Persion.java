public abstract class Persion {

    private int id ;
    private String firstName;
    private String lastName;

    public Persion(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Persion(int id) {
        this.id = id;
    }


    public abstract int getId() ;

    public abstract void setId(int id);

    public abstract String getFirstName();

    public abstract void setFirstName(String firstName) ;

    public abstract String getLastName();

    public abstract void setLastName(String lastName);

    public abstract String getFullName();
}
