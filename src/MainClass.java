import java.util.Scanner;

/**
 * 
 */

/**
 * @author Eduardo
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleList lista = new SimpleList();
		Nodo nodo = new Nodo(lista);
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean detener=true;
        while(detener !=false ) {
        	
        //Impresion de nuestro mun� 
            System.out.println("\n<<Men�>>");
            System.out.println("1: Insertar.");
            System.out.println("2: Mostrar.");
            System.out.println("3: Buscar.");
            System.out.println("4: Eliminar.");
            System.out.println("5: Contar.");
            System.out.println("6: Terminar.");
            System.out.println("");
            System.out.println("�Cu�l es tu opci�n?: ");
            opcion = sc.nextInt();
            
            Scanner cs = new Scanner(System.in);
           
            switch (opcion) {
            //en este caso mandara a que el usuario inserte la cantidad de elementos para la lista 
                case 1: 
                	System.out.println("Insertar");
                System.out.println("Ingrese la cantidad de elementos para la lista:");
                //int c = 0;
              //lista.ValidarNumeros(c);
              int  c = cs.nextInt();
                for(int i = 0; i<c; i++) {
                	System.out.println("Ingrese el valor para el elemento " + "["+i+"]");
                	int obj = cs.nextInt();
                    lista.addFirst(obj);
                }
               
                 break;
                //Si el usuario Selecciona la opci�n 2 mandara a mostrar los datos ingresados en la lista 
                case 2: 
                	System.out.println("Mostrar");
                	lista.mostrar();
                    break;
                
                case 3: 
                	//Si selleciona la opci�n 3 el n�mero que el usuario ingrese lo buscara 
                    /*System.out.println("Buscar");
                    System.out.println("Por �ndice");
                    System.out.println("Ingrese una posici�n");
                    int b = sc.nextInt();
                    lista.search(b);
                    System.out.println("");*/
                    System.out.println("Por valor");
                    //System.out.println("Introduce un valor");
                     int v = cs.nextInt(); 
                    //lista.ValidarNumeros(v);
                    lista.searchValue(v);
                    break;
                
                    
                    //En esta opci�n podra eliminar un valor que desea
                case 4: 
                	System.out.println("Eliminar");
                	//System.out.println("Por �ndice");
                	//System.out.println("Ingrese una posici�n");
                	System.out.println("Ingrese un valor");
                	int e = sc.nextInt();
                	lista.deleteValue(e);
                	//System.out.println("Por valor");
                	//
                	
                    break;
                
                    //En esta opci�n contara el tama�o de la lista que ingreso el usuario
                case 5: 
                    System.out.println("Contar");
                    System.out.println("El tama�o de la lista es " + lista.size());
                    break;
                
                    
                    //Si selecciona esta obcion terminara la ejecucion de la aplicaci�n
                case 6: 
                	detener = false;
                	System.out.println("Vuelva pronto");
                    break;
                
                default: 
                    System.out.println("Opci�n incorrecta");
                    break;
                    
            }
            }        
        }
	}


