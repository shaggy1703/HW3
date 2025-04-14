public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Тебе нет 18, немного подожди");
        }
        int age1 = 17;
        if (age1 < 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он еще не достиг соввершеннолетия,нужно немного подождать");
        } else {
            System.out.println("Ты совершеннолетний");
        }
        System.out.println("Задание 2");

        int t = 4;
        if (t < 5) {
            System.out.println("На улице " + t + " градусов,нужно надеть шапку");
        } else {
            System.out.println("На улице тепло");
        }
        int t1 = 6;
        if (t1 > 5) {
            System.out.println("На улице " + t1 + " градусов,можно идти без шапки");
        } else {
            System.out.println("На улице холодно");
        }

        System.out.println("Задание 3");

        int speed1 = 70;
        if (speed1 > 60) {
            System.out.println("Если скорость " + speed1 + ", то придеться заплатить штраф");
        } else {
            System.out.println("Ты едешь спокойно");
        }
        int speed2 = 50;
        if (speed2 < 60){
            System.out.println("Если скорость " + speed2 + ", то можно ездить спокойно");
        }else {
            System.out.println("Ты заплатишь штраф");
        }

        System.out.println("Задание 4");

        int age2To6 = 3;
        if (age2To6>=2 && age2To6<=6){
            System.out.println("Если возраст человека равен " + age2To6 + ", то ему нужно ходить в детский сад");
        }
        int age7To17 = 10;
        if (age7To17>=7 && age7To17<=17){
            System.out.println("Если возраст человека равен " + age7To17 + ", то ему нужно ходить в школу");
        }

        int age18To24 = 22;
        if (age18To24 >=18 && age18To24 <=24){
            System.out.println("Если возраст человека равен " + age18To24 + ", то ему нужно ходить в университет");
        }
        int ageMore24 = 27;
        if (ageMore24 > 24){
            System.out.println("Если возраст человека равен " + ageMore24 + ", то ему нужно ходить на работу");
        }

        System.out.println("Задание 5");

        int childAgeLess5 = 4;
        if (childAgeLess5 < 5){
            System.out.println("Если возраст ребенка равен " + childAgeLess5 + ", то ему нельзя кататься на аттракционе");
        }
        int age5To14 = 12;
        if (age5To14 > 5 && age5To14 < 14){
            System.out.println("Если возраст ребенка равен " + age5To14 + ", то ему можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        int ageMore14 = 16;
        if (ageMore14 > 14){
            System.out.println("Если возраст ребенка равен " + ageMore14 + ", то ему можно кататься без сопровождения взрослого");
        }

        System.out.println("Задание 6");

        int place = 3;
        if (place > 60 && place <= 102) {
            System.out.println("Если место номер " + place + ", то место стоячее");
        }
        if (place < 60){
            System.out.println("Если место номер " + place + ", то место сидячее");
        } else if (place > 102) {
            System.out.println("Если мест " + place + ", то вагон забит");
        }

        System.out.println("Задание 7");

        int one = 5;
        int two = 3;
        int three = 6;

        if (one>two && one>three){
            System.out.println("Максимальное число " + one);
        }else if (two>one && two>three){
            System.out.println("Максимальное число " + two);
        }else if (three>one && three>two){
            System.out.println("Максимальное число " + three);
        }
    }
}