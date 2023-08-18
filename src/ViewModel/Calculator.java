package ViewModel;

import Model.Fraction;

import java.sql.SQLOutput;

public class Calculator {


public Fraction add(Fraction fraction1, Fraction fraction2){
    int numerant = fraction1.getNumerant() * fraction2.getDenumerant() + fraction2.getNumerant() * fraction1.getDenumerant();
    int denumerant = fraction1.getDenumerant() * fraction2.getDenumerant();
    Fraction result = new Fraction(numerant, denumerant);
    return result;
}
public Fraction subtract(Fraction fraction1, Fraction fraction2){
    int numerant = fraction1.getNumerant() * fraction2.getDenumerant() - fraction2.getNumerant() * fraction1.getDenumerant();
    int denumerant = fraction1.getDenumerant() * fraction2.getDenumerant();
    Fraction result = new Fraction(numerant, denumerant);
    return result;
}
public Fraction multiply(Fraction fraction1, Fraction fraction2){
    int numerant = fraction1.getNumerant() * fraction2.getNumerant();
    int denumerant = fraction1.getDenumerant() * fraction2.getDenumerant();
    Fraction result = new Fraction(numerant, denumerant);
    return result;
}
public Fraction divide(Fraction fraction1, Fraction fraction2){
    int numerant = fraction1.getNumerant() * fraction2.getDenumerant();
    int denumerant = fraction1.getDenumerant() * fraction2.getNumerant();
    Fraction result = new Fraction(numerant, denumerant);
    return result;
}
public Fraction simplify(Fraction fraction){
    int gcd = calculateGCD(fraction.getNumerant(), fraction.getDenumerant());
    int numerant = fraction.getNumerant() / gcd;
    int denumerant = fraction.getDenumerant() / gcd;
    Fraction result = new Fraction(numerant, denumerant);
    return result;
}
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return calculateGCD(b, a % b);
    }
    public static void main(String[] args){
        Calculator calc = new Calculator();
        Fraction fraction1 = new Fraction(6, 4);
        Fraction fraction2 = new Fraction(8, 9);

        Fraction result = new Fraction(0, 0);
        result = calc.add(fraction1, fraction2);
        System.out.println("Raw result: " + result.getNumerant() + "/" + result.getDenumerant());
        System.out.println("Greatest common Divisor: " + calculateGCD(result.getNumerant(), result.getDenumerant()));
        System.out.println("Simplified: " + calc.simplify(result).getNumerant() + "/" + calc.simplify(result).getDenumerant());
    }
}
