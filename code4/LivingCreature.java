package project9;

public class LivingCreature {
private Charactiristics p=new Charactiristics("is alive");
private Description t=new Description("Basic living creature");
LivingCreature(){
	System.out.println("LivingCreature()");
}
protected void dispose() {
	System.out.println("Disposing LivingCreature");
	p.dispose();
	t.dispose();
}
}
