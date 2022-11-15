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
	 
	 public String toString() {
		 return String.join(", ",String.valueOf(res[0]),String.valueOf(res[1]),String.valueOf(res[2]));
	 }
}
