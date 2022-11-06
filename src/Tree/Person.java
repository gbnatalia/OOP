package Tree;

interface Human {
    void setFullName(String fullName);
    String getFullName();

    void setBirthday(int year);
    int getBirthday();
}

public class Person implements Human {

    private String fullName;
    private int year;

    public Person(String fullName, int year) {
        this.fullName = fullName;
        this.year = year;
    }

    public String getFullName() {
        return fullName;
    }
    public int getBirthday() {
        return year;
    }
    public void setFullName(String fullName){this.fullName = fullName;}
    public void setBirthday(int year){this.year = year;}

    public boolean compare(Person p){
        if (p.getFullName().equals(this.fullName) &&
                (p.getBirthday() == this.year))
            return true;
        return false;
    }
}
