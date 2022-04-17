package Hedgehog;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Locale;

public class Calculate {

    private static String getConsole() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static void main(String[] args) throws IOException {

        String console = getConsole();



        while (!console.toLowerCase().equals("exit")){
            ArabicCalculator.calculate(console);
            console = getConsole();
        }



    }
}
