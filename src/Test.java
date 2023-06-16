//-Define a testing class with a main() method where you:
// -Create a not mutable List of strings called cityNames using asList() that you populate with 3 city names
// -Try to add a 4th city name at the end of the List -If you get an exception, try to understand why and eventually comment the faulty code
// -Try to change the 2nd item of the array, entering the value Tegucigalpa print the content of cityNames
// -Define a mutable empty List of strings called kingsOfRome
// -Insert the names of the 7 kings of Rome into the mutable list -Print the content of kingsOfRome
// -Convert kingsOfRome into an array called kingsOfRomeArray, using new String[0] to determine the type of the array
// -.Change the value of the 7th king in kingsOfRomeArray with the value Lucius Tarquinius Supercar
//        Print the content of kingsOfRomeArray

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        String[] arrayCityNames = {"Roma", "Milano", "Genova"};

        List<String> cityNames = Arrays.asList(arrayCityNames);
        //cityNames.add("Palermo"); Non si può aggiungere una nuova città alla fine dell'array perché asList ritorna un array con una lunghezza fissa.
        //Infatti con asList creo una immutable List.

        cityNames.set(1, "Tegucigalpa");

        System.out.println("Nomi di città:");

        for(String city : cityNames){
            System.out.println(city);
        }

        System.out.println("\nNomi dei re di Roma dentro alla List:");

        List<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Lucio Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Lucio Tarquinio Superbo");

        for(String king : kingsOfRome) {
            System.out.println(king);
        }

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        System.out.println("\nNomi dei re di Roma dentro all'array:");

        for(String kingInArray : kingsOfRomeArray) {
            System.out.println(kingInArray);
        }
    }
}