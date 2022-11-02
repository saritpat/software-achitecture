package creational;



// implement this
import java.io.PrintStream;




public abstract class BookMetadataExporter extends BookCollection {

    public abstract BookMetadataFormatter create_book() throws Exception;

    public void export(PrintStream stream) throws Exception {
        // Please implement this method. You may create additional methods as you see
        // fit.

        BookMetadataFormatter bookFormatter = create_book();
        for (Book addBook : books) {
            bookFormatter.append(addBook);
        }
        System.out.print(bookFormatter.getMetadataString());
    }



}