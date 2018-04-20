package itam.ejercicio;

public class Solucion {

    public static boolean gus(String str){
	String s = str + str;
	return s.substring(1, s.length()-1).contains(str);
    }
    
    public static void main(String...argv) {
	System.out.println(gus("abab"));
	System.out.println(gus("aba"));
	System.out.println(gus("gustavogustavogustavo"));
    }

}
