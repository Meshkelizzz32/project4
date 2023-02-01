package project9;

public class Charactiristics {
private String s;
Charactiristics(String s){
	this.s=s;
	System.out.println("Creating Charactiristics"+s);
}
protected void dispose() {
	System.out.println("Disposing Charactiristics"+s);
}
}
