package homework11Task4;

public class RandomNumber {

    private long a;
    private long c;
    private long m;

    public RandomNumber(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public long nextElement (long seed) {
        return (1*(a*seed+c)%m);

    }

}




