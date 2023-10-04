import javax.swing.*;

public class ejercicio_12 {
    public static void main(String[] args) {
        int menor=0;
        int posicionMenor = 0;
        int posicion=-1;
        int mayor = 0;
        int posicionMayor = 0;
        String words = JOptionPane.showInputDialog("Ingrese la frase: ");
        String[] arrOfStr = words.split(";");
        for(String a: arrOfStr){
            posicion++;
            if(a.length()>=mayor){
                posicionMayor=  posicion;
                mayor = a.length();

            }


        }
        System.out.println("La frase con mas palabras es: "+arrOfStr[posicionMayor]);
        String wordLess = arrOfStr[posicionMayor];
        String[] arrOfStrLess = wordLess.split(" ");
        posicion=-1;
        for(String b: arrOfStrLess){
            if(posicion==-1){
                posicion++;
                posicionMenor = posicion;
                menor = b.length();
            }
            else {
                posicion++;
                if (b.length() <= menor) {
                    posicionMenor = posicion;
                    menor = b.length();

                }
            }


        }
        System.out.println("La frase con menos  palabras es: "+arrOfStrLess[posicionMenor]);
    }
}
