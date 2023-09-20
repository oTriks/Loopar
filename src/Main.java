import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*   DEL 1
// for loopar , while loopar
        // for ( fält (vad man har i början(0) , fält (villkor för att loopen ska göras eller avslutas, fält (saker som sker varje varv ska den ökas till exempel)
        for (int i = 1; i <= 10; i++) {
            System.out.println("Välkommen till en loop");
        }
        */
// == (lika mycket som)  =( ett = tecken betyder att den har värdet av)


/*
        //    DEL 2,   gör en multiplikationstabell
        Scanner sc = new Scanner(System.in);
 System.out.println("Välj en multiplikationstabell");
 // välj inte fö rkorta namn, välj namn som verkligen beskriver det, börja alltid med liten bokstav i Java
 int choosenNumber = sc.nextInt();

 // lägg till forloope , gjorde efter jag gjort System.out.println("answer");
        for(int i = 0; i <= 10; i++ ) {
            int answer = i * choosenNumber;
         //   System.out.println(answer); // kan skrivas ut finare  ( 1 * 3 = 3 )
            System.out.println(i +  "*" + choosenNumber + "=" + answer);
        }
// måsvingar indenterar koden ( skjuts in )
*/

        /*
        // DEL 3
        // while(fält (finns bara villkoret)  for loopen passar bra när man vet hur många gånger man ska göra loopen
        // while loopen är bra när man inte vet hur många gånger något ska upprepas, till exempel om man frågar användaren om man vill göra en annan multiplikationstabell
        Scanner sc = new Scanner(System.in);
        String again = "j";

        // funkar inte i java med dubbla elikamedtecken för att jämföra en sträng while( again == "j" ) {
        while (again.equals("j")) {
            System.out.println("Välj en multiplikationstabell");
            int choosenNumber = sc.nextInt();
            // från rad 51 ( sista i del 3)
            sc.nextLine();

            for (int i = 0; i <= 10; i++) {
                int answer = i * choosenNumber;
                System.out.println(i + "*" + choosenNumber + "=" + answer);
            }

// nu körs den hur många gånger som helst
        System.out.println("Vill du se en tabell till? (j/n)");
        again = sc.nextLine();  // nextLine användes för att läsa in en hel rad (sträng)
        // nu avslutades loopen innan man fick chansen att svara, pga hur scannern fungerar, lägger in   sifforna i en buffert , första tas bort efter första loopen så bara enter finns kvar som körs igen som "again" , då blir första while loopen endast enter dvs inte "j", enkelt löses med att göra en "sc.nextLine();" efter en sc.nextInt() använts för att rensa bufferten
        }
*/

        // DEL 4, sista alternativet, vänds på (villkoret på slutet istället)
        Scanner sc = new Scanner(System.in);
        String again;

        do {
            System.out.println("Välj en multiplikationstabell");
            int choosenNumber = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i <= 10; i++) {
                int answer = i * choosenNumber;
                System.out.println(i + "*" + choosenNumber + "=" + answer);
            }

            System.out.println("Vill du se en tabell till? (j/n)");
            again = sc.nextLine();

        } while (again.equals("j"));
    }
}