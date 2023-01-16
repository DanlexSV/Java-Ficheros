package JUnit;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ejemplo_junit {

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

	@ParameterizedTest
	/*Los Parametized Test incorporado en JUnit 5 nos va
	a permitir añadir diferentes valores para realizar pruebas sobre un método*/
	@ValueSource(ints = { 0, 2, 4, 6, 5})
	void given_4_even_numbers_should_return_true(int number) {
		assertTrue(ejemplo_junit.isEven(number));
	}
}
