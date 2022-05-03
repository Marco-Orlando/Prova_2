
public class MainClass {

	public static void main(String[] args) {
		Auto a1=new Auto("Ford Focus","pp133pp");
		Auto a2=new Auto("Ferrari 308","xx333px");
		Auto a3=new Auto("Audi 80","bb244kl");
		System.out.println(a1);
		System.out.println(a2);
		Persona p1=new Persona("Mario","Nuzzo","Via Giuseppe II",10);
		System.out.println("\n"+p1+"\n");
		if(p1.aggiungiAuto(a1)) System.out.println("Auto aggiunta correttamente\n"); else System.out.println("Errore!\n");
		if(p1.aggiungiAuto(a2)) System.out.println("Auto aggiunta correttamente\n"); else System.out.println("Errore!\n");
		System.out.println(p1+"\n");
		if(p1.aggiungiAuto(a3)) System.out.println("Auto aggiunta correttamente\n"); else System.out.println("Errore!\n");
		System.out.println(p1+"\n");
		
		p1.cancellaAuto("pp111pp");
		System.out.println(p1+"\n");
		System.out.println(p1.cercaAuto("xx333xx")+"\n");
		
		Auto vet[]=p1.cercaVetAuto("3p");
		for(int i=0;i<vet.length;i++) {
			System.out.println(vet[i]);
		}
	}

}
