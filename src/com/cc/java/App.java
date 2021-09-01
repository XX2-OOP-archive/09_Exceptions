package com.cc.java;

public class App {

	public static void main(String[] args) {
		
		String str;  // String
		char ch; // Character

		try 
		{		
			str = "Irgend eine Zeichenkette";
			ausgabe("Stringlaenge: " + str.length());
			
			ch = str.charAt(200);
			ausgabe("Character: " + ch);	
		} 
		catch (StringIndexOutOfBoundsException e) 
		{
			// Fehlerbehandlung ...
			ausgabe("Index Fehler, bitte Eingabe pruefen!");		
		}
		catch (Exception e) 
		{
			// Weitere Fehler-Routinen ....
		}
		
	}

	private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
	

}
