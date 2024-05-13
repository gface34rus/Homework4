public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 20;
        boolean adult = age>=18;
        if (adult){
            System.out.println("Если возраст человека равен "+age+" , то он совершеннолетний.");
        }else {
            System.out.println("Если возраст человека равен "+age+" , то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println();
        System.out.println("Задача 2");
        int airTemperature = 15;
        boolean needCap = airTemperature<5;
        if (needCap){
            System.out.println("На улице "+airTemperature+" градуса, нужно надеть шапку.");
        }else {
            System.out.println("На улице "+airTemperature+" градусов, можно идти без шапки.");
        }

        System.out.println();
        System.out.println("Задача 3");
        int speed = 61;
        boolean overSpeed = speed>60;
        if (overSpeed){
            System.out.println("Если скорость "+speed+"км/час, то придется заплатить штраф.");
        }else {
            System.out.println("Если скорость "+speed+"км/час, то можно ездить спокойно.");
        }

        System.out.println();
        System.out.println("Задача 4");
        int age2 = 12;
        boolean kindergartenReady = age2 >= 2 && age2 <= 6;
        boolean schoolReady = age2 >= 7 && age2 <= 17;
        boolean universityReady = age2 >= 18 && age2 <= 24;
        boolean jobReady = age2>24;
        if (kindergartenReady){
            System.out.println("Если возраст человека равен "+age2+", то ему нужно ходить в детский сад.");
        }
        if (schoolReady){
            System.out.println("Если возраст человека равен "+age2+", то ему нужно ходить в школу.");
        }
        if (universityReady){
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет.");
        }
        if (jobReady){
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу.");
        }

        System.out.println();
        System.out.println("Задача 5");
        int age3 = 16;
        if (age3<5){
            System.out.println("Если возраст ребенка равен "+age3+", то ему нельзя кататься на аттракционе.");
        }
       else if (age3>5 && age3<14){System.out.println("Если возраст ребенка ревен "+age3+", " +
                "то ему можно кататься на аттракционе, только в сопровождении взрослого.");
        }
        else {System.out.println("Если возраст ребенка ревен "+age3+", то он может кататься на аттракционе, " +
                "без сопровождения взрослых.");
        }

        System.out.println();
        System.out.println("Задача 6");
        int carriageCapacity = 102;
        int seatPlace = 60;
        int numberOfPassengers = 102;
        boolean seatIsEmpty = numberOfPassengers<=seatPlace;
        boolean standingPlaceIsEmpty = numberOfPassengers>seatPlace && numberOfPassengers<carriageCapacity;
        if (numberOfPassengers>=carriageCapacity){
            System.out.println("Вагон полностью забит. Мест не осталось.");
        }
       else if (standingPlaceIsEmpty){
            System.out.println("В вагоне остались только стоячие места.");
       }
        else if(seatIsEmpty) {
            System.out.println("В вагоне остались и сидячие и стоячие места");
        }

        System.out.println();
        System.out.println("Задача 7");
        int one = 1;
        int two = 8;
        int three = 13;
        if (one>two && one>three){
            System.out.println(one);
        }
       else if (two>one && two>three){
            System.out.println(two);
       }
        else if (three>one && three>two){
            System.out.println(three);
        }
    }
}