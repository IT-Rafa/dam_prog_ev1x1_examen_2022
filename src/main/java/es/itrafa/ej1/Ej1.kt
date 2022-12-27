package es.itrafa.ej1

/**
 * Tres veces el diámetro y un poquito más ¡En kotlin!
 *
 * El 14 de marzo es el día internacional de PI.
 * Todos sabemos que pi vale 3,14… De ahí la elección del día como
 * marzo(mes 3) y día 14. Pero, ¿qué significado tiene realmente este número?
 *
 * Para que los niños entendieran lo que es pi, un magnífico y genial maestro,
 * un maestro de los de antes, explicaba a sus alumnos lo siguiente:
 *
 * PI es el número 3,141516… pero no lo veas  como un número extraño y caprichoso,
 * es un número que describe que la relación entre el perímetro de una circunferencia
 * cualquiera y su radio siempre es la misma. Da igual que la circunferencia sea enorme
 * o pequeñísima, si divides el perímetro de la circunferencia entre su diámetro siempre
 * obtendrás la misma cantidad: el número PI.
 *
 * Y explicaba de nuevo el maestro:
 *
 * Imagina que rodeas una tapa circular con un hilo o alambre.
 * Tienes una circunferencia de hilo. Mides su radio r, y, por lo tanto, sabes que su
 * diámetro es 2r. si esa circunferencia de hilo la cortas y a continuación la mides, estás
 * midiendo su perímetro, pues bien puedes observar que el perímetro va a ser 3 veces el
 * diámetro y un poquito más. Pruebas esto con muchas circunferencias y siempre ocurre lo
 * mismo, que el perímetro es “Tres veces el diámetro y un poquito más”
 *
 *
 * Perímetro
 *
 * —-------- = 3 y un poquito más
 *
 * diámetro
 *
 * El poquito más es 0,141516….  y no sabes el trabajo que le dio a matemáticos de todos
 * los tiempos  determinar cada vez con más precisión ese poquito más.
 *
 * Aprovechamos entonces las enseñanzas del sabio maestro y estipulamos el poquito más(pm)
 * de la siguiente forma:
 *
 * 0.1415<=pm<=0.1417
 *
 * y pretendemos saber si dados  dos números p>0 y d>0,  que representan respectivamente
 * al perímetro y al diámetro de una supuesta circunferencia, son valores que pertenecen realmente
 *
 * ENTRADA
 *
 * La entrada comienza con una línea indicando el número de casos que pueden ser 0 o más, a
 * continuación cada caso se específica en una línea con dos números separados por un espacio en
 * blanco. El primer número representa el perímetro y el segundo el diámetro.
 *
 * SALIDA
 *
 * La salida indicará para cada caso de entrada si p y d pertenecen a una circunferencia con la
 * frase ES CIRCUNFERENCIA, o en caso contrario con la frase PARECE UN HUEVO
 *
 * Para usar un compilador kotlin sigue las instrucciones del profesor, en principio puedes utilizar
 * el IntelliJ de tu equipo o bien usar el siguiente compilador en linea:
 * https://www.jdoodle.com/compile-kotlin-online/
 *
 * EJEMPLO DE ENTRADA/SALIDA
 *
 * Ten en cuenta: para obtener la máxima puntuación debes poder indicar en la misma línea, separados
 * por un espacio en blanco, el perímetro y el diámetro como en el ejemplo anterior.
 *
 * Recuerda también que quizá en tu equipo la introducción por teclado de números con decimales en
 * lugar de punto decimal requiera coma decimal.
 *
 * Para comprobar el código puedes utilizar IntelliJ. Si hubiera problemas con este IDE y con
 * la autorización del profesor podrías usar el siguiente IDE online
 *
 * https://www.jdoodle.com/compile-kotlin-online/
 *
 *  43.98 14
 *
 * - 0.1415 <= pm <= 0.1417
 * perimetro / diametro = PI
 *ma
 * nº caso
 * - Probar cos (0 o más)
 *     Por caso 1 línea: perímetro y diámetro
 *          Si p / d  +-= PI
 *              ES CIRCUNFERENCIA
 *          SI NO
 *              PARECE UN HUEVO
 *
 *
 * Círculo = figura geométrica.
 * Perímetro o longitud del círculo: La línea que limita con el exterior del círculo.
 * Centro del círculo = punto en el medio del círculo.
 * Radio del círculo = línea entre un punto de la circunferencia y el centro.
 * Diámetro = Línea formada por 2 puntos de la circunferencia, pasando por el radio.
 *
 * Círculo
 *  - diámetro:     5 cm  = radio *2
 *  - Radio:        2'5 cm radio = Diámetro / 2
 *  - Perímetro:    15,708 cm = PI X Diámetro = 3.1416 * 5
 *
 * Entrada:
 * 2
 * 15.708 5
 * 12 37.68

 */
fun main() {
    // Pedimos cant casos
    val casos = readln().toInt()

    // Por cada caso
    for (i in 0 until casos) {
        val line = readln()
        val data = line.split(" ")

        // perimetro
        val p = data[0].toDouble()
        // diametro
        val d = data[1].toDouble()

        val r = p / d

        if (r > 0.1415 || r < 0.1417) {
            println("ES CIRCUNFERENCIA")
        } else {
            println("PARECE UN HUEVO")
        }
    }
}