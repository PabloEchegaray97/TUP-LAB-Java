import javax.swing.JOptionPane;

public class ejercicio_11 {
    public static void main(String[] args) {
        int mayor = 0;
        int posicionMayor = 0;
        int posicion=-1;
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
    }
}
