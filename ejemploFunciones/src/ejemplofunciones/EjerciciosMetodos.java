package ejemplofunciones;

import java.util.Scanner;

public class EjerciciosMetodos {

    public static Scanner datos = new Scanner(System.in);

    //EJERCICIO 1
    public static int[] crearArray() {
        System.out.println("Introduce el tamaño de tu array");
        int tamArray = datos.nextInt();
        int miArray[] = new int[tamArray];
        System.out.println("Ahora introduce tus datos");
        for (int i = 0; i < miArray.length; i++) {
            int numArray = datos.nextInt();
            miArray[i] = numArray;
        }
        return miArray;
    }

    //EJERCICIO 2
    public static int sumaArray(int[] array1) {
        int sumaTotal = 0;
        for (int i = 0; i < array1.length; i++) {
            sumaTotal = sumaTotal + array1[i];
        }
        return sumaTotal;
    }

    //EJERCICIO 3
    public static int mayorEnArray(int[] array1) {
        int numMayor = 0;
        for (int i = 0; i < array1.length; i++) {
            if (numMayor < array1[i]) {
                numMayor = array1[i];
            }
        }
        return numMayor;
    }

    //EJERCICIO 4
    public static int sumaPares(int[] array1) {
        int sumaTotal = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                sumaTotal = array1[i] + sumaTotal;
            }
        }
        return sumaTotal;
    }

    //EJERCICIO 5
    public static int factorial(int numFactorial) {
        int factorial = 0;

        return factorial;
    }

    public static String inviertePalabras() {
        String original = datos.nextLine();
        String cambio = " ";
        String[] lasPalabras = original.split(" ");
        //For anidados,es posible utilizar dentro de un for otros bucles
        //pueden ser de diferente tipo for/while/do-while, se pueden
        //tanto s bucles como deseemos,normalmente por cada ejecucion
        //bucle 1 tendremos todas las ejecuciones del siguiente y asi sucesivamente
        //Mi primer bucle se dedicara a recorrer el array de Strigns
        //pero dentro de cada posicion de ese array tengo una palabra
        //necesito recorrerla de final a principio y uso un bucle para ello
        for (int i = 0; i < lasPalabras.length; i++) {
            //Voy a recorriendo las palabras,para cada palabra debo
            //recorrer sus caracteres
            for (int j = lasPalabras[i].length() - 1; j >= 0; j--) {
                cambio = cambio + lasPalabras[i].charAt(j);
            }
            if (i != lasPalabras.length - 1) {
            }
        }
        return cambio;
    }

    public static String cortaCadenas() {
        System.out.println("Introduce tu cadena");
        String laCadena = datos.nextLine();
        int tamArray = 0;
        boolean intro = false;
        String espacio=" ";
        /*do {
            if (laCadena.equalsIgnoreCase("") || laCadena.equalsIgnoreCase(" ")) {
                
            } else {
                tamArray++;
                intro=true;
                for (int i = 0; i < laCadena.length(); i++) {
                    if (laCadena.charAt(i) == ' ') {
                        tamArray++;
                    }
                }
            }
        } while (intro = false);*/
        String cortador=datos.next();
        for (int i = 0; i < laCadena.length(); i++) {
            if (laCadena.equalsIgnoreCase(cortador)) {
                laCadena.charAt(i);
            }
        }
        return laCadena;
    }

    public static void main(String[] args) {
        /*int[] array1 = crearArray();
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Posicion " + i + " valor:" + array1[i]);
        }
        //
        int[] array2 = crearArray();
        int sumaTotal = sumaArray(array2);
        System.out.println(sumaTotal);
        //
        int[] array3 = crearArray();
        int numMayor=mayorEnArray(array3);
        System.out.println(numMayor);
        //
        int[] array4 = crearArray();
        int sumaTotal2=sumaPares(array4);
        System.out.println(sumaTotal2);
        //*/
        System.out.println(cortaCadenas());
    }

}
