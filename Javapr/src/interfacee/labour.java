package interfacee;

public class labour implements manager,manager1 {

	@Override
	public void name() {
		System.out.println("siran");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void id() {
		System.out.println(112);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void name1() {
		System.out.println("ganesh");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		labour w=new labour();
		w.name();
		w.id();
		w.name1();
		
	}

}
