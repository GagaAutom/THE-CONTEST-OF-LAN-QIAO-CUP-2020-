import java.math.BigInteger;

class Rati{
	private BigInteger on = BigInteger.ZERO;
	private BigInteger down = BigInteger.ONE;
	
	private static BigInteger gcd(BigInteger a, BigInteger b) {
		if(b.equals(BigInteger.ZERO))
			return a;
		return gcd(b,a.mod(b));
	}
	
	public Rati(long x) {
		this(BigInteger.valueOf(x),BigInteger.ONE);
	}
	
	public Rati(long x,long y) {
		this(BigInteger.valueOf(x),BigInteger.valueOf(y));
	}
	
	public Rati(BigInteger x) {
		this(x,BigInteger.ONE);
	}
		
	public Rati(BigInteger x,BigInteger y) {
		on = x;
		down = y;
		BigInteger g = gcd(x,y);
		on = on.divide(g);
		down = down.divide(g);
	}


	public Rati add(Rati other) {
		return new Rati(on.multiply(other.down).add(other.on.multiply(down)),down.multiply(other.down));
	}
	
	public Rati subtract(Rati other) {
		return new Rati(on.multiply(other.down).subtract(other.on.multiply(down)),down.multiply(other.down));
	}
	
	public Rati multiply(Rati other) {
		return new Rati(on.multiply(other.on),down.multiply(other.down));
	}
	
	public Rati divide(Rati other) {
		return new Rati(on.multiply(other.down),down.multiply(other.on));
	}
	
	public String toString() {
		String s = on.toString();
		if(down.equals(BigInteger.ONE)==false) {
			s = s + "/" + down.toString();
		}
		return s;
	}
}

public class rationalNumber {
	public static void main(String[] args) {
		System.out.println(new Rati(1,3).add(new Rati(1,3)));
	}
}
