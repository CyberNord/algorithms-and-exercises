package integers.int_pow_xIn;

class Pow {
    public double myPow(double x, int n) {
        long nLong = n;
        double result = 1.0;
        boolean isNegative = false;
        if (nLong < 0) {
            nLong = Math.abs(nLong);
            isNegative = true;
        }

        while (nLong != 0) {
            if (nLong % 2 == 1) {
                result *= x;
                nLong--;
            }
            x *= x;
            nLong /= 2;
        }

        if (isNegative) {
            return 1 / result;
        } else {
            return result;
        }
    }
	
	public static void main(String[] args) {
        Pow p = new Pow();
        System.out.println(p.myPow(2.0, 10));
        System.out.println(p.myPow(2.0, 3));
        System.out.println(p.myPow(2.0, -2));
    }
}
