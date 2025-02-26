import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача1");

        int age = 17;
        if (age >= 18) {
            System.out.println(" Возраст совершенолетия еще не наступил, нужно немного подождать ");
        } else {
            System.out.println(" Возраст 18 или больше лет ");
        }
            int age2 = 19;
            if (age2 >= 18) {
                System.out.println(" Возраст 18 или больше лет ");
            } else {
                System.out.println(" Возраст совершенолетия еще не наступил, нужно немного подождать ");
            }

        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature <= 5 || temperature >= 5) {
            System.out.println(" На улице " + temperature + " градуса, нужно надеть шапку ");
        } else {
            System.out.println(" На улице " + temperature + " градусов, можно идти без шапки ");
        }

            System.out.println("Задача3");

            int speed = 50;
            if (speed <= 60) {
                System.out.println(" Если скорость " + speed + " можно ездить спокойно ");
            } else {
                System.out.println(" Если скорость " + speed + " придется заплатить штраф ");
            }

    System.out.println("Задача4");
            int theManIsOld=4;
            if (theManIsOld>=2&&theManIsOld<=6) {
                System.out.println(" Если возраст человека равен " + theManIsOld + " , то ему нужно ходить в детский сад");
            }
            int theManIsOld2=10;
            if(theManIsOld2>=7&&theManIsOld2<=17){
                System.out.println(" Если возраст человека равен "+theManIsOld2+" ,то ему нужно ходить в школу");
            }
            int theManIsOld3=22;
            if(theManIsOld3>=18&&theManIsOld3<=24){
                System.out.println(" Если возраст человека равен "+theManIsOld3+" ,то его место в университете");
            }
            int theManIsOld4=28;
            if(theManIsOld4>=24){
                System.out.println(" Если возраст человека равен "+theManIsOld4+" ,то его место в университете");
            }
        System.out.println("Задача5");
            int theChildIsYearsOld=3;
            if (theChildIsYearsOld<=5) {
                System.out.println(" Если возраст ребенка равен " + theChildIsYearsOld + " ,то ему нельзя кататься на аттракционе ");
            }
            int theChildIsYearsOld2=10;
            if (theChildIsYearsOld2>=5&&theChildIsYearsOld2<=14){
                System.out.println(" Если возраст ребенка равен "+theChildIsYearsOld2+" ,то можно кататься на аттракционе в сопровождении ");
            }
int theChilIsYearsOld3=16;
if (theChilIsYearsOld3>=14){
    System.out.println(" Если возраст ребенка равен "+theChilIsYearsOld3+" ,то можно без сопровождения взрослого ");
}
        System.out.println("Задача6");

int capacityOfOneTraineCarriage=102;
int seatingPositions=60;
int otherPlaces=(capacityOfOneTraineCarriage-seatingPositions);
if (otherPlaces<capacityOfOneTraineCarriage) {
    System.out.println(otherPlaces + " сидячих мест ");
}else {
    System.out.println(capacityOfOneTraineCarriage+" стоячих мест");
}

System.out.println("Задача7");
int one=1;
int two=2;
int three=3;
if (three > two && three > one) {
System.out.println(three + " больше, чем " + two + " и больше, чем " + one);
}else{
if(two>one&&two<three) {
System.out.println(two + " больше, чем " + one + " и меньше, чем " + three);
if (one < two && one < three) {
    System.out.println(one + " меньше, чем " + two + " и меньше, чем " + three);
}
        }
    }
}

            }




