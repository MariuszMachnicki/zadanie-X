public class Main {

    public static void main (String[] args) {

        Student s = new Student("Wojtek", "Kowalski", 55, "po wiedzę", "Radomiu", 4,
                421, 5, "Składanie telefonów");
            s.selfIntroduction();
            s.holidayInfo();
            s.reasonAttending();
            s.wayOfLearning("czytajac");
            s.freeTime("piwku");


        System.out.println("\n-------------\n");

            Teacher t = new Teacher("Karol", "Okrasa", "Magister", 45, 5000, "Nauczać", "Radomiu");
            t.selfIntroduction();
            t.holidayInfo();
            t.reasonAttending();
            t.howExam("przeprowadzam testy");
            t.howWork("12h dziennie");
            t.scientificWork("kopiujac teksty");
            t.calculateBonus();

        System.out.println("\n---------------\n");
        System.out.println("Wpis do indeksu: ");

            ScoreCard sc = new ScoreCard();
            sc.printIndeks();
            sc.zadanko();

    }
}
