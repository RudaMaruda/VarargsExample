public class VarargsExample {

    public static void main(String[] args) {
        System.out.println("Varargs were introduced in Java 5 and provide a short-hand for methods that support an arbitrary number of parameters of one type.");
        System.out.println("Example:  [type] methodName(type... arguments)\n");

        //1st method without using varargs:
        int sum = addWithoutVarargs(1,2,3);
        System.out.println("Method addWithoutVarargs(1,2,3), sum = "+sum);
        System.out.println("If we have more arguments we have to write new method or overwrite existing.");
        sum = addWithoutVarargs(1,2,3,4);
        System.out.println("Method addWithoutVarargs(1,2,3,4), sum = "+sum+"\n");

        //2nd method with using varargs:
        System.out.println("When we use varangs in method: int add(int... numbers)");
        System.out.println("Example: sumWithVarargs = add(16,42,1,3,9,22): ");
        int sumWithVarargs = add(16,42,1,3,9,22);
        System.out.println("sumWithVarargs = "+ sumWithVarargs+"\n");

        //3nd method with using one argument and varargs
        System.out.println("When we use one argument and varangs in method: int multiplication(int multiplier,int... numbers)");
        System.out.println("Remember! varargs always have to be in the end of arguments in method! and we could only one use varargs inside provided arguments");
        System.out.println("Wrong use: int multiplication(int... numbers,int multiplier)");
        System.out.println("Wrong use: int multiplication(int... numbers,int... multiplier)");
        System.out.println("Correct use: multiplication(2,22,48,96,74): ");
        System.out.println("result: ");
        multiplication(2,22,48,96,74);


    }

    public static int addWithoutVarargs(int number1, int number2, int number3){
        return number1+number2+number3;
    }
    public static int addWithoutVarargs(int number1, int number2, int number3, int number4){
        return number1+number2+number3+number4;
    }

    public static int add(int... numbers){
        int[] numbersArgument = numbers;
        int sumVarargs = 0;

        System.out.println("Lets check our array:");
        for (int i : numbersArgument) {
            System.out.print(i+" ");
        }
        System.out.println("\nLet's check position in array (our arguments in method add())");

        for (int j = 0; j < numbers.length; j++) {
            System.out.println("Position ["+j+"] in our array is: "+numbers[j]);
            sumVarargs+=numbers[j];
        }
        return sumVarargs;
    }

    public static void multiplication(int multiplier,int... numbers){

        for (int number : numbers) {
            System.out.println(multiplier+" * "+number+" = "+multiplier*number);
        }

    }


}
