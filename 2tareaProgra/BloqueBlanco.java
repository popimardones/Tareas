package tareas.dos;

public class BloqueBlanco extends BloqueSuper  {

	protected Character bloqueBlanco = ' ';

	  public BloqueBlanco() {
	  }

	  public BloqueBlanco(Character bloqueBlanco) {
	    this.bloqueBlanco = bloqueBlanco;
	  }
	  
	  public void imprimeBloqueBlanco() {
	    System.out.print("" + this.bloqueBlanco);
	  }
	
}
