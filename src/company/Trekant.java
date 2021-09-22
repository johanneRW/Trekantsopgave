package company;

public class Trekant {

    private int a;
    private int b;
    private int c;


    public Trekant (int a, int b, int c){
        this.a =a;
        this.b =b;
        this.c =c;
    }

    @Override
    public String toString() {
        return "a=" + a + ", b=" + b + ", c=" + c;
    }

    public String gettype () {
        if ((a + b <= c) || (b + c <= a) || (a + c <= b)) {
            return "Invalid - dette er ikke en trekant";
        }
        if ((a == b) && (b == c)) {
            return "(equilateral) - en ligesidet trekant";
        }
        if ((a == b) || (b == c) || (c == a)) {
            return "(isosceles) - en ligebenet trekant ";
        }
        else{ return "(scalene) - en vilkårlig trekant ";}

    }
}
