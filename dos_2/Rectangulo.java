package tareas.dos_2;

public class Rectangulo extends FiguraGeometrica implements Dibuja {
	
	private int ancho;
	private int alto;

	Rectangulo(int ancho, int alto){
	     this.ancho = ancho;
		 this.alto = alto;
	}

	@Override
	public void dibuja() {
//		int numeroDeFilas = alto;
//		int numeroDeColumnas = ancho;
		
		//[# of rows][# of columns]
		BloqueSuper[][] TwoDimArrayRectangulo = new BloqueSuper[alto][ancho];
		
		//Row iterator for loop 
	    for(int i = 0; i < alto; i++){
	     //Column iterator for loop
	        for(int j = 0; j < ancho; j++){
	            //Check if currely position is a boundary position
	            if(i==0 || i==alto-1 || j==0 || j==ancho-1) {
	            	TwoDimArrayRectangulo[i][j] = new BloqueNegro();
	            }
	            else {
	                //printf(" ");
	            	TwoDimArrayRectangulo[i][j] = new BloqueBlanco();
	            }
	        }
	        //printf("\n");
	    }
	    
	  //imprimir en pantalla.
		
	  		for(int r = 0; r < alto; r++) {
	  			for(int c = 0; c < ancho ; c++) {
	  				
	  				//System.out.println("The value of [(%i)][(%i)] is : " + TwoDimArray[r][c], r,c);
	  				System.out.print(TwoDimArrayRectangulo[r][c] + " ");
	  			
	  			}
	  			System.out.println();
	  		}
		System.out.println();

	}

	@Override
	public void setAlto(int h) {
		 alto = h;
		
	}

	@Override
	public void setAncho(int w) {
		 ancho = w;
		
	}

	@Override
	public int getAlto() {
		return alto;
	}

	@Override
	public int getAncho() {
		return ancho;
	}

}
