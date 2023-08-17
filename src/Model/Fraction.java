package Model;

public class Fraction {
    private int _numerant, _denumerant;
    public Fraction(int numerant, int denumerant){
        this._numerant = numerant;
        this._denumerant = denumerant;
    }
    public int getNumerant(){
        return this._numerant;
    }
    public int getDenumerant(){
        return this._denumerant;
    }
    public float toDecimal(){
        return (float) _numerant / _denumerant;
    }
    public String toString(){
        return this._numerant + "/" + this._denumerant;
    }
    public void expand(int factor){
        this._numerant = this._numerant * factor;
        this._denumerant = this._denumerant * factor;
    }
    public void basicForm(){

    }
}
