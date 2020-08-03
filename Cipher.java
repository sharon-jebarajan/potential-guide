import java.util.*;
import java.io.*;
class Cipher
{
	public static void main(String args[])
	{
		int a =0; int b=1;
		Scanner h =new Scanner(System.in);
		System.out.println("Choose");
		System.out.println("1.Ciphering");
		System.out.println("2.Deciphering");
		int j =h.nextInt();
		if(j==1)
		{
			System.out.println("Enter string");
Scanner m = new Scanner(System.in);
		String text = m.nextLine();
		int n=text.length();
		
		for(int i =0;i<n;i++)
		{
			
		
				String l = text.substring(a,b);
				a++;
				b++;
		switch(l)
		{
			case "A":
			    System.out.print("m");
			    break;

			case "B":
			    System.out.print("n");
			    break;
			case "C":
			    System.out.print("b");
			    break;
			case "D":
                System.out.print("v");
			    break;
			case "E":
                System.out.print("c");
			    break;

			case "F":
                System.out.print("x");
			    break;
			case "G":
                System.out.print("z");
			    break;
			case "H":
                System.out.print("l");
			    break;
			case "I":
                System.out.print("k");
			    break;


			 case "J":
                System.out.print("j");
			    break;
			case "K":
                System.out.print("h");
			    break;
			case "L":
                System.out.print("g");
			    break;
			 case "M":
                System.out.print("f");
			    break;
			case "N":
                System.out.print("d");
			    break;
			case "O":
                System.out.print("s");
			    break;
			case "P":
                System.out.print("a");
			    break;
			case "Q":
                System.out.print("q");
			    break;
			case "R":
                System.out.print("w");
			    break;
			case "S":
                System.out.print("e");
			    break;
			case "T":
                System.out.print("r");
			    break;
			case "U":
                System.out.print("t");
			    break;
			case "V":
                System.out.print("y");
			    break;
			case "W":
                System.out.print("u");
			    break;
			case "X":
                System.out.println("i");
			    break;
			case "Y":
                System.out.print("o");
			    break;


			case "Z":
                System.out.print("p");
			    break;

			 case "a":
			    System.out.print("M");
			    break;

			case "b":
			    System.out.print("N");
			    break;
			case "c":
			    System.out.print("B");
			    break;
			case "d":
                System.out.print("V");
			    break;
			case "e":
                System.out.print("C");
			    break;

			case "f":
                System.out.print("X");
			    break;
			case "g":
                System.out.print("Z");
			    break;
			case "h":
                System.out.print("L");
			    break;
			case "i":
                System.out.print("K");
			    break;


			 case "j":
                System.out.print("J");
			    break;
			case "k":
                System.out.print("H");
			    break;
			case "l":
                System.out.print("G");
			    break;
			 case "m":
                System.out.print("F");
			    break;
			case "n":
                System.out.print("D");
			    break;
			case "o":
                System.out.print("S");
			    break;
			case "p":
                System.out.print("A");
			    break;
			case "q":
                System.out.print("Q");
			    break;
			case "r":
                System.out.print("W");
			    break;
			case "s":
                System.out.print("E");
			    break;
			case "t":
                System.out.print("R");
			    break;
			case "u":
                System.out.print("T");
			    break;
			case " v":
                System.out.print("Y");
			    break;
			case "w":
                System.out.print("U");
			    break;
			case "x":
                System.out.println("I");
			    break;
			case "y":
                System.out.print("O");
			    break;


			case "z":
                System.out.print("P");
			    break;
			
			default:
			    System.out.print("Enter correct word");

		}
		}		
			
		}
		else
		{ System.out.println("Enter string");
Scanner m = new Scanner(System.in);
			String text = m.nextLine();
		int n=text.length();
		
		for(int i =0;i<n;i++)
		{
			
		
				String l = text.substring(a,b);
				a++;
				b++;
		switch(l)
		{
			case "m":
			    System.out.print("A");
			    break;

			case "n":
			    System.out.print("B");
			    break;
			case "b":
			    System.out.print("C");
			    break;
			case "v":
                System.out.print("D");
			    break;
			case "c":
                System.out.print("E");
			    break;

			case "x":
                System.out.print("F");
			    break;
			case "z":
                System.out.print("G");
			    break;
			case "l":
                System.out.print("H");
			    break;
			case "k":
                System.out.print("I");
			    break;


			 case "j":
                System.out.print("J");
			    break;
			case "h":
                System.out.print("K");
			    break;
			case "g":
                System.out.print("L");
			    break;
			 case "f":
                System.out.print("M");
			    break;
			case "d":
                System.out.print("N");
			    break;
			case "s":
                System.out.print("O");
			    break;
			case "a":
                System.out.print("P");
			    break;
			case "q":
                System.out.print("Q");
			    break;
			case "w":
                System.out.print("R");
			    break;
			case "e":
                System.out.print("S");
			    break;
			case "r":
                System.out.print("T");
			    break;
			case "t":
                System.out.print("U");
			    break;
			case "y":
                System.out.print("V");
			    break;
			case "u":
                System.out.print("W");
			    break;
			case "i":
                System.out.println("X");
			    break;
			case "o":
                System.out.print("Y");
			    break;


			case "p":
                System.out.print("Z");
			    break;

			 case "A":
			    System.out.print("m");
			    break;

			case "B":
			    System.out.print("n");
			    break;
			case "C":
			    System.out.print("b");
			    break;
			case "D":
                System.out.print("v");
			    break;
			case "E":
                System.out.print("c");
			    break;

			case "F":
                System.out.print("x");
			    break;
			case "G":
                System.out.print("z");
			    break;
			case "H":
                System.out.print("l");
			    break;
			case "I":
                System.out.print("k");
			    break;


			 case "J":
                System.out.print("j");
			    break;
			case "K":
                System.out.print("h");
			    break;
			case "L":
                System.out.print("g");
			    break;
			 case "M":
                System.out.print("f");
			    break;
			case "N":
                System.out.print("d");
			    break;
			case "O":
                System.out.print("s");
			    break;
			case "P":
                System.out.print("a");
			    break;
			case "Q":
                System.out.print("q");
			    break;
			case "R":
                System.out.print("w");
			    break;
			case "S":
                System.out.print("e");
			    break;
			case "T":
                System.out.print("r");
			    break;
			case "U":
                System.out.print("t");
			    break;
			case "V":
                System.out.print("y");
			    break;
			case "W":
                System.out.print("u");
			    break;
			case "X":
                System.out.println("i");
			    break;
			case "Y":
                System.out.print("o");
			    break;


			case "Z":
                System.out.print("p");
			    break;
			
			default:
			    System.out.print("Enter correct word");

		}
	}
}}}
