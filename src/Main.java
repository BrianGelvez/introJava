import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, java");

        String myString = "Antes tenia veinticinco";
        myString = "Mi primer String en java";

        final String myConstant = "Esto es una constante, en vez de declararse const se declara como final";
        System.out.println(myConstant);

        System.out.println(myString);

        int myInt = 7; //int y integer es lo mismo pero integer es una class por ende tiene mas
        myInt = myInt + 6;
        System.out.println(myInt - 2);

        Double myDouble = 6.5; //Double es para numeros decimales, ocupa 64bits
        System.out.println(myDouble);

        Float myFloat = 4.5f; //Float tiene menos presicion con los numeros decimales, ocupa 32bits
        System.out.println(myFloat);

        System.out.println("Aca tengo un string = " + myString + ", un numero decimal Double = " + myDouble + ", Un numero decimal Float = " + Double.valueOf(myFloat) + " y un numero entero = " + myInt); //suma de los dos numeros decimales sin imoportar el tipo de dato. El metodo valueOf tranforma mi float en double.

        Boolean myBoolean = true;
        myBoolean = true;
        System.out.println(myBoolean);


        myFloat = null; //null es un valor
        if (myFloat != null) {
            System.out.println(myFloat + 10);
            System.out.println("myFloat es distinto de nulo");
        } else {
            System.out.println("My float es nulo");
        }

        if (myInt == 11) {
            System.out.println("myInit = 11");
        } else if (myInt == 12) {
            System.out.println("myInit = 12");
        } else {
            System.out.println("El valor no es ni 11 ni 12");
        }

        List<String> myArray = new ArrayList(); //esta sintaxis se usa para inicializar una lista (parecido a array)
        //siguiente a la inicializacion del tipo de dato, entre <> va el tipo de datos que queremos almacenar en la lista
        myArray.add(myString);
//        myArray.add(myInt);
        myArray.add(Integer.toString(myInt)); //aca transformo el tipo de numero int a un string.
        System.out.println(myArray);

        Map<String, String> myMap = new HashMap(); //tipeo el Map para que reciba Strings
        myMap.put("String ", myString); //el metodo put se utiliza para agregar elementos en un mapa.
        myMap.put("int ", Integer.toString(myInt)); //aca tranformo myInit a String
        System.out.println(myMap);
        System.out.println(myMap.get("int ")); //el metodo get se utiliza para acceder a una clave (maneja el formato clave valor)

        for (int i = 0; i < myArray.size(); i++) { //la sintaxis del for es como en JavaScript, solo que usamos el metodo size() en vez de length para recorrer el array o lista.
            System.out.println(myArray.get(i));
        }

        Main myMain = new Main();
        myMain.miFunction(10, 10);

        System.out.println(myMain.miRest(10, 5));

    }

    public void miFunction(int myFirstNumber, int mySecondNumber) { //void no devuelve ningún valor.
        System.out.println(myFirstNumber + mySecondNumber);
    }

    public int miRest(int num1, int num2) {
        return num1 - num2;
    }
}