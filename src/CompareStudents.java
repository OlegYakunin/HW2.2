public class CompareStudents {
    public void compareStudentsGryffindor(Gryffindor student1, Gryffindor student2) {
        int skillsStudent1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int skillsStudent2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        System.out.println(student1.getName() + " = " + skillsStudent1 + " баллов");
        System.out.println(student2.getName() + " = " + skillsStudent2 + " баллов");
        if (skillsStudent1 > skillsStudent2) {
            System.out.println(student1.getName() + " лучший гриффиндорец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший гриффиндорец, чем " + student1.getName());
        }
        System.out.println();
    }

    public void compareStudentsHufflepuff(Hufflepuff student1, Hufflepuff student2) {
        int skillsStudent1 = student1.getDiligence() + student1.getLoyalty() + student1.getHonesty();
        int skillsStudent2 = student2.getDiligence() + student2.getLoyalty() + student2.getHonesty();
        System.out.println(student1.getName() + " = " + skillsStudent1 + " баллов");
        System.out.println(student2.getName() + " = " + skillsStudent2 + " баллов");
        if (skillsStudent1 > skillsStudent2) {
            System.out.println(student1.getName() + " лучший пуффендуец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший пуффендуец, чем " + student1.getName());
        }
        System.out.println();
    }

    public void compareStudentsRavenclaw(Ravenclaw student1, Ravenclaw student2) {
        int skillsStudent1 = student1.getIntelligence() + student1.getWisdom() + student1.getWit() + student1.getCreativity();
        int skillsStudent2 = student2.getIntelligence() + student2.getWisdom() + student2.getWit() + student2.getCreativity();
        System.out.println(student1.getName() + " = " + skillsStudent1 + " баллов");
        System.out.println(student2.getName() + " = " + skillsStudent2 + " баллов");
        if (skillsStudent1 > skillsStudent2) {
            System.out.println(student1.getName() + " лучший когтевранец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший когтевранец, чем " + student1.getName());
        }
        System.out.println();
    }

    public void compareStudentsSlytherin(Slytherin student1, Slytherin student2) {
        int skillsStudent1 = student1.getCunning() + student1.getDecisiveness() + student1.getAmbition() + student1.getIngenuity() + student1.getLustForPower();
        int skillsStudent2 = student2.getCunning() + student2.getDecisiveness() + student2.getAmbition() + student2.getIngenuity() + student2.getLustForPower();
        System.out.println(student1.getName() + " = " + skillsStudent1 + " баллов");
        System.out.println(student2.getName() + " = " + skillsStudent2 + " баллов");
        if (skillsStudent1 > skillsStudent2) {
            System.out.println(student1.getName() + " лучший слизеринец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший слизеринец, чем " + student1.getName());
        }
        System.out.println();
    }
    public void compareStudentsAll(Hogwarts student1, Hogwarts student2){
        if (student1.getMagicPower() > student2.getMagicPower()){
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        } else if (student1.getMagicPower() == student2.getMagicPower()){
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по мощности магии");
        } else System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
        if (student1.getTransgressionRange() > student2.getTransgressionRange()){
            System.out.println(student1.getName() + " обладает большей дальностью трансгрессии, чем " + student2.getName());
        } else if (student1.getTransgressionRange() == student2.getTransgressionRange()){
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по дальности трансгрессии");
        } else System.out.println(student2.getName() + " обладает большей дальностью трансгрессии, чем " + student1.getName());
        System.out.println();
    }
}

