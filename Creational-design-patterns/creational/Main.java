package creational;

public class Main {

    public static void main(String[] args) throws Exception {

        // Expected usage => All should give the same result as above
        BookMetadataExporter bookExporter = new JSONBookMetadataExporter();
        bookExporter.add(TestData.sailboatBook);
        bookExporter.add(TestData.GoFBook);
        bookExporter.export(System.out);
    }
}





        // Current usage
        // BookMetadataFormatter formatter = null;
        // try {
        // formatter =
        // BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.JSON);
        // formatter.append(TestData.dragonBook);
        // formatter.append(TestData.dinosaurBook);
        // System.out.print(formatter.getMetadataString());
        // } catch (IOException e) {
        // e.printStackTrace();
        // } catch (ParserConfigurationException e) {
        // e.printStackTrace();
        // }