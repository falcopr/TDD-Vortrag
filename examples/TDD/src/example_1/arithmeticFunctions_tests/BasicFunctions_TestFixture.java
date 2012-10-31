package example_1.arithmeticFunctions_tests;

import org.junit.*;
import example_1.arithmeticFunctions.BasicFuntions;

public class BasicFunctions_TestFixture {
	
	//Markierung als UnitTest
	@Test
	//ZuTestendeMethode_VorbedingungenZumErwartetenTest_ErwartetesVerhalten
	public void Square_DoubleWithValueFiveDotOne_SquaringDouble(){
		BasicFuntions bf = new BasicFuntions();
		
		//berechnetes Ergebnis
		double result = bf.square(5.1d);
		
		//Fehlerquote
		double epsilon = 0.001d;
		
		//Annahme zum Vergleich von Erwartung und Ergebnis
		Assert.assertEquals(26.01d, result, epsilon);
	}
}
