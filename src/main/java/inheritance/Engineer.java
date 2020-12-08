package inheritance;

public class Engineer extends Profession {
    private String specialization;
    private short experience;

    public Engineer(String name, String surname, String education,
                    int birthday, String specialization, short experience) {
        super(name, surname, education, birthday);
        this.specialization = specialization;
        this.experience = experience;
    }

    public void investigate() {}

    public void provideAssistance() {}

    public void innovate() {}
}
