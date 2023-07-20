public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionRange, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionRange);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    @Override
    public String toString() {
        return super.toString() + " ," +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery              ;
    }

    public void compareStudentsFaculty(Gryffindor student) {
        int skillsStudent1 = this.nobility + this.honor + this.bravery;
        int skillsStudent2 = student.nobility + student.honor + student.bravery;
        System.out.println(this.getName() + " = " + skillsStudent1 + " баллов");
        System.out.println(student.getName() + " = " + skillsStudent2 + " баллов");
        if (skillsStudent1 > skillsStudent2) {
            System.out.println(this.getName() + " лучший гриффиндорец, чем " + student.getName());
        } else if (skillsStudent1 == skillsStudent2){
            System.out.println(this.getName() + " и " + student.getName() + " равны ");
        } else {
            System.out.println(student.getName() + " лучший гриффиндорец, чем " + this.getName());
        }
        System.out.println();
    }


}
