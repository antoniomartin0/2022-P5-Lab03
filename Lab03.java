public class Lab03 {
    public static void main(String args[]){
        int startingValue = 10000;
        int hours = startingValue / 3600;
        int seconds = startingValue % 3600;
        int minutes = seconds / 60;
        int leftOver = seconds % 60;

        System.out.println(startingValue  / 3600);
        System.out.println(startingValue % 3600);
        System.out.println(seconds / 60);
        System.out.println(seconds % 60);





        // Please do NOT do this
        System.out.println("Starting seconds: " + startingValue);
        System.out.println("Hours:      " + hours);

    }

}
