public class Student {

    int numberStudentBilet;
    String studentName;
    String studentFamaly;
    int earsLesson;
    String age;
    double ratingMatematica;
    double ratingEconomica;
    double ratingEnglish;
    String items;
    int nomerscheta;
    int balans = 200;

    public Student (String studentName, String studentFamaly, int numberStudentBilet, double ratingMatematica, double ratingEconomica, double ratingEnglish, int earsLesson){

        this.studentName = studentName;
        this.studentFamaly = studentFamaly;
        this.numberStudentBilet = numberStudentBilet;
        this.ratingMatematica = ratingMatematica;
        this.ratingEconomica = ratingEconomica;
        this.ratingEnglish = ratingEnglish;
        this.earsLesson = earsLesson;

    }

    public void popolnenie (int a){
        balans = balans + a;
        System.out.println("Баланс счета студента после пополнения: " + balans + " руб.");
    }

    public void snyatie (int a){
        balans = balans - a;
        System.out.println("Баланс счета студента после снятия: " + balans + " руб.");
    }

    public Student (){

    }

    double rating (){
        //System.out.println(rating());
        return (this.ratingMatematica + this.ratingEnglish + this.ratingEconomica)/3;
    }

    String age1 () {
        if (this.earsLesson >= 5) {
            return this.age = " лет";

        } else if (this.earsLesson <= 4) {
            return this.age = " года";

        } else
            return this.age;
    }

}
