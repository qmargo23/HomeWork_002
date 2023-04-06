public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        var paper= 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5 ;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper= 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var boxer_1 = 78.2;
        var boxer_2 = 82.7;
        var totalWeight = boxer_1 + boxer_2;
        System.out.println(totalWeight);
        var differenceWeight = boxer_2 - boxer_1;
        System.out.println(differenceWeight);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var boxer_1 = 78.2;
        var boxer_2 = 82.7;
        var differenceWeight_1 = boxer_2 - boxer_1;
        System.out.println(differenceWeight_1);
        var differenceWeight_2 = boxer_2 % boxer_1;
        System.out.println(differenceWeight_2);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var allWorkingHours = 640;
        var workingHours = 8;
        var companyEmployee = allWorkingHours / workingHours;
        System.out.println("Всего работников в компании — " + companyEmployee + " человек");
        companyEmployee = companyEmployee + 90;
        var newAllWorkingHours = companyEmployee * workingHours;
        System.out.println("Если в компании работает " + companyEmployee + " человек, то всего " + newAllWorkingHours + " часов работы может быть поделено между сотрудниками");
    }
}