public class j043 {
  public static void main(String args[]) {
	  int x = 5;
	  int rs = Fac(x);
	  System.out.println(rs);
  }
  public static int Fac(int x) { 
	  if (x > 1)
		  return (x * Fac(x - 1)); 
	  else
		  return 1;
 }
}
