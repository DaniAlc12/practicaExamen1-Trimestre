package ejemplofunciones;

import java.util.Scanner;

public class EjemploFunciones {

    //Para hacer una funcion o metodo hay que declararlo primero,por ahora
    //hay cosas que no podeis comprender.
    //SINTAXIS: public static tipoDeRetorno 
    //nombreFuncion(parametro1,parametro2,etc...){
    //CODIGO QUE EJECUTARA LA FUNCION}
    //no podemos declarar funciones dentro del main
    public static void cuentaNumeros() {
        System.out.println("Vamos a contar del 1 al 10");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    //Vamos a hacer una funcion con valor de retorno
    public static int hacerSuma() {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce el sumando 1");
        int sum1 = datos.nextInt();
        System.out.println("Introduce el sumando 2");
        int sum2 = datos.nextInt();
        int suma=sum1+sum2;
        //Una vex que ya tengo lo que quiero devolver,lo devuelvo
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Vamos a invocar una funcion que cuente del 1 al 10");
        //Para llamar a una funcion debemos escribir su nombre
        //y pasarle los parametros que necesite,si la funcion
        //tuviese un retorno deberiamos guardarla en una variable
        //o mostrarla por pantalla
        //cuentaNumeros();
        //System.out.println("Hemos salido de la funcion");
        //Para ejecutar la suma debo llamarla,si quiero guardar el resultado
        //de la suma en una variable
        int laSuma=hacerSuma();
        System.out.println("El resultado de la suma es de " + laSuma);
        //Otra opcion es,sino quiero guardar ese resultado
        //en una variable,debo sacarla 
        
        
        //CASTING VALORES EN JAVA
        //Es forzar a una variable que adopte otra naturaleza,siempre
        //y cuando sea compatible
        char car='u';
        System.out.println(car);
        //Si quiero que este char se comporte como un entero debo
        //castear,eso implica poner delante de la variable entre parentesis el
        //dato al que uiqero castear (nuevoTipo)nombreVariable
        //LOS TIPOS DE DATOS DEBEN SER COMPATIBLES
        System.out.println((int)car);
    }

}
