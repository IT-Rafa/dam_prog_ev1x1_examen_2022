package es.itrafa.ej5;

/**
 * MyScanner
 * <p>
 * Se trata de escribir una clase Java que llamaremos MyScanner, una versión sencilla
 * de la famosa clase Scanner del API java. 
 * <p>
 * Nuestros objetos MyScanner sólo trabajan con los Strings introducidos en el constructor.
 * No trabaja con teclado, ni ficheros.  Los caracteres delimitadores que utiliza para
 * hacer su trabajo son los mismos que usa por defecto la clase Scanner: \n \t y ' '.
 * <p>
 *
 * <p>
 * La clase MyScanner consta de dos atributos
 * class MyScanner {
 * private int pos;
 * private String datos;
 * ......  resto de clase .......
 * }
 * La solución debe basarse en el recorrido y tratamiento del String datos, por descontado,
 * no se permite utilizar la clase Scanner en el interior de MyScanner para solucionar el
 * problema. . MyScanner es un escáner que avanza en su análisis de carácter en carácter
 * de forma que en el atributo datos se almacena el String sobre el que se produce el
 * escaneo y en pos se almacena la posición del siguiente carácter a procesar.
 * <p>
 * MyScanner consta  de los siguientes métodos:
 * <p>
 * getPos().
 * Devuelve el entero almacenado por el atributo pos.
 * getDatos().
 * Devuelve el String almacenado en Datos que es justamente el String que se indica
 * al constructor. Este es un valor constante a lo largo de la vida del objeto.
 * hasNextLine().
 * Devuelve true si quedan más caracteres por escanear que constituyan una línea .
 * En caso contrario devuelve, false. Si entre la posición actual del escaneo y el
 * final del String hay al menos un  carácter siempre se va a poder devolver un
 * String que se considera una línea, aunque sea el string vacío.
 * hasNext().
 * Devuelve true si  queda algún token en los datos por analizar, es decir, si
 * hay algún carácter no delimitador entre pos y datos.length(). En caso contrario
 * devuelve false
 * nextLine().
 * Devuelve un String que se corresponde con  la línea leida. Recuerda la
 * posibilidad de que nextLine() devuelva el string vacío "" cuando se encuentra
 * inmediatamente un \n.
 * <p>
 * next().
 * Devuelve un String que se corresponde con el token leído. Token es un conjunto
 * caracteres contiguos delimitador por un carácter delimitador que no se considera
 * parte del token.
 * <p>
 * nextInt().
 * Devuelve un int que se corresponde con el  token leído.
 * <p>
 * Para poder pasar los test, previamente tienes que evitar los errores de compilación.
 * Si no declaras todos los métodos del enunciado, que son métodos usados por los test
 * se provocará un error de compilación sin llegar a comprobarse ni siquiera el primer test.
 * <p>
 * Por lo tanto, lo primero que tienes que hacer es escribir un armazón de la clase indicando
 * los atributos y a continuación al menos los métodos indicados en el enunciado.
 * <p>
 * Para cada método tienes que declarar como mínimo el tipo de datos que devuelve y una
 * instrucción return devolviendo un valor de dicho tipo. Luego,  a medida  que avances
 * en la pregunta iras  escribiendo el código detallado de cada método. Por ejemplo, no sé
 * resolver el método next() o todavía no empecé a solucionarlo porque estoy con otras
 * partes de la pregunta, pero escribo
 * <p>
 * String next(){
 * <p>
 * return "nolohice";//cualquier String
 * }
 * <p>
 * Ten en cuenta, que el funcionamiento de next(), nextInt() y nextLine() es similar al de la
 * clase Scanner que se asume que conoces y entiendes.  Observa en los ejemplos,  que si
 * nextLine()  y next()  en su procesamiento de caracteres, llegan al final del string datos,
 * devuelve los caracteres correspondientes aunque no hubieran llegado  a un delimitador,.
 * Así es además como funcione el Scanner del API java.
 * <p>
 * Por ejemplo:
 * Test 	Resultado
 * <p>
 * MyScanner ms=new MyScanner("hola a todas");
 * System.out.println(ms.getPos());
 * System.out.println(ms.getDatos());
 * <p>
 * <p>
 * <p>
 * 0
 * hola a todas
 * <p>
 * MyScanner ms=new MyScanner("hola a todas\n y hola a todos");
 * System.out.println(ms.getPos());
 * System.out.println(ms.getDatos());
 * <p>
 * <p>
 * <p>
 * 0
 * hola a todas
 * y hola a todos
 * <p>
 * MyScanner ms=new MyScanner("");//String vacio
 * System.out.println(ms.getPos());
 * System.out.println(ms.hasNextLine());
 * <p>
 * <p>
 * <p>
 * 0
 * false
 * <p>
 * MyScanner ms=new MyScanner("hola a todos\ny adios");
 * ms.nextLine();
 * System.out.println(ms.getPos());
 * System.out.println(ms.getDatos());
 * <p>
 * <p>
 * <p>
 * 13
 * hola a todos
 * y adios
 * <p>
 * MyScanner ms=new MyScanner("hola a todas\n y hola a todos");
 * System.out.println(ms.nextLine());
 * System.out.println(ms.nextLine());
 * System.out.println(ms.getPos());
 * System.out.println(ms.hasNextLine());
 * <p>
 * <p>
 * <p>
 * hola a todas
 * y hola a todos
 * 28
 * false
 * <p>
 * MyScanner ms=new MyScanner("hola a todas\n y hola a todos");
 * System.out.println(ms.getPos());
 * System.out.println(ms.hasNextLine());
 * <p>
 * <p>
 * <p>
 * 0
 * true
 * <p>
 * MyScanner ms=new MyScanner("hola a todas\n y hola a todos");
 * System.out.println(ms.nextLine());
 * System.out.println(ms.nextLine());
 * System.out.println(ms.hasNextLine());
 * <p>
 * <p>
 * <p>
 * hola a todas
 * y hola a todos
 * false
 * <p>
 * MyScanner ms=new MyScanner("hola a todas\n y hola a todos");
 * System.out.println(ms.nextLine());
 * System.out.println(ms.getPos());
 * System.out.println(ms.getDatos());
 * <p>
 * <p>
 * <p>
 * hola a todas
 * 13
 * hola a todas
 * y hola a todos
 * <p>
 * MyScanner ms=new MyScanner("hola a todos");
 * while(ms.hasNextLine()){
 * System.out.println(ms.nextLine());
 * }
 * <p>
 * <p>
 * <p>
 * hola a todos
 * <p>
 * MyScanner ms=new MyScanner("hola a todas \ny también hola a todos");
 * while(ms.hasNextLine()){
 * System.out.println(ms.nextLine());
 * }
 * <p>
 * <p>
 * <p>
 * hola a todas
 * y también hola a todos
 * <p>
 * MyScanner ms=new MyScanner("hola a todas \ny también hola a todos\n");
 * while(ms.hasNextLine()){
 * System.out.println(ms.nextLine());
 * }
 * <p>
 * <p>
 * <p>
 * hola a todas
 * y también hola a todos
 * <p>
 * MyScanner ms=new MyScanner("hola a todas \n\ny también hola a todos\n");
 * while(ms.hasNextLine()){
 * System.out.println(ms.nextLine());
 * }
 * <p>
 * <p>
 * <p>
 * hola a todas
 * <p>
 * y también hola a todos
 * <p>
 * MyScanner ms=new MyScanner("hola a todos");
 * System.out.println(ms.getPos());
 * System.out.println(ms.getDatos());
 * <p>
 * <p>
 * <p>
 * 0
 * hola a todos
 * <p>
 * MyScanner ms=new MyScanner("hola a todos");
 * System.out.println(ms.getPos());
 * System.out.println(ms.next());
 * System.out.println(ms.next());
 * System.out.println(ms.getPos());
 * <p>
 * <p>
 * <p>
 * 0
 * hola
 * a
 * 6
 * <p>
 * MyScanner ms=new MyScanner("2 3 4");
 * int suma=0;
 * while(ms. hasNext()) suma+=ms.nextInt();
 * System.out.println(suma);
 * <p>
 * <p>
 * <p>
 * 9
 * <p>
 * MyScanner ms=new MyScanner("2 \t3 \n4\n");
 * int suma=0;
 * while(ms. hasNext()) suma+=ms.nextInt();
 * System.out.println(suma);
 * <p>
 * <p>
 * <p>
 * 9
 * <p>
 * MyScanner ms=new MyScanner("2 3 4\n\t");
 * int suma=0;
 * while(ms. hasNext()) suma+=ms.nextInt();
 * System.out.println(suma);
 * <p>
 * <p>
 * <p>
 * 9
 * <p>
 * MyScanner ms=new MyScanner("2 \nmi mama me mima");
 * System.out.println(ms.nextInt());
 * ms.nextLine();//limpiar enter
 * System.out.println(ms.nextLine());
 */
class Ej5 {
    public static void main(String[] args) {
        /*
        MyScanner ms = new MyScanner("hola a todas");
        System.out.println(ms.getPos());
        System.out.println(ms.getDatos());

        // 0
        // hola a todas

        System.out.println();

        MyScanner ms1 = new MyScanner("hola a todas\n y hola a todos");
        System.out.println(ms1.getPos());
        System.out.println(ms1.getDatos());

        // 0
        // hola a todas
        //  y hola a todos

        System.out.println();

        MyScanner ms2 = new MyScanner("");//String vacio
        System.out.println(ms2.getPos());
        System.out.println(ms2.hasNextLine());

        // 0
        // false

        System.out.println();

        MyScanner ms3 = new MyScanner("hola a todos\ny adios");
        ms3.nextLine();
        System.out.println(ms3.getPos());
        System.out.println(ms3.getDatos());

        // 13
        // hola a todos
        // y adios

        System.out.println();

        MyScanner ms4 = new MyScanner("hola a todas\n y hola a todos");
        System.out.println(ms4.nextLine());
        System.out.println(ms4.nextLine());
        System.out.println(ms4.getPos());
        System.out.println(ms4.hasNextLine());

        // hola a todas

        //  y hola a todos
        // 28
        // false

        System.out.println();

        MyScanner ms5 = new MyScanner("hola a todas\n y hola a todos");
        System.out.println(ms5.getPos());
        System.out.println(ms5.hasNextLine());

        // 0
        // true

        System.out.println();

        MyScanner ms6 = new MyScanner("hola a todas\n y hola a todos");
        System.out.println(ms6.nextLine());
        System.out.println(ms6.nextLine());
        System.out.println(ms6.hasNextLine());

        // hola a todas
        //  y hola a todos
        // false

        System.out.println();

        MyScanner ms7 = new MyScanner("hola a todas\n y hola a todos");
        System.out.println(ms7.nextLine());
        System.out.println(ms7.getPos());
        System.out.println(ms7.getDatos());

        // hola a todas
        // 13
        // hola a todas
        // y hola a todos

        System.out.println();

        MyScanner ms8 = new MyScanner("hola a todos");
        while (ms8.hasNextLine()) {
            System.out.println(ms8.nextLine());
        }

        // hola a todos

        System.out.println();

        MyScanner ms9 = new MyScanner("hola a todas \ny también hola a todos");
        while (ms9.hasNextLine()) {
            System.out.println(ms9.nextLine());
        }

        // hola a todas
        // y también hola a todos

        System.out.println();

        MyScanner ms10 = new MyScanner("hola a todas \ny también hola a todos\n");
        while (ms10.hasNextLine()) {
            System.out.println(ms10.nextLine());
        }

        // hola a todas
        // y también hola a todos

        System.out.println();

        MyScanner ms11 = new MyScanner("hola a todas \n\ny también hola a todos\n");
        while (ms11.hasNextLine()) {
            System.out.println(ms11.nextLine());
        }

        // hola a todas

        // y también hola a todos

        System.out.println();

        MyScanner ms12 = new MyScanner("hola a todos");
        System.out.println(ms12.getPos());
        System.out.println(ms12.getDatos());

        // 0
        // hola a todos

        System.out.println();

        MyScanner ms12a = new MyScanner("hola a todos");
        System.out.println(ms12a.getPos());
        System.out.println(ms12a.next());
        System.out.println(ms12a.next());
        System.out.println(ms12a.getPos());

        // 0
        // hola
        // a
        // 6

        System.out.println();

        MyScanner ms13 = new MyScanner("2 3 4");
        int suma13 = 0;
        while (ms13.hasNext()) suma13 += ms13.nextInt();
        System.out.println(suma13);

        // 9

        System.out.println();
*/
        MyScanner ms14 = new MyScanner("2 \t3 \n4\n");
        int suma14 = 0;
        while (ms14.hasNext()) suma14 += ms14.nextInt();
        System.out.println(suma14);

        // 9

        System.out.println();

        MyScanner ms15 = new MyScanner("2 3 4\n\t");
        int suma15 = 0;
        while (ms15.hasNext()) suma15 += ms15.nextInt();
        System.out.println(suma15);

        // 9

        System.out.println();

        MyScanner ms16 = new MyScanner("2 \nmi mama me mima");
        System.out.println(ms16.nextInt());
        ms16.nextLine();//limpiar enter
        System.out.println(ms16.nextLine());
        // 2
        // mi mama me mima
    }

}
