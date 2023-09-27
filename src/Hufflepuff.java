public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionRange, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionRange);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    @Override
    public String toString() {
        return super.toString() + " ," +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty              ;
    }
    public void compareStudentsFaculty(Hufflepuff student) {
        int skillsStudent1 = this.getDiligence() + this.getLoyalty() + this.getHonesty();
        int skillsStudent2 = student.getDiligence() + student.getLoyalty() + student.getHonesty();
        System.out.println(this.getName() + " = " + skillsStudent1 + " баллов");
        System.out.println(student.getName() + " = " + skillsStudent2 + " баллов");
        if (skillsStudent1 > skillsStudent2) {
            System.out.println(this.getName() + " лучший пуффендуец, чем " + student.getName());
        } else if (skillsStudent1 == skillsStudent2){
            System.out.println(this.getName() + " и " + student.getName() + " равны ");
        } else {
            System.out.println(student.getName() + " лучший пуффендуец, чем " + student.getName());
        }
        System.out.println();
    }

}
