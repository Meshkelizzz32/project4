package project9;

public class Animal extends LivingCreature{
	private Charactiristics p=new Charactiristics("has heart");
	private Description t=new Description("It is Animal");
	Animal(){
		System.out.println("Animal()");
	}
	protected void dispose() {
		System.out.println("Disposing Animal");
		p.dispose();
		t.dispose();
		super.dispose();
	}
}
