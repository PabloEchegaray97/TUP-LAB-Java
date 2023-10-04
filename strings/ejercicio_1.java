import javax.swing.JOptionPane;

public class ejercicio_1 {
    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog(null, "Ingrese una frase:", "Entrada de texto", JOptionPane.QUESTION_MESSAGE);
        int longitud = frase.length();
        JOptionPane.showMessageDialog(null, "La longitud de la frase es: "+ longitud + ".", "longitud", JOptionPane.PLAIN_MESSAGE);

        String posicion = JOptionPane.showInputDialog(null, "Ingrese un número de posición de la frase ingresada(los valores válidos son de 0 al " + longitud+ ".", "posición", JOptionPane.QUESTION_MESSAGE );
        int posicion_1 = Integer.parseInt(posicion);
        JOptionPane.showMessageDialog(null, "El caracter en la posición "+posicion_1+": "+frase.charAt(posicion_1), "Index", JOptionPane.PLAIN_MESSAGE);

        String palabra = JOptionPane.showInputDialog(null, "Ingrese una palabra a buscar: ", "palabra", JOptionPane.QUESTION_MESSAGE );
        int indiceFin = frase.indexOf(palabra) + palabra.length();
        JOptionPane.showMessageDialog(null, "La palabra comienza en el indice "+frase.indexOf(palabra)+" y termina en el índice "+palabra.length(), "palabra", JOptionPane.PLAIN_MESSAGE);

        String caracter = JOptionPane.showInputDialog(null, "Ingrese una caracter a buscar: ", "caracter", JOptionPane.QUESTION_MESSAGE );
        JOptionPane.showMessageDialog(null, "El carácter se encuentra en la posición: "+ frase.indexOf(caracter), "caracter", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null, "La frase en mayuscula es: "+ frase.toUpperCase() , "mayuscula", JOptionPane.PLAIN_MESSAGE);
    }
}
