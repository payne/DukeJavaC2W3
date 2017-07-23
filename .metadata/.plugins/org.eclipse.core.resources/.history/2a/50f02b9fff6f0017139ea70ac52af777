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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Normal Termination.");
	}

	private void tester() throws IOException {
		FileResource fr = new FileResource("exports/exports_small.csv");
		CSVParser parser = fr.getCSVParser();
		countryInfo(parser, "Germany");
	}

	private void countryInfo(CSVParser parser, String country) throws IOException {
		List<CSVRecord> records = parser.getRecords();
		for (CSVRecord csvRecord : records) {
			String countryName = csvRecord.get(0);
			boolean result = country.equalsIgnoreCase(countryName);
			if (!result) {

				System.out.println(csvRecord);
			}
		}
	}

}
