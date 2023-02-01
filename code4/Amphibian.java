package project9;

public class Amphibian extends Animal{
	private Charactiristics p=new Charactiristics("can live in water");
	private Description t=new Description("Both water and land");
	Amphibian(){
		System.out.println("Amphibian()");
	}
	protected void dispose() {
		System.out.println("Disposing Amphibian");
		p.dispose();
		t.dispose();
		super.dispose();
	}

}
