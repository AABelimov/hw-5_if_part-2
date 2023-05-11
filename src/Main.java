public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
    }

    public static void task1(){
        int clientOS = 1;

        System.out.println("Task1:");
        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
    }

    public static void  task2(){
        int clientOS = 1;
        int clientDeviceYear = 2013;

        System.out.println("Task2:");
        if(clientOS == 0){
            if(clientDeviceYear < 2015) System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if(clientDeviceYear < 2015) System.out.println("Установите облегченную версию приложения для Android по ссылке");
        else System.out.println("Установите версию приложения для Android по ссылке");
    }

    public static void task3(){
        int year = 2024;

        System.out.println("Task3:");
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) System.out.println(year + " является високосным");
        else System.out.println(year + " не является високосным");
    }

    public static void task4(){
        int deliveryDistance = 19;

        System.out.println("Task4:");
        if(deliveryDistance < 20) System.out.println("Потребуется 1 день");
        else if(deliveryDistance < 60) System.out.println("Потребуется 2 дня");
        else if(deliveryDistance <= 100) System.out.println("Потребуется 3 дня");
        else System.out.println("Доставки нет(");
    }

    public static void task5(){
        int monthNumber = 6;

        if(monthNumber > 0 && monthNumber < 13){
            System.out.println("Task5:");
            switch(monthNumber){
                case 1:
                    System.out.println("Зима");
                    break;
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                    System.out.println("Весна");
                    break;
                case 4:
                    System.out.println("Весна");
                    break;
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                    System.out.println("Лето");
                    break;
                case 7:
                    System.out.println("Лето");
                    break;
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                    System.out.println("Осень");
                    break;
                case 10:
                    System.out.println("Осень");
                    break;
                case 11:
                    System.out.println("Осень");
                    break;
                case 12:
                    System.out.println("Зима");
                    break;
            }
        }
    }
}