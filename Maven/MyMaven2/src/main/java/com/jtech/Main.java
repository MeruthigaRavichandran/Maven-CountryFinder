package com.jtech;
import com.itech.CountryFinder;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        CountryFinder countryFinder = new CountryFinder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the CountryCode :");
        String countryCode = scanner.next();
        System.out.println(countryFinder.findCountry(countryCode));
    }
}
