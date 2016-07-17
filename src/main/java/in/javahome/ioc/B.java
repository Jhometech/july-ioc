package in.javahome.ioc;

import java.util.List;

public class B {
	private List list;

	public void setList(List list) {
		this.list = list;
	}
  public void display(){
	  for (Object l : list) {
		System.out.println(l.getClass());
	}
  }
}
