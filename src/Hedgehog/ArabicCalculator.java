package Hedgehog;

public class ArabicCalculator {

    public static void calculate (String concole) {
        int operand1 = Integer.parseInt(concole.split(" ")[0]); // получаем из строки число и записываем его в индекс 2
        int operand2 = Integer.parseInt(concole.split(" ")[2]);
        String operator = concole.split(" ")[1];

        //    if (operator.equals("+")) {

        //        return sum(operand1, operand2);
        //    } else if (operator.equals("-")) {

        //        return sub(operand1, operand2);
        //    } else if (operator.equals("*")) {

        //        return mul(operand1, operand2);
        //    } else if (operator.equals("/")) {


        //        return div(operand1, operand2);
        //    }
        //
        //    return 0;

        switch (operator) {
            case "+":
                sum(operand1, operand2);
                break;
            case "-":
                sub(operand1, operand2);
                break;
            case "*":
                mul(operand1, operand2);
                break;
            case "/":
                div(operand1, operand2);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }




    private static void sum (int operand1, int operand2){
        System.out.println(operand1 + operand2);
    }
    private static void sub (int operand1, int operand2){
        System.out.println(operand1 - operand2);
    }
    private static void mul (int operand1, int operand2){
        System.out.println(operand1 * operand2);
    }
    private static void div (int operand1, int operand2) {
        if (operand2 != 0) {
            System.out.println(operand1 / operand2);
        } else {
            System.out.println("Деление на ноль");
        }
    }


}
