package creational;

// modify this
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONArray jArray;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see
        // fit.

        jArray = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book book) {
        // Please implement this method. You may create additional methods as you see
        // fit.



        JSONObject jObject = new JSONObject();
        

        // put(Object, Object)
        jObject.put(Book.Metadata.ISBN.value, book.getISBN());
        jObject.put(Book.Metadata.TITLE.value, book.getTitle());
        jObject.put(Book.Metadata.PUBLISHER.value, book.getPublisher());




        JSONArray authorsArr = new JSONArray();
        for (String author : book.getAuthors()) {
            // add(Object)
            authorsArr.add(author);
        }


        jObject.put(Book.Metadata.AUTHORS.value, authorsArr);
        jArray.add(jObject);

        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see
        // fit.
        return jArray.toString();

    }
}