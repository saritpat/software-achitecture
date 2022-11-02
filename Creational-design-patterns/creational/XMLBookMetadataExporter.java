package creational;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter {


    
    @Override
    public BookMetadataFormatter create_book() throws ParserConfigurationException, IOException {
        return new XMLBookMetadataFormatter();
    }

}
