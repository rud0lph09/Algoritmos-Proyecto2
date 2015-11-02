class Calculadora{
	//Metodos
	Cerebro calc;
	String operacion;

	//Codigo
	public static void main(String[] args) {

		operacion = Lee.Cadena("Dame la operacion a efectuar...");
		calc = new Cerebro(operacion);

		//Listar las pilas
		System.out.println(calc.numero.listar);
		System.out.println(calc.operador.listar);
	}
}