public class SeparacionDeLinea {
    public static void main(String[] args){
        for(char x = 'Z';x>='A';x--){
            for(char c ='A';c<x;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
