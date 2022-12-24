package es.itrafa.ej2;

/**
 * Dibujar el perímetro de un cuadrado
 *
 * Crea un método estático denominado cuadrado(l, c) que dibuje el perímetro (borde) de un
 * cuadrado de lado l y  con carácter de dibujo c. Se garantiza que l es un int y que l >= 2.
 * Para que el dibujo sea un cuadrado aceptablemente proporcionado los caracteres de la misma
 * línea tiene un espacio en blanco intercalado. Debe resolverse el problema imprimiendo
 * caracter a caracter sin la ayuda de los métodos de la clase String, StringBuilder etc.
 *
 * Por ejemplo:
 * Test 	Resultado
 *
 * cuadrado(5, '#')
 *
 *
 *
 * # # # # #
 * #       #
 * #       #
 * #       #
 * # # # # #
 *
 * cuadrado(2, '*')
 *
 *
 *
 * * *
 * * *
 */
public class Ej2 {
    public static void main(String[] args){
        cuadrado(5, '#');
        cuadrado(2, '*');
    }

    private static void cuadrado(int l, char c) {
        // 1º línea
        for(int i = 0; i < l; i++) {
            System.out.print(c + " ");
        }
        System.out.println();

        // líneas del medio
        for (int i = 0; i < l -2; i++){
            for(int j = 0; j < l; j++) {
                if( j == 0 || j == l-1){
                    System.out.print(c + " ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        // última línea
        for(int i = 0; i < l; i++){
            System.out.print(c + " ");
        }
        System.out.println();
    }

}
