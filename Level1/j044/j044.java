public class j044 {
	public static void main(String args[]) {
		double sum=0;
		double rs;
		double a =1.0;
		int x=1;
		while(x<=20) {
			rs = Fac(x);
			a=1/rs;
			sum+=a;
			x++;
		}
		System.out.println(String.format("%.2f", sum));
	  }
	  public static double Fac(int x) { 
		  if (x > 1)
			  return (x * Fac(x - 1)); 
		  else
			  return 1;
	 }
}
