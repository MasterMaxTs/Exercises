package inheritance;

public class Programmer extends Engineer {
    private String position;
    private String[] stack;

    public Programmer(String name, String surname, String education,
                      int birthday, String specialization, short experience,
                      String position, String[] stack) {
        super(name, surname, education, birthday, specialization, experience);
        this.position = position;
        this.stack = stack;
    }

    public void writeCode() {}

    public void testProgram() {}

    public void devops() {}


}
