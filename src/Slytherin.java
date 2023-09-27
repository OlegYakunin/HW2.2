public class Slytherin extends Hogwarts{
    private int cunning;
    private int decisiveness;
    private int ambition;
    private int ingenuity;
    private int lustForPower;

    public Slytherin(String name, int magicPower, int transgressionRange, int cunning, int decisiveness, int ambition, int ingenuity, int lustForPower) {
        super(name, magicPower, transgressionRange);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    @Override
    public String toString() {
        return super.toString() + " ," +
                "cunning=" + cunning +
                ", decisiveness=" + decisiveness +
                ", ambition=" + ambition +
                ", ingenuity=" + ingenuity +
                ", lustForPower=" + lustForPower              ;
    }
    public void compareStudentsFaculty(Slytherin student) {
        int skillsStudent1 = this.getCunning() + this.getDecisiveness() + this.getAmbition() + this.getIngenuity() + this.getLustForPower();
        int skillsStudent2 = student.getCunning() + student.getDecisiveness() + student.getAmbition() + student.getIngenuity() + student.getLustForPower();
        System.out.println(this.getName() + " = " + skillsStudent1 + " баллов");
        System.out.println(student.getName() + " = " + skillsStudent2 + " баллов");
        if (skillsStudent1 > skillsStudent2) {
            System.out.println(this.getName() + " лучший слизеринец, чем " + student.getName());
        } else if (skillsStudent1 == skillsStudent2){
            System.out.println(this.getName() + " и " + student.getName() + " равны ");
        } else {
            System.out.println(student.getName() + " лучший слизеринец, чем " + this.getName());
        }
        System.out.println();
    }
}
