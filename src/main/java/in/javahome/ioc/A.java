package in.javahome.ioc;

public class A {
	
	private int i;
	private double j;
	private String k;

	public void setI(int i) {
		this.i = i;
	}

	public void setJ(double j) {
		this.j = j;
	}

	public void setK(String k) {
		this.k = k;
	}

	void display() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);;
	}
}
