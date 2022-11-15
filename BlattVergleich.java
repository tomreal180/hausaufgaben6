package hausaufgaben6;

public class BlattVergleich implements Comparator<Blatt> {
	public int[] process(Blatt a) {		
		int[] res=a.getValue();
		int paaranzahl=0;
		int sum=0;
		for (int i=0;i<=2;i++) {
			for (int x=i+1;x<=2;x++) {
				sum+=res[i];
				if (res[i]==res[x]) {
					paaranzahl+=1;
				}
			}
		}
		return new int[]{paaranzahl,sum};
	}
	public int compare(Blatt a, Blatt b) {
		int[] checka=process(a);
		int[] checkb=process(b);
		if (checka[0]>checkb[0]) {
			return 1;
		}else if(checka[0]<checkb[0]) {
			return -1;
		}else {
			return checka[1]-checkb[1];
		}
	}
	
}
