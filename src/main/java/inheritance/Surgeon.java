package inheritance;

public class Surgeon extends Doctor {
    private String qualification;

    public Surgeon(String name, String surname, String education,
                   int birthday, short experience, String qualification) {
        super(name, surname, education, birthday, experience);
        this.qualification = qualification;
    }

    public void operate() {}





}
