public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionRange, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionRange);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    @Override
    public String toString() {
        return super.toString() + " ," +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity              ;
    }
    public void compareStudentsFaculty(Ravenclaw student) {
        int skillsStudent1 = this.getIntelligence() + this.getWisdom() + this.getWit() + this.getCreativity();
        int skillsStudent2 = student.getIntelligence() + student.getWisdom() + student.getWit() + student.getCreativity();
        System.out.println(this.getName() + " = " + skillsStudent1 + " баллов");
        System.out.println(student.getName() + " = " + skillsStudent2 + " баллов");
        if (skillsStudent1 > skillsStudent2) {
            System.out.println(this.getName() + " лучший когтевранец, чем " + student.getName());
        } else if (skillsStudent1 == skillsStudent2){
            System.out.println(this.getName() + " и " + student.getName() + " равны ");
        } else {
            System.out.println(student.getName() + " лучший когтевранец, чем " + this.getName());
        }
        System.out.println();
    }
}
