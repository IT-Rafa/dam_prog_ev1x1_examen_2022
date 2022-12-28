package es.itrafa.ej4;

/**
 * Veni, vidi, vici
 * <p>
 * En criptografía, el cifrado César es una de las técnicas de cifrado más simples y más usadas.
 * Es un tipo de cifrado por sustitución en el que una letra en el texto original es reemplazada
 * por otra letra que se encuentra un número fijo de posiciones más adelante en el alfabeto.
 * Por ejemplo, con un desplazamiento de 3, la A sería sustituida por la D (situada 3 lugares a
 * la derecha de la A), la B sería reemplazada por la E, etc. Para descifrar el mensaje, no
 * tenemos más que realizar el mismo desplazamiento pero en sentido contrario. Este método
 * debe su nombre a Julio César, que lo usaba para comunicarse con sus generales.
 * <p>
 * Deberás implementar un método denominado cesar que aceptará dos parámetros: el texto a cifrar
 * y el desplazamiento. El método devolverá el texto cifrado en mayúsculas. Se omitirá el
 * cifrado de cualquier carácter no alfabético (dígitos, signos de puntuación, espacios,...),
 * que se mantendrán en el texto, tal cual están.
 * <p>
 * Debes tener en cuenta que el alfabeto de sustitución es rotativo. Es decir, con el
 * desplazamiento de 3 caracteres del ejemplo anterior, una X se convertiría en una A, una Y en
 * una B y una Z en una C.
 * <p>
 * Con objeto de simplificar el problema, se garantiza:
 * <p>
 * que las entradas solo contienen caracteres del alfabeto inglés, aunque podría haber
 * mayúsculas y minúsculas
 * un desplazamiento d tal que  -26<=d<=26
 * <p>
 * Por ejemplo:
 * Test 	Resultado
 * <p>
 * cesar("Alea iacta est", 3)
 * <p>
 * <p>
 * <p>
 * DOHD LDFWD HVW
 * <p>
 * cesar("Ave, Caesar, morituri te salutant", 7)
 * <p>
 * <p>
 * <p>
 * HCL, JHLZHY, TVYPABYP AL ZH
 * <p>
 * V -> C
 * t -> A
 * u -> B
 * t -> A
 */
public class Ej4 {
    public static void main(String[] args) {
        System.out.println(cesar("Alea iacta est", 3));
        // DOHD LDFWD HVW

        System.out.println(cesar("Ave, Caesar, morituri te salutant", 7));
        // HCL, JHLZHY, TVYPABYP AL ZHSBAHUA

        System.out.println(cesar("VW VCODKGP, DTWVQ?", -2));
        // TU TAMBIEN, BRUTO?

        System.out.println(cesar("a",-1));
        // Z

        System.out.println(cesar("a",-26));
        // A

        System.out.println(cesar("abcdefghijklmnopqrstuvwxyz", 7));
        // HIJKLMNOPQRSTUVWXYZABCDEFG

        System.out.println(cesar("abcdefghijklmnopqrstuvwxyz",-1));
        // ZABCDEFGHIJKLMNOPQRSTUVWXY
    }

    private static String cesar(String s, int desp) {
        final int ABCLENGTH = 26;
        StringBuilder result = new StringBuilder();

        char[] line = s.toUpperCase().toCharArray();
        for (int i = 0; i < s.length(); i++) {

            if (line[i] >= 'A' && line[i] <= 'Z' - desp) {
                result.append((char) (line[i] + desp));

            } else if (line[i] > 'Z' - desp && line[i] <= 'Z') {
                result.append((char) (line[i] - ABCLENGTH + desp));
            } else {
                result.append(line[i]);
            }
        }
        return String.valueOf(result);
    }
}
