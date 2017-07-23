import java.io.IOException;
import java.util.List;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import edu.duke.FileResource;

public class Week3Countries {

	public static void main(String[] args) {
		Week3Countries w3c = new Week3Countries();
		try {
			w3c.tester();
			w3c.listExportersTwoProducts(CSVparser, exportItem1, exportItem2); //Need help with this please, don't understand how to set this up it seems.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Normal Termination.");
	}// end main

	private void tester() throws IOException {
		FileResource fr = new FileResource("exports/exports_small.csv");
		CSVParser parser = fr.getCSVParser();
		countryInfo(parser, "Germany");
	}// end tester

	private void countryInfo(CSVParser parser, String country) throws IOException {
		List<CSVRecord> records = parser.getRecords();
		for (CSVRecord csvRecord : records) {
			String countryName = csvRecord.get(0);
			boolean result = country.equalsIgnoreCase(countryName);
			if (!result) {

				System.out.println(csvRecord);
			}
		}
	}// end countryInfo
	
	public void listExportersTwoProducts(CSVParser parser, String exportItem1, String exportItem2) {
		FileResource fr = new FileResource("exports/exports_small.csv");
		parser = fr.getCSVParser();
	}// listExportersTwoProducts
	

}// end class
