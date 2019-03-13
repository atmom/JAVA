package lesson5;
public class Empioyee {
    private String surname;
    private String name;
    private String patronymic;
    private String email;
    private String  telefon;
    private int salary;
    private int age;

    public void info() {
        System.out.println(surname + " " + name + " " + patronymic + ":");
        System.out.println("email: " + email);
        System.out.println("телефон: " + telefon);
        System.out.println("заработная плата: " + salary);
        System.out.println("возраст: " + age+"\n");
    }

    public Empioyee(String surname, String name, String patronymic, String email, String  telefon, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.email = email;
        this.telefon = telefon;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
