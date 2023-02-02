
public class CamelCase {
	
	private Object element;
	private int qtd;

	public boolean isEmpty() {
		return (element == null);
	}

	public int size() {
		return qtd;
	}
	
	void insert(Object element) {
		this.element = element;
		qtd++;
	}

	public Object header() {
		return element;
	}

	public String split(String string) {
		return string;		
	}

}
