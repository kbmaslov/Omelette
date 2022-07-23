public class Omelette {
    public static void main(String[] args){
        Fridge.whatisinsidetheFridge();
        Dish.cookomelette();
        }
    static class Fridge{
        static int eggNumber = 12;
        static String bread = "bread";
        static String milk = "milk";
        byte число = 10;
        short число2 = 30000;
        long bigNumber;
        char знак;
        public static void whatisinsidetheFridge(){
            System.out.print("на данный момент в холодильнике:" + eggNumber + "egg" + bread + milk);
        }
    }
    static class Dish{
        static String dish;
        public static void cookomelette(){
            dish = Fridge.eggNumber + Fridge.milk;
            System.out.print(dish);
        }
    }
}
