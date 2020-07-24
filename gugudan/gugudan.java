package gugudan;

public class gugudan {
	
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=2; j<9; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+","+"\t");
			}
			for(int j=9; j<10; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			   System.out.println();
		}	   			
	}
}
