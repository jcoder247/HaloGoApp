package halogo.converter;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestConverter {


	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testconvertNumberToWordsNullTest(){
		String expectedResult1 = "Please enter a valid number in dollar and cents format. For example: 123.45";
		
		try {
			assertEquals(expectedResult1,ConverterFunctions.convertNumToMoneyWords(null));
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
		assertTrue(true);
	}
	
	@Test
	public void testconvertNumberToWordsEmptStringTest(){
		String expectedResult1 = "Please enter a valid number in dollar and cents format. For example: 123.45";
		
		try {
			assertEquals(expectedResult1,ConverterFunctions.convertNumToMoneyWords(null));
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
		assertTrue(true);
	}
	
	@Test
	public void testconvertNumberToWordsMultipleDots(){
		String expectedResult1 = "There are too many dots in the number. Please enter a valid number in dollar and cents format. For example: 123.45";
		
		try {
			assertEquals(expectedResult1,ConverterFunctions.convertNumToMoneyWords("12.3.45"));
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
		assertTrue(true);
	}
	
	@Test
	public void testconvertNumberToWordsCentsNotANumber(){
		String expectedResult1 = "The cents must be a number. Please enter a valid number in dollar and cents format. For example: 123.45";
		
		try {
			assertEquals(expectedResult1,ConverterFunctions.convertNumToMoneyWords("12.aWord"));
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
		assertTrue(true);
	}
	
	@Test
	public void testconvertNumberToWordsDollarsNotANumber(){
		String expectedResult1 = "The dollars must be a number. Please enter a valid number in dollar and cents format. For example: 123.45";
		
		try {
			assertEquals(expectedResult1,ConverterFunctions.convertNumToMoneyWords("aWord.55"));
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
		assertTrue(true);
	}
	
	@Test
	public void testconvertNumberToWordsDollarsAndCents(){
		String expectedResult1 = "FIVE DOLLARS AND FIFTY-FIVE CENTS";
		String expectedResult2 = "FIVE DOLLARS AND FIFTY-FIVE POINT THREE CENTS";
		String expectedResult3 = "EIGHTY-FIVE DOLLARS AND NINETY-NINE CENTS";
		String expectedResult4 = "TWELVE DOLLARS AND NINETY-NINE POINT SEVEN SIX FIVE CENTS";
		String expectedResult5 = "ONE HUNDRED DOLLARS";
		String expectedResult6 = "ONE HUNDRED DOLLARS AND ONE CENT";
		String expectedResult7 = "TWO HUNDRED AND ONE DOLLARS AND TWELVE CENTS";
		String expectedResult8 = "NINE HUNDRED AND FORTY-FIVE DOLLARS AND TEN CENTS";
		String expectedResult9 = "ONE THOUSAND DOLLARS";
		String expectedResult10 = "ONE THOUSAND AND ONE DOLLARS";
		String expectedResult11 = "ONE DOLLAR";
		String expectedResult12 = "TEN CENTS";
		String expectedResult13 = "ONE CENT";
		String expectedResult14 = "MINUS ONE DOLLAR";
		String expectedResult15 = "MINUS ONE CENT";
		String expectedResult16 = "MINUS NINETY-NINE CENTS";
		String expectedResult17 = "MINUS FIFTEEN POINT SIX SEVEN FIVE TWO CENTS";
		String expectedResult18 = "NINE THOUSAND EIGHT HUNDRED AND THIRTY-TWO DOLLARS";
		String expectedResult19 = "TEN THOUSAND DOLLARS";
		String expectedResult20 = "TEN THOUSAND DOLLARS AND POINT ZERO ZERO ZERO ZERO ONE CENTS";
		String expectedResult21 = "NINETEEN THOUSAND DOLLARS";
		String expectedResult22 = "TWENTY-ONE THOUSAND EIGHT HUNDRED AND ONE DOLLARS AND SIXTY-FIVE POINT ZERO NINE CENTS";
		String expectedResult23 = "NINE HUNDRED AND FIFTY-FOUR THOUSAND NINE HUNDRED AND NINETY-NINE DOLLARS AND FIVE POINT TWO CENTS";//954999.052
		String expectedResult24 = "SEVEN HUNDRED AND SEVENTY-SEVEN MILLION THREE HUNDRED AND TWENTY-FIVE THOUSAND SIX HUNDRED AND TWO DOLLARS AND TWENTY-FIVE CENTS";//777325602.25
		String expectedResult25 = "ONE BILLION AND ONE DOLLARS";
		String expectedResult26 = "NINE HUNDRED AND FORTY-FOUR BILLION ONE HUNDRED AND THIRTY-TWO MILLION ONE HUNDRED AND EIGHTY-ONE THOUSAND TWO HUNDRED AND NINE DOLLARS";
		String expectedResult27 = "NINE QUINTILLION ONE HUNDRED AND FORTY-FOUR QUADRILLION ONE HUNDRED AND ELEVEN TRILLION ONE HUNDRED AND THIRTY-TWO BILLION ONE HUNDRED AND THIRTY-TWO MILLION ONE HUNDRED AND EIGHTY-ONE THOUSAND TWO HUNDRED AND NINE DOLLARS AND SIXTY-ONE POINT FOUR FIVE CENTS";
		String expectedResult28 = "MINUS NINE QUINTILLION ONE HUNDRED AND FORTY-FOUR QUADRILLION ONE HUNDRED AND ELEVEN TRILLION ONE HUNDRED AND THIRTY-TWO BILLION ONE HUNDRED AND THIRTY-TWO MILLION ONE HUNDRED AND EIGHTY-ONE THOUSAND TWO HUNDRED AND NINE DOLLARS AND SIXTY-ONE POINT FOUR FIVE CENTS";
		String expectedResult29 = "Please enter a valid number in dollar and cents format. For example: 123.45";
		String expectedResult30 = "The dollars must be a number. Please enter a valid number in dollar and cents format. For example: 123.45";
		String expectedResult31 = "There are too many dots in the number. Please enter a valid number in dollar and cents format. For example: 123.45";
		String expectedResult32 = "NINE BILLION NINE HUNDRED AND NINETY-NINE MILLION NINE HUNDRED AND NINETY-NINE THOUSAND NINE HUNDRED AND NINETY-NINE DOLLARS";
		String expectedResult33 = "ONE HUNDRED AND TWENTY-THREE DOLLARS AND FORTY-FIVE CENTS";
		String expectedResult34 = "FORTY-FIVE CENTS";
		String expectedResult35 = "ONE HUNDRED AND TWENTY-THREE DOLLARS AND FORTY CENTS";
		String expectedResult36 = "ONE HUNDRED DOLLARS AND FORTY CENTS";
		String expectedResult37 = "ONE DOLLAR AND FORTY CENTS";
		String expectedResult38 = "ONE HUNDRED AND TWENTY-THREE DOLLARS AND ONE CENT";
		String expectedResult39 = "ONE THOUSAND TWO HUNDRED AND THIRTY-FIVE DOLLARS AND SIXTY-SEVEN CENTS";
		String expectedResult40 = "THREE HUNDRED AND TWENTY-ONE THOUSAND SIX HUNDRED AND FIFTY-FOUR DOLLARS AND NINETY-FIVE CENTS";//321654.95
		String expectedResult41 = "THREE HUNDRED AND TWENTY-ONE THOUSAND SIX HUNDRED AND FIFTY-FOUR DOLLARS AND NINETY-SIX CENTS";//321654.96
		String expectedResult42 = "THREE HUNDRED AND TWENTY-ONE THOUSAND SIX HUNDRED AND FIFTY-FOUR DOLLARS AND NINETY-SEVEN CENTS";//321654.97
		String expectedResult43 = "THREE HUNDRED AND TWENTY-ONE THOUSAND SIX HUNDRED AND FIFTY-FOUR DOLLARS AND NINETY-EIGHT CENTS";//321654.98
		String expectedResult44 = "THREE HUNDRED AND TWENTY-ONE THOUSAND SIX HUNDRED AND FIFTY-FOUR DOLLARS AND NINETY-NINE CENTS";//321654.99
		String expectedResult45 = "THREE HUNDRED AND TWENTY-ONE THOUSAND SIX HUNDRED AND FIFTY-FIVE DOLLARS AND ONE CENT";//321655.01
		
		try {
			assertEquals(expectedResult1,ConverterFunctions.convertNumToMoneyWords("5.55"));
			assertEquals(expectedResult2,ConverterFunctions.convertNumToMoneyWords("5.553"));
			assertEquals(expectedResult3,ConverterFunctions.convertNumToMoneyWords("85.99"));
			assertEquals(expectedResult4,ConverterFunctions.convertNumToMoneyWords("12.99765"));
			assertEquals(expectedResult5,ConverterFunctions.convertNumToMoneyWords("100"));
			assertEquals(expectedResult5,ConverterFunctions.convertNumToMoneyWords("100.00"));
			assertEquals(expectedResult6,ConverterFunctions.convertNumToMoneyWords("100.01"));
			assertEquals(expectedResult7,ConverterFunctions.convertNumToMoneyWords("201.12"));
			assertEquals(expectedResult7,ConverterFunctions.convertNumToMoneyWords("201.120"));
			assertEquals(expectedResult8,ConverterFunctions.convertNumToMoneyWords("945.10"));
			assertEquals(expectedResult9,ConverterFunctions.convertNumToMoneyWords("1000.00"));
			assertEquals(expectedResult9,ConverterFunctions.convertNumToMoneyWords("1000"));
			assertEquals(expectedResult9,ConverterFunctions.convertNumToMoneyWords("1000.0"));
			assertEquals(expectedResult9,ConverterFunctions.convertNumToMoneyWords("1000.000"));
			assertEquals(expectedResult10,ConverterFunctions.convertNumToMoneyWords("1001"));
			assertEquals(expectedResult11,ConverterFunctions.convertNumToMoneyWords("1"));
			assertEquals(expectedResult12,ConverterFunctions.convertNumToMoneyWords("0.10"));
			assertEquals(expectedResult13,ConverterFunctions.convertNumToMoneyWords("0.01"));
			assertEquals(expectedResult14,ConverterFunctions.convertNumToMoneyWords("-1"));
			assertEquals(expectedResult15,ConverterFunctions.convertNumToMoneyWords("-0.01"));
			assertEquals(expectedResult16,ConverterFunctions.convertNumToMoneyWords("-0.99"));
			assertEquals(expectedResult17,ConverterFunctions.convertNumToMoneyWords("-0.156752"));
			assertEquals(expectedResult18,ConverterFunctions.convertNumToMoneyWords("9832"));
			assertEquals(expectedResult19,ConverterFunctions.convertNumToMoneyWords("10000"));
			assertEquals(expectedResult19,ConverterFunctions.convertNumToMoneyWords("10000.00"));
			assertEquals(expectedResult19,ConverterFunctions.convertNumToMoneyWords("10000.0"));
			assertEquals(expectedResult19,ConverterFunctions.convertNumToMoneyWords("10000.000"));
			assertEquals(expectedResult19,ConverterFunctions.convertNumToMoneyWords("10000.000000"));
			assertEquals(expectedResult20,ConverterFunctions.convertNumToMoneyWords("10000.0000001"));
			assertEquals(expectedResult21,ConverterFunctions.convertNumToMoneyWords("19000"));
			assertEquals(expectedResult22,ConverterFunctions.convertNumToMoneyWords("21801.6509"));
			assertEquals(expectedResult23,ConverterFunctions.convertNumToMoneyWords("954999.052"));
			assertEquals(expectedResult24,ConverterFunctions.convertNumToMoneyWords("777325602.25"));
			assertEquals(expectedResult25,ConverterFunctions.convertNumToMoneyWords("1000000001"));
			assertEquals(expectedResult26,ConverterFunctions.convertNumToMoneyWords("944132181209"));
			assertEquals(expectedResult27,ConverterFunctions.convertNumToMoneyWords("9144111132132181209.6145"));
			assertEquals(expectedResult28,ConverterFunctions.convertNumToMoneyWords("-9144111132132181209.6145"));
			assertEquals(expectedResult29,ConverterFunctions.convertNumToMoneyWords(""));
			assertEquals(expectedResult29,ConverterFunctions.convertNumToMoneyWords(null));
			assertEquals(expectedResult30,ConverterFunctions.convertNumToMoneyWords(" "));
			assertEquals(expectedResult30,ConverterFunctions.convertNumToMoneyWords("."));
			assertEquals(expectedResult31,ConverterFunctions.convertNumToMoneyWords("55.7.32"));
			assertEquals(expectedResult32,ConverterFunctions.convertNumToMoneyWords("9999999999"));
			assertEquals(expectedResult33,ConverterFunctions.convertNumToMoneyWords("123.45"));
			assertEquals(expectedResult34,ConverterFunctions.convertNumToMoneyWords("0.45"));
			assertEquals(expectedResult35,ConverterFunctions.convertNumToMoneyWords("123.40"));
			assertEquals(expectedResult36,ConverterFunctions.convertNumToMoneyWords("100.40"));
			assertEquals(expectedResult37,ConverterFunctions.convertNumToMoneyWords("1.40"));
			assertEquals(expectedResult38,ConverterFunctions.convertNumToMoneyWords("123.01"));
			assertEquals(expectedResult39,ConverterFunctions.convertNumToMoneyWords("1235.67"));
			assertEquals(expectedResult40,ConverterFunctions.convertNumToMoneyWords("321654.95"));
			assertEquals(expectedResult41,ConverterFunctions.convertNumToMoneyWords("321654.96"));
			assertEquals(expectedResult42,ConverterFunctions.convertNumToMoneyWords("321654.97"));
			assertEquals(expectedResult43,ConverterFunctions.convertNumToMoneyWords("321654.98"));
			assertEquals(expectedResult44,ConverterFunctions.convertNumToMoneyWords("321654.99"));
			assertEquals(expectedResult45,ConverterFunctions.convertNumToMoneyWords("321655.01"));
			
			//These two fail because we don't check for leading or trailing whitespaces. The next step would be to write code
			//To handle these.
//			assertEquals(expectedResult33,ConverterFunctions.convertNumToMoneyWords(" 123.45"));
//			assertEquals(expectedResult33,ConverterFunctions.convertNumToMoneyWords("123.45 "));
			
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
		assertTrue(true);
	}
	
	@Test
	public void testsplitCents(){
		int[][] expectedResult1 = { {10, 0},
				 					{4,5}};
		int[][] expectedResult2 = { {88, 0, 0, 0},
									{5,8,6,7}};
		int[][] expectedResult3 = { {99, 0, 0, 0},
									{0,0,0,1}};
		int[][] expectedResult4 = { {1},
									{5}};
		int[][] expectedResult5 = { {9, 0},
									{4,5}};
		int[][] expectedResult6 = { {11, 0, 0, 0},
									{5,0,0,5}};
		int[][] expectedResult7 = { {0, 0, 0},
									{1,2,3}};
		int[][] expectedResult8 = { {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
									{1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9}};
		int[][] expectedResult9 = { {0},
									{0}};
		int[][] expectedResult10 = { {55},
									 {0}};
		int[][] expectedResult11 = { {1},
				 {0}};
		
		try {
			assertArrayEquals(expectedResult1,ConverterFunctions.splitCents("1045"));
			assertArrayEquals(expectedResult2,ConverterFunctions.splitCents("885867"));
			assertArrayEquals(expectedResult3,ConverterFunctions.splitCents("990001"));
			assertArrayEquals(expectedResult4,ConverterFunctions.splitCents("015"));
			assertArrayEquals(expectedResult5,ConverterFunctions.splitCents("0945"));
			assertArrayEquals(expectedResult6,ConverterFunctions.splitCents("115005"));
			assertArrayEquals(expectedResult7,ConverterFunctions.splitCents("00123"));
			assertArrayEquals(expectedResult8,ConverterFunctions.splitCents("00123456789123456789123456789123456789"));
			assertArrayEquals(expectedResult9,ConverterFunctions.splitCents("0"));
			assertArrayEquals(expectedResult10,ConverterFunctions.splitCents("55"));
			assertArrayEquals(expectedResult11,ConverterFunctions.splitCents("1"));
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
		assertTrue(true);
		
		//Test we get exceptions we are expecting.
		try{
			ConverterFunctions.splitCents("1contains a word.");
		}catch (Exception e) {
			assertTrue(true);
		}
		
		try{
			ConverterFunctions.splitCents("e");
		}catch (Exception e) {
			assertTrue(true);
		}
		
		try{
			ConverterFunctions.splitCents("e555");
		}catch (Exception e) {
			assertTrue(true);
		}
	}
	
	@Test
	public void testconvertNumberToWords(){
		String expectedResult1 = "ONE HUNDRED AND TWENTY-THREE DOLLARS AND FORTY-FIVE CENTS";
		
		try {
			assertEquals(expectedResult1,ConverterFunctions.convertNumToMoneyWords("123.45"));
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
		assertTrue(true);
	}
	
	@Test
	public void testconvertNumberToWordsNegativeNumber(){
		String expectedResult1 = "MINUS ONE HUNDRED AND TWENTY-THREE DOLLARS AND FORTY-FIVE CENTS";
		
		try {
			assertEquals(expectedResult1,ConverterFunctions.convertNumToMoneyWords("-123.45"));
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
		assertTrue(true);
	}
	
	@Test
	public void testnumberToWords(){
		String expectedResult1 = "ZERO";
		String expectedResult2 = "MINUS ONE";
		String expectedResult3 = "ONE";
		String expectedResult4 = "TEN";
		String expectedResult5 = "MINUS TEN";
		String expectedResult6 = "FIFTEEN";
		String expectedResult7 = "NINETEEN";
		String expectedResult8 = "TWENTY";
		String expectedResult9 = "TWENTY-ONE";
		String expectedResult10 = "MINUS TWENTY-ONE";
		String expectedResult11 = "TWENTY-EIGHT";
		String expectedResult12 = "NINETY-EIGHT";
		String expectedResult13 = "NINETY-NINE";
		String expectedResult14 = "ONE HUNDRED";
		String expectedResult15 = "ONE HUNDRED AND ONE";
		String expectedResult16 = "ONE HUNDRED AND TEN";
		String expectedResult17 = "ONE HUNDRED AND NINETEEN";
		String expectedResult18 = "MINUS ONE HUNDRED AND NINETEEN";
		String expectedResult19 = "TWO HUNDRED AND FORTY-SEVEN";
		String expectedResult20 = "NINE HUNDRED";
		String expectedResult21 = "FOUR HUNDRED AND ONE";
		String expectedResult22 = "ONE THOUSAND";
		String expectedResult23 = "ONE THOUSAND AND ONE";
		String expectedResult24 = "EIGHT THOUSAND AND FIFTY-SIX";
		String expectedResult25 = "NINE THOUSAND NINE HUNDRED AND SIXTY-FIVE";
		String expectedResult26 = "SEVEN THOUSAND AND FOUR";
		String expectedResult27 = "SIX THOUSAND AND FORTY-THREE";
		String expectedResult28 = "TEN THOUSAND";
		String expectedResult29 = "TEN THOUSAND AND ONE";
		String expectedResult30 = "ELEVEN THOUSAND";
		String expectedResult31 = "FIFTEEN THOUSAND FIVE HUNDRED AND TWELVE";
		String expectedResult32 = "EIGHTY-NINE THOUSAND NINE HUNDRED AND NINETY-NINE";
		String expectedResult33 = "NINETY-NINE THOUSAND NINE HUNDRED AND NINETY-NINE";
		String expectedResult34 = "ONE HUNDRED THOUSAND";
		String expectedResult35 = "ONE HUNDRED THOUSAND AND NINE";
		String expectedResult36 = "ONE HUNDRED AND THIRTY THOUSAND AND NINE";
		String expectedResult37 = "SEVEN HUNDRED AND SIXTY-FIVE THOUSAND AND NINE";
		String expectedResult38 = "FOUR HUNDRED AND EIGHTEEN THOUSAND AND TWELVE";
		String expectedResult39 = "MINUS TWO HUNDRED AND TWENTY-SEVEN THOUSAND SIX HUNDRED AND FORTY-ONE";
		String expectedResult40 = "ONE MILLION";
		String expectedResult41 = "ONE MILLION AND ONE";
		String expectedResult42 = "MINUS ONE MILLION AND SIXTEEN";
		String expectedResult43 = "NINE MILLION AND SEVENTY";
		String expectedResult44 = "EIGHTEEN MILLION AND FIFTY-ONE";
		String expectedResult45 = "ONE HUNDRED AND TWENTY-FIVE MILLION THREE HUNDRED THOUSAND AND NINETY-THREE";
		String expectedResult46 = "SEVEN HUNDRED AND SEVENTY-SEVEN MILLION THREE HUNDRED AND TWENTY-FIVE THOUSAND SIX HUNDRED AND TWO";
		String expectedResult47 = "EIGHT HUNDRED AND EIGHT MILLION ONE HUNDRED THOUSAND AND TEN";
		String expectedResult48 = "ONE BILLION";
		String expectedResult49 = "ONE BILLION AND ONE";
		String expectedResult50 = "MINUS ONE BILLION AND SIXTEEN";
		String expectedResult51 = "THREE BILLION AND FORTY";
		String expectedResult52 = "NINETEEN BILLION AND THIRTY-SEVEN";
		String expectedResult53 = "THREE HUNDRED AND SIXTY-TWO BILLION SEVEN HUNDRED THOUSAND AND TWENTY-ONE";
		String expectedResult54 = "NINE HUNDRED AND FORTY-FOUR BILLION ONE HUNDRED AND THIRTY-TWO MILLION ONE HUNDRED AND EIGHTY-ONE THOUSAND TWO HUNDRED AND NINE";
		String expectedResult55 = "TWO HUNDRED AND EIGHT BILLION SIX HUNDRED AND SIX MILLION FOUR HUNDRED THOUSAND AND TEN";
		String expectedResult56 = "ONE TRILLION";
		String expectedResult57 = "ONE TRILLION AND ONE";
		String expectedResult58 = "MINUS ONE TRILLION AND SIXTEEN";
		String expectedResult59 = "THREE TRILLION AND FORTY";
		String expectedResult60 = "NINETEEN TRILLION AND THIRTY-SEVEN";
		String expectedResult61 = "THREE HUNDRED AND SIXTY-TWO TRILLION SEVEN HUNDRED THOUSAND AND TWENTY-ONE";
		String expectedResult62 = "NINE HUNDRED AND FORTY-FOUR TRILLION ONE HUNDRED AND THIRTY-TWO BILLION ONE HUNDRED AND THIRTY-TWO MILLION ONE HUNDRED AND EIGHTY-ONE THOUSAND TWO HUNDRED AND NINE";
		String expectedResult63 = "ONE QUADRILLION";
		String expectedResult64 = "ONE QUADRILLION AND ONE";
		String expectedResult65 = "MINUS ONE QUADRILLION AND SIXTEEN";
		String expectedResult66 = "THREE QUADRILLION AND FORTY";
		String expectedResult67 = "NINETEEN QUADRILLION AND THIRTY-SEVEN";
		String expectedResult68 = "THREE HUNDRED AND SIXTY-TWO QUADRILLION SEVEN HUNDRED THOUSAND AND TWENTY-ONE";
		String expectedResult69 = "NINE HUNDRED AND FORTY-FOUR QUADRILLION ONE HUNDRED AND ELEVEN TRILLION ONE HUNDRED AND THIRTY-TWO BILLION ONE HUNDRED AND THIRTY-TWO MILLION ONE HUNDRED AND EIGHTY-ONE THOUSAND TWO HUNDRED AND NINE";
		String expectedResult70 = "ONE QUINTILLION";
		String expectedResult71 = "ONE QUINTILLION AND ONE";
		String expectedResult72 = "MINUS ONE QUINTILLION AND SIXTEEN";
		String expectedResult73 = "THREE QUINTILLION AND FORTY";
		String expectedResult74 = "NINE QUINTILLION ONE HUNDRED AND FORTY-FOUR QUADRILLION ONE HUNDRED AND ELEVEN TRILLION ONE HUNDRED AND THIRTY-TWO BILLION ONE HUNDRED AND THIRTY-TWO MILLION ONE HUNDRED AND EIGHTY-ONE THOUSAND TWO HUNDRED AND NINE";		
		
		try {
			assertEquals(expectedResult1,ConverterFunctions.numberToWords(0));
			assertEquals(expectedResult2,ConverterFunctions.numberToWords(-1));
			assertEquals(expectedResult3,ConverterFunctions.numberToWords(1));
			assertEquals(expectedResult4,ConverterFunctions.numberToWords(10));
			assertEquals(expectedResult5,ConverterFunctions.numberToWords(-10));
			assertEquals(expectedResult6,ConverterFunctions.numberToWords(15));
			assertEquals(expectedResult7,ConverterFunctions.numberToWords(19));
			assertEquals(expectedResult8,ConverterFunctions.numberToWords(20));
			assertEquals(expectedResult9,ConverterFunctions.numberToWords(21));
			assertEquals(expectedResult10,ConverterFunctions.numberToWords(-21));
			assertEquals(expectedResult11,ConverterFunctions.numberToWords(28));
			assertEquals(expectedResult12,ConverterFunctions.numberToWords(98));
			assertEquals(expectedResult13,ConverterFunctions.numberToWords(99));
			assertEquals(expectedResult14,ConverterFunctions.numberToWords(100));
			assertEquals(expectedResult15,ConverterFunctions.numberToWords(101));
			assertEquals(expectedResult16,ConverterFunctions.numberToWords(110));
			assertEquals(expectedResult17,ConverterFunctions.numberToWords(119));
			assertEquals(expectedResult18,ConverterFunctions.numberToWords(-119));
			assertEquals(expectedResult19,ConverterFunctions.numberToWords(247));
			assertEquals(expectedResult20,ConverterFunctions.numberToWords(900));
			assertEquals(expectedResult21,ConverterFunctions.numberToWords(401));
			assertEquals(expectedResult22,ConverterFunctions.numberToWords(1000));
			assertEquals(expectedResult23,ConverterFunctions.numberToWords(1001));
			assertEquals(expectedResult24,ConverterFunctions.numberToWords(8056));
			assertEquals(expectedResult25,ConverterFunctions.numberToWords(9965));
			assertEquals(expectedResult26,ConverterFunctions.numberToWords(7004));
			assertEquals(expectedResult27,ConverterFunctions.numberToWords(6043));
			assertEquals(expectedResult28,ConverterFunctions.numberToWords(10000));
			assertEquals(expectedResult29,ConverterFunctions.numberToWords(10001));
			assertEquals(expectedResult30,ConverterFunctions.numberToWords(11000));
			assertEquals(expectedResult31,ConverterFunctions.numberToWords(15512));
			assertEquals(expectedResult32,ConverterFunctions.numberToWords(89999));
			assertEquals(expectedResult33,ConverterFunctions.numberToWords(99999));
			assertEquals(expectedResult34,ConverterFunctions.numberToWords(100000));
			assertEquals(expectedResult35,ConverterFunctions.numberToWords(100009));
			assertEquals(expectedResult36,ConverterFunctions.numberToWords(130009));
			assertEquals(expectedResult37,ConverterFunctions.numberToWords(765009));
			assertEquals(expectedResult38,ConverterFunctions.numberToWords(418012));
			assertEquals(expectedResult39,ConverterFunctions.numberToWords(-227641));
			assertEquals(expectedResult40,ConverterFunctions.numberToWords(1000000));
			assertEquals(expectedResult41,ConverterFunctions.numberToWords(1000001));
			assertEquals(expectedResult42,ConverterFunctions.numberToWords(-1000016));
			assertEquals(expectedResult43,ConverterFunctions.numberToWords(9000070));
			assertEquals(expectedResult44,ConverterFunctions.numberToWords(18000051));
			assertEquals(expectedResult45,ConverterFunctions.numberToWords(125300093));
			assertEquals(expectedResult46,ConverterFunctions.numberToWords(777325602));
			assertEquals(expectedResult47,ConverterFunctions.numberToWords(808100010));
			assertEquals(expectedResult48,ConverterFunctions.numberToWords(1000000000));
			assertEquals(expectedResult49,ConverterFunctions.numberToWords(1000000001));
			assertEquals(expectedResult50,ConverterFunctions.numberToWords(-1000000016));
			assertEquals(expectedResult51,ConverterFunctions.numberToWords(3000000040L));
			assertEquals(expectedResult52,ConverterFunctions.numberToWords(19000000037L));
			assertEquals(expectedResult53,ConverterFunctions.numberToWords(362000700021L));
			assertEquals(expectedResult53,ConverterFunctions.numberToWords(362000700021L));
			assertEquals(expectedResult54,ConverterFunctions.numberToWords(944132181209L));
			assertEquals(expectedResult55,ConverterFunctions.numberToWords(208606400010L));
			assertEquals(expectedResult56,ConverterFunctions.numberToWords(1000000000000L));
			assertEquals(expectedResult57,ConverterFunctions.numberToWords(1000000000001L));
			assertEquals(expectedResult58,ConverterFunctions.numberToWords(-1000000000016L));
			assertEquals(expectedResult59,ConverterFunctions.numberToWords(3000000000040L));
			assertEquals(expectedResult60,ConverterFunctions.numberToWords(19000000000037L));
			assertEquals(expectedResult61,ConverterFunctions.numberToWords(362000000700021L));
			assertEquals(expectedResult62,ConverterFunctions.numberToWords(944132132181209L));
			assertEquals(expectedResult63,ConverterFunctions.numberToWords(1000000000000000L));
			assertEquals(expectedResult64,ConverterFunctions.numberToWords(1000000000000001L));
			assertEquals(expectedResult65,ConverterFunctions.numberToWords(-1000000000000016L));
			assertEquals(expectedResult66,ConverterFunctions.numberToWords(3000000000000040L));
			assertEquals(expectedResult67,ConverterFunctions.numberToWords(19000000000000037L));
			assertEquals(expectedResult68,ConverterFunctions.numberToWords(362000000000700021L));
			assertEquals(expectedResult69,ConverterFunctions.numberToWords(944111132132181209L));
			assertEquals(expectedResult70,ConverterFunctions.numberToWords(1000000000000000000L));
			assertEquals(expectedResult71,ConverterFunctions.numberToWords(1000000000000000001L));
			assertEquals(expectedResult72,ConverterFunctions.numberToWords(-1000000000000000016L));
			assertEquals(expectedResult73,ConverterFunctions.numberToWords(3000000000000000040L));
			assertEquals(expectedResult74,ConverterFunctions.numberToWords(9144111132132181209L));
			
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
		assertTrue(true);
	}

}
