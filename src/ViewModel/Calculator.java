package ViewModel;

import Model.Fraction;

public class Calculator {
    public Fraction add(Fraction Fraction1, Fraction Fraction2){
        Fraction tempFraction1 = Fraction1;
        Fraction tempFraction2 = Fraction2;
        Fraction fraction1 = Fraction1;
        Fraction fraction2 = Fraction2;

        fraction1.expand(tempFraction2.getDenumerant());
        fraction2.expand(tempFraction1.getDenumerant());

        Fraction sum = new Fraction(fraction1.getNumerant() + fraction2.getNumerant(), fraction1.getDenumerant());

        return sum;
    }
    public Fraction subtract(Fraction Fraction1, Fraction Fraction2){
        Fraction tempFraction1 = Fraction1;
        Fraction tempFraction2 = Fraction2;
        Fraction fraction1 = Fraction1;
        Fraction fraction2 = Fraction2;

        fraction1.expand(tempFraction2.getDenumerant());
        fraction2.expand(tempFraction1.getDenumerant());

        Fraction difference = new Fraction(fraction1.getNumerant() - fraction2.getNumerant(), fraction1.getDenumerant());

        return difference;
    }
    public Fraction multiply(Fraction Fraction1, Fraction Fraction2){
        Fraction factor()
    }
}
