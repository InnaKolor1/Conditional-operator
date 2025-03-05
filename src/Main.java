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
        int degreesOutside = 4;
        if (degreesOutside <= 5) {
            System.out.println(" На улице " + degreesOutside + " нужно надеть шапку ");
        } else {
            System.out.println(" На улице " + degreesOutside + " градусов, можно идти без шапки ");
        }

        System.out.println("Задача3");

        int speed = 50;
        if (speed <= 60) {
            System.out.println(" Если скорость " + speed + " можно ездить спокойно ");
            if (speed > 60) {
                System.out.println(" Если скорость " + speed + " придется заплатить штраф ");
            }
        }

        System.out.println("Задача4");
        int theManIsOld = 4;
        if (theManIsOld >= 2 && theManIsOld <= 6) {
            System.out.println(" Если возраст человека равен " + theManIsOld + " , то ему нужно ходить в детский сад");
            theManIsOld = 10;
            if (theManIsOld >= 7 && theManIsOld <= 17) {
                System.out.println(" Если возраст человека равен " + theManIsOld + " ,то ему нужно ходить в школу");

                theManIsOld = 22;
                if (theManIsOld >= 18 && theManIsOld <= 24) {
                    System.out.println(" Если возраст человека равен " + theManIsOld + " ,то его место в университете");

                    theManIsOld = 28;
                    if (theManIsOld >= 24) {
                        System.out.println(" Если возраст человека равен " + theManIsOld + " ,то его место в университете");
                    }
                }
            }
        }

        System.out.println("Задача5");
        int theChildIsYearsOld = 3;
        if (theChildIsYearsOld <= 5) {
            System.out.println(" Если возраст ребенка равен " + theChildIsYearsOld + " ,то ему нельзя кататься на аттракционе ");

            int theChildIsYearsOld2 = 10;
            if (theChildIsYearsOld2 >= 5 && theChildIsYearsOld2 <= 14)
                System.out.println(" Если возраст ребенка равен " + theChildIsYearsOld2 + " ,то можно кататься на аттракционе в сопровождении ");

            int theChilIsYearsOld3 = 16;
            if (theChilIsYearsOld3 >= 14) {
                System.out.println(" Если возраст ребенка равен " + theChilIsYearsOld3 + " ,то можно без сопровождения взрослого ");
            }


            System.out.println("Задача6");

            int capacityOfOneTraineCarriage = 28;
            if (capacityOfOneTraineCarriage <= 102) {
                System.out.println(" Если в вагоне " + capacityOfOneTraineCarriage + " мест, то есть еще места в вагоне ");

                int seatingPositions = 58;
                if (seatingPositions <= 60) {
                    System.out.println(" Если в вагоне " + seatingPositions + " мест, то есть 2 сидячих места ");

                    int stadingPositins = 60;
                    if (stadingPositins <= 62) {
                        System.out.println(" Если в вагоне " + stadingPositins + " мест, то есть 2 стоячих места ");
                    }
                }
            }

            System.out.println("Задача7");

            int one = 1;
            int two = 2;
            int three = 3;

            if (three>two&&three>one) {
                System.out.println(" 3 больше чем 1 и 2 ");
            }else if(two>one&&two<three) {
                System.out.println(" 2 меньше чем 3, но большем чем 1");
            }else {
                System.out.println(" Самое большое число 3 ");
            }
        }
    }
}



