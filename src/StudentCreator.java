import java.util.NoSuchElementException;
public class StudentCreator<MAX_STUDENT_AGE> extends Student {


    private static final int MAX_STUDENT_AGE = 30;

    public StudentCreator(String name, String surname, int age, String reason, String place, int year, int indexNumber, int semestr, String fieldOfStudy) {
        super(name, surname, age, reason, place, year, indexNumber, semestr, fieldOfStudy);
        {
        if (age>MAX_STUDENT_AGE) {
            System.out.println("Maksymalnie 30 lat.");
            throw new NoSuchElementException("Student nie został utworzony.");
        } else {
            Student student = new Student( name, surname, age, reason, place,  year,  indexNumber,  semestr,  fieldOfStudy);
        }
    }
}
}