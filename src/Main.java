public class Main {
    public static void main(String[] args) {
        //Exercise 1
        int clientOS = (int) (Math.random() * 2);
        if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");
        else
            System.out.println("Установите версию приложения для IOS по ссылке");

        //Exercise 2
        int prodYear = 2010 + (int) (Math.random() * ((2022 - 2010) + 1));
        if (clientOS == 1) {
            if (prodYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (prodYear >= 2015) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
        }

        //Exercise 3
        int year = 2000 + (int) (Math.random() * ((2022 - 2000) + 1));

        if (year % 4 != 0) {
            System.out.println(year + " не является високосным");
        } else {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println(year + " не является високосным");
            } else {
                System.out.println(year + " является високосным");
            }
        }


        //Exercise 4
        int deliveryDistance = 95;
        int count = 1;

        deliveryDistance -= 20;
        if (deliveryDistance <= 0) {
            System.out.println("Потребуется дней: " + count);
        } else {
            int variable = deliveryDistance / 40; //количество 40 км расстояний в deliveryDistance
            if (variable == 0) {
                count++;
            } else {
                count += variable + 1;
            }
            System.out.println("Потребуется дней: " + count);
        }

        //Exercise 5 (1й вариант)
        int mouth = 12;

        if (mouth > 12) {
            System.out.println("Неверный месяц");
        } else {
            switch (mouth) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
            }
        }
    }
}