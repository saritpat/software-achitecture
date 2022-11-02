package creational;




import java.io.IOException;



public class CSVBookMetadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter create_book() throws IOException {
        return new CSVBookMetadataFormatter();
    }

}