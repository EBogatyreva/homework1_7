package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String changeNumber = "Иванов Семён Семёнович";
        String fullName = lastName + " " + firstName + " " + middleName;

        //Задание 1.
        System.out.println("ФИО сотрудника — " + fullName);
        //Задание 2.
        String s = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + s);
        //Задание 3.
        s = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + s);

        //Задание 4.
        //вариант 1.
        String change = changeNumber.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + change);
        //вариант 2.
        if (changeNumber.contains("ё")) {
            String change1 = changeNumber.replace("ё", "е");
            System.out.println("Данные ФИО сотрудника — " + change1);
        }
    }
}
