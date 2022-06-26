package HomeWork_GB;

public class Lesson_1 {


        public static void main(String[] args) {
//            printThreeWords();
//            checkSumSign();
//            printColor();
            compareNumbers();

        }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
            int a = 10;
            int b = 20;
            if ((a+b) >= 0){
                System.out.println("Сумма положительная");
            }
            if ((a+b) < 0){
                System.out.println("Сумма отрицательная");
            }

    }
    public static void printColor(){
            int value = 110;
            if (value <= 0){
                System.out.println("Красный");
            }
            if (value > 0 && value < 100){
                System.out.println("Желтый");
            }
            if(value > 100){
                System.out.println("Зеленый");
            }
    }
    public static void compareNumbers(){
            int a = 11;
            int b = 22;
            if (a >= b){
                System.out.println("a >= b");
            }
            if (a < b){
                System.out.println("a < b");
            }

    }
    }



