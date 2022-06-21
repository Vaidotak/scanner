import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //todo Scanner naudojimas

        Country valstybe = new Country();
        System.out.println("Įveskite pavadinimą: ");
        valstybe.setPavadinimas(scanner.next());
        System.out.println("Įveskite gyventojų skaičių: ");
        valstybe.setGyventojuSkaicius(scanner.nextFloat());
        System.out.println("Įveskite plotą: ");
        valstybe.setPlotas(scanner.nextDouble());

        Country latvija = new Country();
        latvija.setPavadinimas("Latvija");
        latvija.setGyventojuSkaicius(2500000F);
        latvija.setPlotas(2085474.47);
        scanner.close();
        System.out.println(valstybe.getPlotas() / valstybe.getGyventojuSkaicius());
        System.out.println(valstybe.getDalybosVeiksmas());

        String latviai = latvija.getPavadinimas();
        System.out.println(latviai);

        System.out.println(latviai.substring(0, 4).concat("iai")); //todo vietoje + naudoti concat()!
        String latviai1 = latviai.substring(0, 4).concat("iai");
        System.out.println(latviai1.toUpperCase());
        String latviai2 = latviai1.toUpperCase();
        System.out.println(latviai2.substring(0, 2));
        String latviai3 = latviai2.substring(0, 2);
        System.out.println(latviai3.concat("la"));
        String latviai4 = latviai3 + latviai3.toLowerCase();
        System.out.println(latviai4.replace("l", "t"));
        String latviai5 = latviai4.replace("l", "t");
        System.out.println(latviai5.indexOf("t"));


        //System.out.println(namas.substring(2, 4));

    }
}