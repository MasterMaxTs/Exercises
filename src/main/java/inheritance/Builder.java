package inheritance;

public class Builder extends Engineer {
    private String[] skill;

    public Builder(String name, String surname, String education,
                   int birthday, String specialization, short experience, String[] skill){
        super(name, surname, education, birthday, specialization, experience);
        this.skill = skill;
    }

    public boolean workInTeam() {return true;};


}
