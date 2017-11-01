import java.util.Scanner; //Libreria Scanner
//Clase Simple List
public class SimpleList {
//Puntero que indica el inicio de las listas o conocida tambien como la cabeza de la lista.
	private Nodo head;
	private int size;
	
	public SimpleList(){
		head = null;
		size = 0;
		
	}
	
	public Object search(int index) {
		int contador = 0;
		Nodo temporal = head;
		while (contador < index) {
			temporal = temporal.getNext();
			contador++;
		}
		return System.out.printf("En la posición  " +  contador + " se encuentra el valor + " +temporal.getValor()  + "\n");
	}
	
	public Object searchValue(int valor) {
		int contador = 0;
		Nodo temporal = head;
		  
		while (Integer.parseInt( temporal.getValor().toString()) != valor) {
			temporal = temporal.getNext();
			contador++;
		}
		return System.out.printf("El valor se encuentra en la posición " +contador  + "\n");
	
	}
	
	public void searc(Object value) {
		int contador = 0;
		Nodo temporal = head;
	while(temporal != null ) {
		if(value ==temporal.getValor()) {
			contador++;
			System.out.println("El valor " + temporal.getValor() + " fue encontrado");
			break;	
		}
		temporal = temporal.getNext();
		
		}
	}
	
	public void ValidarNumeros(int n) {
		Scanner in = new Scanner(System.in);
		boolean terminado;
		do {
			try {
			terminado = false;	
			n = in.nextInt();
			}catch(Exception e) {
				System.out.println("Solo números");
				terminado = true;
				in.nextLine();
				
			}	
		}while(terminado =! false);
	}
	
   
	public void deleteValue(int valor) {
			int contador = 0;
			Nodo temporal = head;
			  
			while (Integer.parseInt( temporal.getValor().toString()) < valor) {
				temporal = temporal.getNext();
				contador++;
			}
			temporal.enlazarNext(temporal.getNext().getNext());
		size--;
	}
	
	public void delete(int index) {
		if(index == 0) {
			head = head.getNext();
		}
		else {
			int contador = 0;
			Nodo temporal = head;
			while(contador < index -1) {
				temporal = temporal.getNext();
				contador++;
			}
			temporal.enlazarNext(temporal.getNext().getNext());
		}
		size--;
	}
		


	
	
	
		
	
	//Método para mostrar los valores
	public void mostrar() {
		int contador = 0;
		Nodo temporal = head;
		if(isEmpty()) {
			System.out.println("Introduzca primero valores para la lista");
		}
		else {
		while(temporal !=null) {
			System.out.println("El Valor: " + temporal.getValor() + " Se encuentra en la posición: " + contador);
			temporal = temporal.getNext();
			contador++;
		}
	}
	}
	
	public void addFirst(Object obj) {
		if(head == null) {
			head = new Nodo(obj);
		}else {
			Nodo temp = head;
			Nodo nuevo = new Nodo(obj);
			nuevo.enlazarNext(temp);
			head = nuevo;
		}
		size++;
	}
	
	
	
	public int size() {//Tamaño total de la lista
		return size;
	}
	
	public boolean isEmpty(){
		return (head == null)?true:false;
	}
	
	
}
