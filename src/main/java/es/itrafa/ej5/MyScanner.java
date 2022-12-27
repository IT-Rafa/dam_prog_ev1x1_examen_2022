package es.itrafa.ej5;

// FALLA HASNEXT
public class MyScanner {

    // ATTRIBUTES
    private int pos;
    private String datos;

    // CREATORS
    public MyScanner(String st) {
        this.datos = st;
        this.pos = 0;
    }

    // GETTER && SETTER

    /**
     * Devuelve el entero almacenado por el atributo pos.
     */
    public int getPos() {
        return this.pos;
    }

    /**
     * Devuelve el String almacenado en Datos que es justamente el String que se indica
     * al constructor. Este es un valor constante a lo largo de la vida del objeto.
     */
    public String getDatos() {
        return this.datos;
    }

    // METHODS

    /**
     * Devuelve true si quedan más caracteres por escanear que constituyan una línea.
     * En caso contrario devuelve false. Si entre la posición actual del escaneo y el
     * final del String hay al menos un  carácter siempre se va a poder devolver un
     * String que se considera una línea, aunque sea el string vacío.
     */
    public boolean hasNextLine() {
        for (int i = this.pos; i < this.datos.length(); i++) {
            if (this.datos.charAt(i) == '\n' || i == this.datos.length() - 1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Devuelve true si  queda algún token en los datos por analizar, es decir, si
     * hay algún carácter no delimitador entre pos y datos.length(). En caso contrario
     * devuelve false
     */
    public boolean hasNext() {
        for (int i = this.pos; i < this.datos.length(); i++) {
            if (this.datos.charAt(i) != ' ' && this.datos.charAt(i) != '\t' && this.datos.charAt(i) != '\n') {
                // Comprobar que lo que queda no son solo símbolos
                return true;
            }
        }
        return false;
    }

    /**
     * Devuelve un String que se corresponde con  la línea leida. Recuerda la
     * posibilidad de que nextLine() devuelva el string vacío "" cuando se encuentra
     * inmediatamente un \n
     */
    public String nextLine() {
        StringBuilder result = new StringBuilder();
        for (int i = this.pos; i < this.datos.length(); i++) {
            this.pos++;
            if (this.datos.charAt(i) == '\n') {
                break;
            } else {
                result.append(this.datos.charAt(i));
            }

        }
        return result.toString();
    }

    /**
     * Devuelve un String que se corresponde con el token leído. Token es un conjunto
     * caracteres contiguos delimitador por un carácter delimitador que no se considera
     * parte del token.
     */
    public String next() {
        StringBuilder result = new StringBuilder();
        for (int i = this.pos; i < this.datos.length(); i++, this.pos++) {
            if (this.datos.charAt(i) != ' ' && this.datos.charAt(i) != '\t' && this.datos.charAt(i) != '\n') {
                break;
            }
        }
        for (int i = this.pos; i < this.datos.length(); i++, this.pos++) {
            if (this.datos.charAt(i) != ' ' && this.datos.charAt(i) != '\t' && this.datos.charAt(i) != '\n') {
                result.append(this.datos.charAt(i));
            } else {
                break;
            }

        }
        return result.toString();
    }

    /**
     * Devuelve un int que se corresponde con el token leído
     */
    public int nextInt() {
        return Integer.parseInt(this.next());
    }
}
