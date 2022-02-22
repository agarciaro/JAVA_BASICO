
public class StaticTest {
	
	private static int numero1;
	private int numero2;
	
	public void incrementarn1() {
		
		numero1++;
		
	}
	
	public void incrementarn2() {
		
		numero2++;
	}
 
	

	public static void main(String[] args) {
		
		StaticTest st = new StaticTest();
		st.incrementarn1();
		st.incrementarn2();
		System.out.println(numero1);
		System.out.println(st.numero2);


	}

}
