package es.itrafa.ej5;

/**
 * MyScanner
 *
 * Se trata de escribir una clase Java que llamaremos MyScanner, una versión sencilla
 * de la famosa clase Scanner del API java. 
 *
 * Nuestros objetos MyScanner sólo trabajan con los Strings introducidos en el constructor.
 * No trabaja con teclado, ni ficheros.  Los caracteres delimitadores que utiliza para
 * hacer su trabajo son los mismos que usa por defecto la clase Scanner: \n \t y ' ' . 
 *
 *  
 *
 * La clase MyScanner consta de dos atributos
 * class MyScanner {
 *     private int pos;
 *     private String datos;
 *     ......  resto de clase .......
 * }
 * La solución debe basarse en el recorrido y tratamiento del String datos, por descontado,
 * no se permite utilizar la clase Scanner en el interior de MyScanner para solucionar el
 * problema. . MyScanner es un escaner que avanza en su análisis de caracter en caracter
 * de forma que en el atributo datos se almacena el String sobre el que se produce el
 * escaneo y en pos se almacena la posición del siguiente caracter a procesar. 
 *  
 * MyScanner consta  de los siguientes métodos:
 *
 *     getPos().
 *          Devuelve el entero almacenado por el atributo pos.
 *     getDatos().
 *          Devuelve el String almacenado en Datos que es justamente el String que se indica
 *          al constructor. Este es un valor constante a lo largo de la vida del objeto. 
 *     hasNextLine().
 *          Devuelve true si quedan más caracteres por escanear que constituyan una línea .
 *          En caso contrario devuelve false. Si entre la posición actual del escaneo y el
 *          final del String hay al menos un  caracter siempre se va a poder devolver un
 *          String que se considera una línea, aunque sea el string vacío. 
 *     hasNext().
 *          Devuelve true si  queda algun token en los datos por analizar, es decir, si
 *          hay algun caracter no delimitador entre pos y datos.length(). En caso contrario
 *          devuelve false
 *     nextLine().
 *          Devuelve un String que se corresponde con  la línea leida.  Recuerda la
 *          posibilidad de que nextLine() devuelva el string vacío "" cuando se encuentra
 *          inmediatamente un \n.
 *     next().
 *          Devuelve un String que se corresponde con el  token leido. Token es un conjunto
 *          caracteres contiguos delimitador por un caracter delimitador que no se considera
 *          parte del token.
 *     nextInt().
 *          Devuelve un int que se corresponde con el  token leido. 
 *
 * Para poder pasar los test, previamente tienes que evitar los errores de compilación.
 * Si no declaras todos los métodos del enunciado, que son métodos usados por los test
 * se provocará un error de compilación sin llegar a comprobarse ni siquiera el primer test.
 * Por lo tanto lo primero que tienes que hacer es escribir un armazón de la clase indicando
 * los atributos y a continuación al menos los métodos indicados en el enunciado.
 * Para cada método tienes que declarar como mínimo el tipo de datos que devuelve y una
 * instrucción return devolviendo un valor de dicho tipo. Luego,  a medida  que avances
 * en la pregunta iras  esribiendo el código detallado de cada método. Por ejemplo, no sé
 * resolver el método next() o todavía no empecé a solucionarlo porque estoy con otras
 * partes de la pregunta, pero escribo
 *
 * String next(){
 *
 *     return "nolohice";//cualquier String
 *
 * }
 *
 * Ten encuenta, que el funcionamiento de next(), nextInt() y nextLine() es similar al de la
 * clase Scanner que se asume que conoces y entiendes.  Observa en los ejemplos,  que si
 * nextLine()  y next()  en su procesamiento de caracteres, llegan al final del string datos,
 * devuelve los caracteres correspondientes aun que no hubieran llegado  a un delimitador,.
 * Así es además como funcione el Scanner del API java. 
 *
 * Por ejemplo:
 * Test 	Resultado
 *
 * MyScanner ms=new MyScanner("hola a todas");
 * System.out.println(ms.getPos());
 * System.out.println(ms.getDatos());
 *
 *
 *
 * 0
 * hola a todas
 *
 * MyScanner ms=new MyScanner("hola a todas\n y hola a todos");
 * System.out.println(ms.getPos());
 * System.out.println(ms.getDatos());
 *
 *
 *
 * 0
 * hola a todas
 *  y hola a todos
 *
 * MyScanner ms=new MyScanner("");//String vacio
 * System.out.println(ms.getPos());
 * System.out.println(ms.hasNextLine());
 *
 *
 *
 * 0
 * false
 *
 * MyScanner ms=new MyScanner("hola a todos\ny adios");
 * ms.nextLine();
 * System.out.println(ms.getPos());
 * System.out.println(ms.getDatos());
 *
 *
 *
 * 13
 * hola a todos
 * y adios
 *
 * MyScanner ms=new MyScanner("hola a todas\n y hola a todos");
 * System.out.println(ms.nextLine());
 * System.out.println(ms.nextLine());
 * System.out.println(ms.getPos());
 * System.out.println(ms.hasNextLine());
 *
 *
 *
 * hola a todas
 *  y hola a todos
 * 28
 * false
 *
 * MyScanner ms=new MyScanner("hola a todas\n y hola a todos");
 * System.out.println(ms.getPos());
 * System.out.println(ms.hasNextLine());
 *
 *
 *
 * 0
 * true
 *
 * MyScanner ms=new MyScanner("hola a todas\n y hola a todos");
 * System.out.println(ms.nextLine());
 * System.out.println(ms.nextLine());
 * System.out.println(ms.hasNextLine());
 *
 *
 *
 * hola a todas
 *  y hola a todos
 * false
 *
 * MyScanner ms=new MyScanner("hola a todas\n y hola a todos");
 * System.out.println(ms.nextLine());
 * System.out.println(ms.getPos());
 * System.out.println(ms.getDatos());
 *
 *
 *
 * hola a todas
 * 13
 * hola a todas
 *  y hola a todos
 *
 *  MyScanner ms=new MyScanner("hola a todos");
 *  while(ms.hasNextLine()){
 *      System.out.println(ms.nextLine());
 *  }
 *
 *
 *
 * hola a todos
 *
 *  MyScanner ms=new MyScanner("hola a todas \ny también hola a todos");
 *  while(ms.hasNextLine()){
 *     System.out.println(ms.nextLine());
 *  }
 *
 *
 *
 * hola a todas
 * y también hola a todos
 *
 *  MyScanner ms=new MyScanner("hola a todas \ny también hola a todos\n");
 *  while(ms.hasNextLine()){
 *     System.out.println(ms.nextLine());
 *  }
 *
 *
 *
 * hola a todas
 * y también hola a todos
 *
 *  MyScanner ms=new MyScanner("hola a todas \n\ny también hola a todos\n");
 *  while(ms.hasNextLine()){
 *     System.out.println(ms.nextLine());
 *  }
 *
 *
 *
 * hola a todas
 *
 * y también hola a todos
 *
 * MyScanner ms=new MyScanner("hola a todos");
 * System.out.println(ms.getPos());
 * System.out.println(ms.getDatos());
 *
 *
 *
 * 0
 * hola a todos
 *
 * MyScanner ms=new MyScanner("hola a todos");
 * System.out.println(ms.getPos());
 * System.out.println(ms.next());
 * System.out.println(ms.next());
 * System.out.println(ms.getPos());
 *
 *
 *
 * 0
 * hola
 * a
 * 6
 *
 * MyScanner ms=new MyScanner("2 3 4");
 * int suma=0;
 * while(ms. hasNext()) suma+=ms.nextInt();
 * System.out.println(suma);
 *
 *
 *
 * 9
 *
 * MyScanner ms=new MyScanner("2 \t3 \n4\n");
 * int suma=0;
 * while(ms. hasNext()) suma+=ms.nextInt();
 * System.out.println(suma);
 *
 *
 *
 * 9
 *
 * MyScanner ms=new MyScanner("2 3 4\n\t");
 * int suma=0;
 * while(ms. hasNext()) suma+=ms.nextInt();
 * System.out.println(suma);
 *
 *
 *
 * 9
 *
 * MyScanner ms=new MyScanner("2 \nmi mama me mima");
 * System.out.println(ms.nextInt());
 * ms.nextLine();//limpiar enter
 * System.out.println(ms.nextLine());
 */
public class Ej5 {
}
