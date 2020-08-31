public class Student extends Person implements BeerDrinker, ExamTaker {
    private String fieldOfStudy;
    private int year;
    private int semestr;
    private int indexNumber;

    public Student(String name, String surname, int age, String reason, String place, int year, int indexNumber, int semestr, String fieldOfStudy) {
        super(name, surname, age, reason, place);
        this.fieldOfStudy = fieldOfStudy;
        this.semestr = semestr;
        this.year = year;
        this.indexNumber = indexNumber;
    }

    public void selfIntroduction() {
        System.out.println("Cześć, nazywam się " + this.name + " " + this.surname + " mam " + this.age + " lat.");
        System.out.println("Jestem na kierunku " + this.fieldOfStudy + ", " + this.semestr + " semetrze " + this.year + " roku. " + "Mój numer indeksu to:  " + this.indexNumber);
    }

    public void reasonAttending() {
        System.out.println("Chodzę do szkoły " + reason);
    }

    public void holidayInfo(){
        System.out.println("Wakacje spędzam w " + place);
    }


    @Override
    public void freeTime(String piwo){
        System.out.println("Wolny czas spędzam na " + piwo);
    }

    @Override
    public void wayOfLearning(String read){
        System.out.println("Uczę się " + read);

    }


}


