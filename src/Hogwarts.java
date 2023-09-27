public class Hogwarts {
    public String name;
    public int magicPower;
    public int transgressionRange;

    public Hogwarts(String name, int magicPower, int transgressionRange) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionRange = transgressionRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionRange() {
        return transgressionRange;
    }

    public void setTransgressionRange(int transgressionRange) {
        this.transgressionRange = transgressionRange;
    }
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionRange=" + transgressionRange;
    }
    public void compareStudentsAll(Hogwarts student){
        if (this.magicPower > student.magicPower){
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + student.getName());
        } else if (this.getMagicPower() == student.getMagicPower()){
            System.out.println(this.getName() + " и " + student.getName() + " равны по мощности магии");
        } else System.out.println(student.getName() + " обладает большей мощностью магии, чем " + this.getName());
        if (this.getTransgressionRange() > student.getTransgressionRange()){
            System.out.println(this.getName() + " обладает большей дальностью трансгрессии, чем " + student.getName());
        } else if (this.getTransgressionRange() == student.getTransgressionRange()){
            System.out.println(this.getName() + " и " + student.getName() + " равны по дальности трансгрессии");
        } else System.out.println(student.getName() + " обладает большей дальностью трансгрессии, чем " + this.getName());
        System.out.println();
    }


}
