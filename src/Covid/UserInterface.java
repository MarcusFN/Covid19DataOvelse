package Covid;

import Covid.Covid19Data;
import Covid.FileHandler;
import comparatorer.AldersGruoppeComparator;
import comparatorer.RegionComparator;

import java.io.IOException;
import java.util.*;

public class UserInterface {


    public void menu() throws IOException {
        Scanner sc = new Scanner(System.in);
        FileHandler fileHandler = new FileHandler();
        ArrayList<Covid19Data> arrayList = fileHandler.loadData();

        Collections.sort(arrayList, new RegionComparator());
        System.out.println("--------------------\n" +
                "Menu: Covid 19 database!\n" +
                "--------------------\n" +
                "select number in menu:\n" +
                "1. Show covid19 data list\n" +
                "2. Sort data Region\n" +
                "3. Sort data Alders gruppe\n" +
                "4. Exit program");
        int userChoise = sc.nextInt();
        if (userChoise == 1) {
            Collections.sort(arrayList, new RegionComparator());
            for (Covid19Data covid19DataList : arrayList) {
                System.out.println("region: " + covid19DataList.getRegion() +
                        "\nBekræftede tilfælde: " + covid19DataList.getBekræftedeTilfælde() +
                        "\nDøde: " + covid19DataList.getDøde() +
                        "\nIndlagte på intensiv: " + covid19DataList.getIndlagtIntensiv() +
                        "\nIndlagte : " + covid19DataList.getIndlagt() +
                        "\nDato : " + covid19DataList.getDato() +
                        "\n----------------------");

            }

        } else if  (userChoise == 2) {
            Collections.sort(arrayList, new RegionComparator());
            for (Covid19Data covid19DataList : arrayList) {
                System.out.println("region: " + covid19DataList.getRegion() +
                        "\nBekræftede tilfælde: " + covid19DataList.getBekræftedeTilfælde() +
                        "\nDøde: " + covid19DataList.getDøde() +
                        "\nIndlagte på intensiv: " + covid19DataList.getIndlagtIntensiv() +
                        "\nIndlagte : " + covid19DataList.getIndlagt() +
                        "\nDato : " + covid19DataList.getDato() +
                        "\n----------------------");

            }

        } else if  (userChoise == 3){
            Collections.sort(arrayList, new RegionComparator());
            for (Covid19Data covid19DataList : arrayList) {
                System.out.println("region: " + covid19DataList.getRegion() +
                        "\nBekræftede tilfælde: " + covid19DataList.getBekræftedeTilfælde() +
                        "\nDøde: " + covid19DataList.getDøde() +
                        "\nIndlagte på intensiv: " + covid19DataList.getIndlagtIntensiv() +
                        "\nIndlagte : " + covid19DataList.getIndlagt() +
                        "\nDato : " + covid19DataList.getDato() +
                        "\n----------------------");

            }

        } else if  (userChoise == 3){
            Collections.sort(arrayList, new AldersGruoppeComparator());
            for (Covid19Data covid19DataList : arrayList) {
                System.out.println("region: " + covid19DataList.getRegion() +
                        "\nBekræftede tilfælde: " + covid19DataList.getBekræftedeTilfælde() +
                        "\nDøde: " + covid19DataList.getDøde() +
                        "\nIndlagte på intensiv: " + covid19DataList.getIndlagtIntensiv() +
                        "\nIndlagte : " + covid19DataList.getIndlagt() +
                        "\nDato : " + covid19DataList.getDato() +
                        "\n----------------------");

            }
        } else if (userChoise == 4){
            System.exit(0);


        }else {
            System.out.println("Wrong input");
            menu();
        }
        menu();

    }


    public static void main(String[] args) throws IOException {
    UserInterface UI = new UserInterface();
        UI.menu();





    }
}
