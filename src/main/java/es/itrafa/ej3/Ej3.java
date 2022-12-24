package es.itrafa.ej3;


/**
 * Picos y Valles
 *
 * Mini y Max son inseparables desde la infancia aunque, en realidad, son muy diferentes.
 * Cuando uno sube, la otra baja. Si para uno es blanco, para la otra es negro.
 *
 * Bueno, ya se sabe lo que se dice de los extremos opuestos...
 *
 * Si hay algo que tienen en común es su afición por el montañismo. A ambos les encanta
 * subir a lo alto de una cima y otear el horizonte que los rodea. Eso sí, mientras uno
 * deja volar su imaginación al tiempo que divisa las altas cumbres circundantes, a la
 * otra se le van los ojos a los verdes y profundos valles. Qué se le va a hacer...
 *
 * Ahora bien, dada la lista de las cotas (alturas sobre el nivel del mar) del terreno
 * que tienen ante ellos, ¿serías capaz de contar el número total de picos y valles que
 * ven? Se entiende por "pico" a una cota más alta que la inmediatamente anterior y
 * posterior. Y "valle" si es más baja.
 *
 * Ten en cuenta que, dado que la lista de cotas abarca los 360º de horizonte a su
 * alrededor (o sea, es circular), tanto la primera como la última cota ¡podrían ser un
 * pico o un valle!
 *
 * Entrada
 *
 * El programa leerá de la entrada estándar múltiples casos de prueba, cada uno con una
 * lista de cotas.
 *
 * Cada caso de prueba contendrá una primera línea en la que se indicará el número de cotas
 * (2 ≤ n ≤ 1.000). A continuación, en la siguiente línea, vendrán n números positivos
 * (menores que 10.000) con las diferentes cotas.
 *
 * La entrada termina con un caso de prueba sin cotas (n=0) que no debe procesarse.
 *
 * Salida
 *
 * Por cada caso de prueba, el programa escribirá el número total de picos y valles que hay.
 *
 * Por ejemplo:
 * Entrada 	Resultado
 *
 * 4
 * 400 1000 350 250
 * 4
 * 1000 350 250 400
 * 5
 * 400 1000 1000 500 400
 * 0
 *
 *
 *
 * 2
 * 2
 * 0
 */

import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        while (cont){
            // Capturamos cant Cotas
            int cantCotas = Integer.parseInt(sc.nextLine());
            if (cantCotas == 0){
                break;
            }
            // Capturamos números cotas
            String[] line = sc.nextLine().split(" ");
            // convertimos array a int
            int[] cotas = new int[line.length];
            for (int i = 0; i < line.length; i++){
                cotas[i] = Integer.parseInt(line[i]);
            }

            // Analizamos cota
            int add = 0;
            for (int i = 0; i < cotas.length; i++){
                int next, prev;
                if(i == 0){
                    prev = cotas[cotas.length-1];
                    next = cotas[i+1];
                }else if(i == cotas.length-1){
                    next = cotas[0];
                    prev = cotas[i-1];
                }else{
                    prev = cotas[i-1];
                    next = cotas[i+1];
                }
                if (cotas[i] < prev && cotas[i] < next){
                    add++;
                }else if (cotas[i] > prev && cotas[i] > next){
                    add++;
                }
            }

            System.out.println(add);
        }
    }
}
