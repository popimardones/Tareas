package tareas.dos;

public class Triangulo extends FiguraGeometrica implements Dibuja{

	private int ancho;
	
	Triangulo(int ancho){
        this.ancho = ancho;		
	}

	@Override
	public void dibuja() {
		
		//[# of rows][# of columns]
		BloqueSuper[][] TwoDimArrayTriangulo = new BloqueSuper[ancho][ancho];
		
		for(int i = 1; i <= ancho; i++){  
		    /* for r th row, first print rows-r spaces then stars */
		        for(int j = 1; j <= ancho; j++){
		            if(j <= ancho-i){
		                //printf(" "); 
		            	TwoDimArrayTriangulo[i-1][j-1] = new BloqueBlanco();
		            } else {
		                //printf("*"); 
		            	TwoDimArrayTriangulo[i-1][j-1] = new BloqueNegro();
		            }
		        }
		        /* move to next row */
		        //printf("\n");  
		
		}
		
		//imprimir en pantalla.
		
  		for(int r = 0; r < ancho; r++) {
  			for(int c = 0; c < ancho ; c++) {
  				
  				//System.out.println("The value of [(%i)][(%i)] is : " + TwoDimArray[r][c], r,c);
  				System.out.print(TwoDimArrayTriangulo[r][c] + " ");
  			
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
