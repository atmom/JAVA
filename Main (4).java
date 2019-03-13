package lesson5;

public class Main {

    public static void main(String[] args) {
        Empioyee[] empArr = new Empioyee[5];
        empArr [0]= new Empioyee("Иванов", "Иван", "Иванович", "ivanov@mail.ru", "89999999991", 85000,40);
        empArr [1]= new Empioyee("Петров", "Петр", "Петрович", "petrov@mail.ru", "89999999992", 70000,35);
        empArr [2]= new Empioyee("Васькин", "Василий", "Васильевич", "vasin@mail.ru", "89999999993", 60000,54);
        empArr [3]= new Empioyee("Кувшкинкин", "Иван", "Иванович", "kuv@mail.ru", "89999999994", 85000,62);
        empArr [4]= new Empioyee("Иванова", "Лариса", "Петровна", "ivanova@mail.ru", "89999999995", 40000,33);

        for (Empioyee empioyee: empArr) {
            int age = empioyee.getAge();
            if(age > 40){
                empioyee.info();
            }

        }
    }


}
