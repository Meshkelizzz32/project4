package project9;

public class Frog extends Amphibian{
	private Charactiristics p=new Charactiristics("Croaks");
	private Description t=new Description("eat bugs");
	Frog(){
		System.out.println("Frog()");
	}
	public static void croak() {
		System.out.println("frog croaking");
	}
	protected void dispose() {
		System.out.println("Disposing Frog");
		p.dispose();
		t.dispose();
		super.dispose();
	}
	public static void main(String[] args) {
		Frog frog=new Frog();
		try {
			frog.croak();
		return;
		}finally {
			System.out.println("Frog finish its deals");
			frog.dispose();
		}
		
	}
}
