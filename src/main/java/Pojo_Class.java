
public class Pojo_Class {
	
	private int a;
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	private String b;
	public static void main(String[] args) {
		
	
		Pojo_Class  pc = new Pojo_Class();
		pc.setA(1234);
		pc.getA();
		System.out.println(pc.getA());
		
		pc.setB("gopi");
		
		System.out.println(pc.getB());
		
		
		
	}
	
	
	
	
	
}
