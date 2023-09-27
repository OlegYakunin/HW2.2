public class PrintStudentDescription {
    public void print(Gryffindor student){
        System.out.println("Студент: " + student.getName() + " - MagicPower: " + student.getMagicPower()
                + ", TransgressionRange: " + student.getTransgressionRange()
                + ", Nobility: " + student.getNobility()
                + ", Honor: " + student.getHonor()
                + ", Bravery: " + student.getBravery()
        );
        System.out.println();
    }

    public void print(Ravenclaw student){
        System.out.println("Студент: " + student.getName() + " - MagicPower: " + student.getMagicPower()
                + ", TransgressionRange: " + student.getTransgressionRange()
                + ", Intelligence: " + student.getIntelligence()
                + ", Wisdom: " + student.getWisdom()
                + ", Wit: " + student.getWit()
                + ", Creativity: " + student.getCreativity()
        );
        System.out.println();
    }

    public void print(Hufflepuff student){
        System.out.println("Студент: " + student.getName() + " - MagicPower: " + student.getMagicPower()
                + ", TransgressionRange: " + student.getTransgressionRange()
                + ", Diligence: " + student.getDiligence()
                + ", Loyalty: " + student.getLoyalty()
                + ", Honesty: " + student.getHonesty()
        );
        System.out.println();
    }

    public void print(Slytherin student){
        System.out.println("Студент: " + student.getName() + " - MagicPower: " + student.getMagicPower()
                + ", TransgressionRange: " + student.getTransgressionRange()
                + ", Cunning: " + student.getCunning()
                + ", Decisiveness: " + student.getDecisiveness()
                + ", Ambition: " + student.getAmbition()
                + ", Ingenuity: " + student.getIngenuity()
                + ", LustForPower: " + student.getLustForPower()
        );
        System.out.println();
    }
}
