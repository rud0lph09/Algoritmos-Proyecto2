class Cerebro {
  //Atributos
  int max = 50;
  PilaNum numero = new PilaNum(max);
  PilaNum NumAux = new PilaNum(max);
  PilaOper operador = new PilaOper(max);
  String res, data;

  //Contructor
  Cerebro(String dato){
    data = dato;
  }

  //Metodos
  void configur(){
    String aux = "";
    for (int i = 0; i< data.length(); i++) {  //ciclos de comparacion para ver si es un   
      if (esUnOp(data.charAt(i)) == false) {  //numero o caracter y asi seapararlo en 2 pilas
        aux = (aux + data.charAt(i));
      } else{
        if (aux != ""){
          numero.push(Integer.parseInt(aux));
          aux = "";
        }
      }
    }
    if (aux != ""){ //Condicional por si queda algun valor en la variable aux este lo vacia y lo inserta en la pila 
      numero.push(Integer.parseInt(aux));
    }
  }

  boolean esUnOp(char sOp){ // me mandaba error porque segun el compilador los signos son String no Char 
    if (sOp == "+" || sOp == "-" || sOp == "*" || sOp == "/" || sOp == "(" || sOp == ")") {   //Metodo para comparar los operandos
        operador.push(sOp);
      return true;
    } else {
      return false;
    }
  }
}
