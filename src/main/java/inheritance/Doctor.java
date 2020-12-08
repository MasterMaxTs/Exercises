package inheritance;

public class Doctor extends Profession {
    private short experience;

    public Doctor(String name, String surname, String education,
                  int birthday, short experience) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }

    public boolean healthPermit() {
        return true;
    }

    public void carryOutReception() {}

    public void examinePatient() {}



}
