import java.io.IOException;

public class UserInterface {

    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler();


        for (Covid19Data covid19DataList : fileHandler.loadData()){
            System.out.println("region: " + covid19DataList.getRegion());
            System.out.println("Bekræftede tilfælde: " + covid19DataList.getBekræftedeTilfælde());
            System.out.println("Døde: " + covid19DataList.getDøde());
            System.out.println("Indlagte på intensiv: " + covid19DataList.getIndlagtIntensiv());
            System.out.println("Indlagte : " + covid19DataList.getIndlagt());
            System.out.println("Dato : " + covid19DataList.getDato());
            System.out.println("----------------------");

        }


    }
}
