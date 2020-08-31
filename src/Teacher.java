public class Teacher extends Person implements ExamConducter {
    private String degree;
    private double salary;
    private double annualSalary;
    private double annualBonus;


    public Teacher(String name, String surname, String degree, int age, int salary, String reason, String place) {
        super(name, surname, age, reason, place);
        this.salary = salary;
        this.degree = degree;

    }
    public void calculateBonus() {
        this.annualSalary = this.salary * 12;
        this.annualBonus = annualSalary * 0.1;
        System.out.println("Mam tytuł " + this.degree + " zarabiam " + this.salary + " , co daje rocznie " + this.annualSalary + ". A roczna premia to " + this.annualBonus);
    }


    public void selfIntroduction() {
        System.out.println("Cześć, nazywam się " + this.name + " " + this.surname + " mam " + this.age + " lat.");

    }

    public void reasonAttending() {
        System.out.println("Chodzę do szkoły, by: " + reason);

    }

    public void holidayInfo() {
        System.out.println("Wakacje spędzam " + place);


    }

    @Override
    public void howExam(String exam) {
        System.out.println(exam);
    }

    @Override
    public void howWork(String work) {
        System.out.println("Pracuje po " + work);
    }

    @Override
    public void scientificWork(String scienWork) {
        System.out.println("Prace naukowe robie " + scienWork);
    }
}