
abstract class Person {

        protected String name;
        protected String surname;
        protected int age;
        protected String reason;
        protected String place;

    protected Person() {
        this.name = "unknown";
        this.surname = "unknown";
        this.age = 0;
    }

    protected Person(String name, String surname, int age, String reason, String place) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.reason = reason;
        this.place = place;
    }


    public void selfIntroduction() {
        System.out.println("Cześć, nazywam się " + this.name + " " + this.surname + " mam " + this.age + " lat.");
    }

    public void reasonAttending() {
        System.out.println("Chodzę do szkoły dla : " + reason);

    }

    public void holidayInfo() {
        System.out.println("Wakacje spędzam " + place);
    }

}
