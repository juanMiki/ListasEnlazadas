
public class Nodo {

	Object valor;
	Nodo next;
	
	public Nodo(Object valor) {
		this.valor = valor;
		this.next= null;
	}
	
	
	public Object getValor() {
		return valor;
	}
	
	
	public void enlazarNext(Nodo n) {
		next = n;
	}
	
	public Nodo getNext() {
		return next;
	}
}
