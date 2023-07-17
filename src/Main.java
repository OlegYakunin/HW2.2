public class Main {
    public static void main(String[] args) {
        Gryffindor garPot= new Gryffindor("Гарри Поттер",23,31,31,31,11);
        Gryffindor gerGrei = new Gryffindor("Гермиона Грейнджер", 44,3,61,51,1);
        Gryffindor ronWis= new Gryffindor("Рон Уизли", 24,25,25,87,83);

        Slytherin draMal = new Slytherin("Драко Малфой", 23,72,71,17,17,17,17);
        Slytherin greMon = new Slytherin("Грэхэм Монтегю", 72,83,82,12,36,82,2);
        Slytherin gregGo = new Slytherin("Грегори Гойл", 31,73,38,1,9,28,67);

        Hufflepuff zahSmi = new Hufflepuff("Захария Смит",61,62,11,98,12);
        Hufflepuff sedDig = new Hufflepuff("Седрик Диггори", 1,61,8,17,2);
        Hufflepuff dgaFin = new Hufflepuff("Джастин Финч-Флетчли",94,1,36,6,11);

        Ravenclaw choCha = new Ravenclaw("Чжоу Чанг",61,61,83,1,36,61);
        Ravenclaw paPat = new Ravenclaw("Падма Патил", 94,4,27,11,5,11);
        Ravenclaw marBe = new Ravenclaw("Маркус Белби",77,77,77,1,1,1);

        PrintStudentDescription printStudentDescription = new PrintStudentDescription();
        printStudentDescription.print(gerGrei);
        printStudentDescription.print(marBe);

        CompareStudents compareStudents = new CompareStudents ();
        compareStudents.compareStudentsGryffindor(gerGrei, ronWis);
        compareStudents.compareStudentsSlytherin(greMon, draMal);
        compareStudents.compareStudentsHufflepuff(sedDig, zahSmi);
        compareStudents.compareStudentsRavenclaw(choCha, paPat);
        compareStudents.compareStudentsAll(choCha, garPot);
        compareStudents.compareStudentsAll(draMal, gerGrei);



    }
}