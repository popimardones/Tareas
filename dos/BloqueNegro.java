package tareas.dos;

public class BloqueNegro extends BloqueSuper {
	 
	protected Character bloqueNegro = '#';
	  
	  public BloqueNegro() {
	  }

	  public BloqueNegro(Character bloqueNegro) {
	    this.bloqueNegro = bloqueNegro;
	  }
	  
	  public void imprimeBloqueNegro() {
	    System.out.print("" + this.bloqueNegro);
	  }
}
