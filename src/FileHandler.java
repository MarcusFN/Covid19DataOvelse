import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public ArrayList<Covid19Data> loadData() throws IOException {
        Scanner reader = new Scanner(new File("data/11_noegletal_pr_region_pr_aldersgruppe.csv"), StandardCharsets.ISO_8859_1);
        ArrayList<Covid19Data> covid19DataArrayList = new ArrayList<>();

        while (reader.hasNextLine()) {
            String line = reader.nextLine();

            covid19DataArrayList.add(parseCVSLine(line));

        }

        return covid19DataArrayList;
    }

    private Covid19Data parseCVSLine(String line) throws IOException {
        String[] parts = line.split(";");

        Covid19Data covid19Data = new Covid19Data();

        covid19Data.setRegion(parts[0]);
        covid19Data.setAldersgruppe(parts[1]);
        covid19Data.setBekræftedeTilfælde(Integer.parseInt(parts[2]));
        covid19Data.setDøde(Integer.parseInt(parts[3]));
        covid19Data.setIndlagtIntensiv(Integer.parseInt(parts[4]));
        covid19Data.setIndlagt(Integer.parseInt(parts[5]));
        covid19Data.setDato(parts[6]);

        return covid19Data;

    }


}
