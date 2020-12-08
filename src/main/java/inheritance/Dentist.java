package inheritance;

public class Dentist extends Doctor {
    private String category;

    public Dentist(String name, String surname, String education,
                   int birthday, short experience, String category) {
        super(name, surname, education, birthday, experience);
        this.category = category;
    }

    public void dentalWork() {};

    public void correctBite() {};
}
