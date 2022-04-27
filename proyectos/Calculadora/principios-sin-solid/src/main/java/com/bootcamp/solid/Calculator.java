package com.bootcamp.solid;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	private List<ICalculator> calculator;

	public Calculator() {
		this.calculator = new ArrayList<ICalculator>();
		calculator.add(new Addition());
		calculator.add(new Dividir());
		calculator.add(new Multiplication());
		calculator.add(new Substraction());
	}

	public ICalculator OperadorResultado(String operador) {

		ICalculator prueba = null;

		for (int i = 0; i <= calculator.size() - 1; i++) {
			String op = calculator.get(i).operador.toString();
			if (op == operador) {
				prueba = calculator.get(i);
				i = calculator.size() - 1;
			}
		}

		return prueba;
	}

	public Double Resultado(String operador, int a, int b) {
		Calculator resultado = new Calculator();
		ICalculator operacion = resultado.OperadorResultado(operador);
		return operacion.HacerOperacion(a, b);

	}

}
