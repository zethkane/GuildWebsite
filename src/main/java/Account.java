import toon.Toon;

public class Account {

    public String email = "";
    public String name = "";
    public String dateOfBirth = "";
    public Toon main;
    public Toon alt1;
    public Toon alt2;

    public Account(String email, String name, String dateOfBirth, Toon main) {
        this.email = email;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.main = main;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Toon getMain() {
        return main;
    }

    public Toon getAlt1() {
        return alt1;
    }

    public Toon getAlt2() {
        return alt2;
    }

    public void setAlt1(Toon alt1) {
        this.alt1 = alt1;
    }

    public void setAlt2(Toon alt2) {
        this.alt2 = alt2;
    }
}
