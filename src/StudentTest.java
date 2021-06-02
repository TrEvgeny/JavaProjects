import jdk.jshell.Snippet;

import java.io.*;
import java.nio.*;
import java.util.Scanner;


public class StudentTest {

    public static void main(String[] args) {


//        Student student = new Student();
//        student.add("Иван", "Федоров,", 568743,5,3,4,5);
//        student.add("Пётр", "Соколов,", 965782,5,5,5,4);
//        student.add("Михаил", "Кошелев,", 835941,3,3,3,6);
//        System.out.println(student.items);
//
//        //Запись данных в файл
//        String data = student.items;
        


        System.out.println("\nПеречень студентов: \n");
        Student Ivan = new Student("Иван", "Федоров", 568743,5,3,4,5);
        System.out.println("Средний рейтинг студента " + (Ivan.rating()));
        System.out.println("Обучается в университете в годах: " + Ivan.earsLesson + (Ivan.age1()));
        System.out.println(Ivan.studentName + " " + Ivan.studentFamaly + ", " +" Номер студентчиского билета: " + Ivan.numberStudentBilet);
        System.out.println("Номер счета студента" );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму пополнения: ");
        int a;
        a = scanner.nextInt();
        Ivan.popolnenie(a);


        Student Petr = new Student("Пётр", "Соколов,", 965782,5,5,5,4);
        System.out.println("\nСредний рейтинг студента " + (Petr.rating()));
        System.out.println("Обучается в университете в годах: " + Petr.earsLesson + (Petr.age1()));
        System.out.println(Petr.studentName + " " + Petr.studentFamaly + ", " +" Номер студентчиского билета: " + Petr.numberStudentBilet);
        System.out.println("Введите сумму пополнения: ");
        int a2;
        a2 = scanner.nextInt();
        Petr.popolnenie(a2);


        Student Misha = new Student("Михаил", "Кошелев,", 835941,3,3,3,6);
        System.out.println("\nСредний рейтинг студента " + (Misha.rating()));
        System.out.println("Обучается в университете в годах: " + Misha.earsLesson + (Misha.age1()));
        System.out.println(Misha.studentName + " " + Misha.studentFamaly + ", " +" Номер студентчиского билета: " + Misha.numberStudentBilet);
        System.out.println("Введите сумму пополнения: ");
        int a1;
        a1 = scanner.nextInt();
        Misha.popolnenie(a1);

        writeUsingFileWriter(Ivan.studentFamaly);


    }
// Подробности записи тут https://javadevblog.com/kak-zapisat-v-fajl-na-java-primery-s-filewriter-bufferedwriter-files-i-fileoutputstream.html

    private static void writeUsingFileWriter(String data) {
        File file = new File("FileWriter.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
