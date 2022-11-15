package hausaufgaben6;

public class Blatt {
	 private int[] res;
	 public Blatt(int[] a) {
		 if (a.length != 3) {
			throw new ArithmeticException("Es muss 3 karten geben");
		 }else {
			 this.res=a;
		 }
	 }
}
