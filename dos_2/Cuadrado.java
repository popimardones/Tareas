package tareas.dos_2;

public class Cuadrado extends FiguraGeometrica implements Dibuja{
	private int ancho;
	
	Cuadrado(int ancho){
		this.ancho = ancho;
	}

	@Override
	public void dibuja() {
		
		int r,c;
		
		//[# of rows][# of columns]
		BloqueSuper[][] TwoDimArrayCuadrado = new BloqueSuper[ancho][ancho];
				
		//Row iterator for loop 
	    for(r = 0; r < ancho; r++){
	     //Column iterator for loop 
	        for(c = 0; c < ancho; c++){
	            //Check if currely position is a boundary position
	            if(r==0 || r==ancho-1 || c==0 || c==ancho-1) {
	            	TwoDimArrayCuadrado[r][c] = new BloqueNegro();
	            		//printf("*");
	            }
	            else {
	                //printf(" ");
	            	TwoDimArrayCuadrado[r][c] = new BloqueBlanco();

	            }
	        }
	        //printf("\n");
	    }
	    
	    //imprimir en pantalla.
				
		for(int i = 0; i < ancho; i++) {
			for(int j = 0; j < ancho ; j++) {
				
				//System.out.println("The value of [(%i)][(%i)] is : " + TwoDimArray[r][c], r,c);
				System.out.print(TwoDimArrayCuadrado[i][j] + " ");
			
			}
			System.out.println();
		}
		
		System.out.println();
	
	}		
	

	@Override
	public void setAlto(int h) {
		 ancho = h;
	}

	@Override
	public void setAncho(int w) {
		ancho = w;
	}

	@Override
	public int getAlto() {
		return ancho;
	}

	@Override
	public int getAncho() {
		return ancho;
	}

}
