public class Main {
    public static void main(String[] args) {
        task1 ();
        task2();
        task3();
        task4();
        task5();

    }

    private static void task1() {
        System.out.println("Задача 1");
        int clientOs = 0;
        if (clientOs == 1 ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
    }


    private static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 7;
        if (monthNumber <= 12);
        switch (monthNumber) {
            case 1 :
            case 2 :
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;

        }
    }

    private static void task4() {
        System.out.println("Задача 4");
         int deliveryDistance = 99;
         if (deliveryDistance <= 20) {
             System.out.println("Потребуется дней : 1");
         } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
             System.out.println("Потребуется дней : 2");
         } else if (deliveryDistance > 60 && deliveryDistance <= 100 ){
             System.out.println("Потребуется дней : 3");
         } else {
             System.out.println("Свыше 100 км доставки нет");
         }
    }

    private static void task3() {
        System.out.println("Задача 3");
        int year = 1996;
        if ( year % 4 == 0) {
            System.out.println(year + " год является високосным ");
        }
        else {
            System.out.println( year + " год не является високосным");
        }
    }

    private static void task2() {
        System.out.println("Задача 1-2");
        int clientOS = 0; // ios = 0 ; android = 1
        int clientDeviceYear = 2013;

        if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите упрощенную версию приложения для Андроид по ссылке");
            }
        }
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите упрощенную версию приложения для IOS по ссылке");
            }
        }
    }
}





