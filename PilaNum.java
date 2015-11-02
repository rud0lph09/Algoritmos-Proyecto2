class PilaNum{
	//ATRIBUTOS
	private String []pila;
	private int tope;

	//CONTRUCTORES

	public PilaNum(int max){ 
	// en el constructor dimensionamos el arreglo pila
		pila = new String[max];
		tope = -1;
	}

	//METODOS
	public boolean validaEspacio(){
		if (tope + 1 < pila.length)
			return true;
		
		else
			return false;
	}

	public void push(String dato){
		tope++;
		pila[tope] = dato;
	}

	public boolean validaVacio(){
		if (tope == -1)
			return true;
		else
			return false;
	}

	public String pop(){
		tope--;
		return pila[tope+1];
	}

	public void listar(){
		int i;
		for(i=tope; i>=0; i--)
			System.out.println(pila[i]);
	}
	
	public String valorTope(){
		return (pila[tope]);
	}

}