public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Enter one integer argument:");
            return;
        }

        try {
            int userArgs = Integer.parseInt(args[0]);

            if (userArgs < 0) {
                System.out.println("Please enter a positive integer or 0.");
                return;
            }


            System.out.println("The Fibonacci number for " + userArgs + " is " + CalcFib(userArgs));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please re-enter a valid integer.");
        }
    }


    public static int CalcFib(int userArgs) {
        if (userArgs == 0) return 0;
        if (userArgs == 1) return 1;
        return CalcFib(userArgs - 1) + CalcFib(userArgs - 2); 
}
}