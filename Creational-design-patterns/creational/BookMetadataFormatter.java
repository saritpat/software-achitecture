package creational;

// do not modify
public interface BookMetadataFormatter {
    BookMetadataFormatter reset();

    BookMetadataFormatter append(Book addbook);

    String getMetadataString();
}