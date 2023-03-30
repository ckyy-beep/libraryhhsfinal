import com.libraryhhs.item.Book;
import com.libraryhhs.item.CD;
import com.libraryhhs.item.DVD;
import com.libraryhhs.library.ExcelReader;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyExcelReaderTest {

    @Test
    public void testReadExcelFileBook() {
        // Arrange
        String fileName = "resources/Library.xlsx";
        String sheetName = "Sheet1";
        ArrayList<Book> books = new ArrayList<>();
        ExcelReader excelReader = new ExcelReader();

        // Act
        excelReader.readExcelFile(fileName, sheetName, books);

        // Assert
        assertEquals("To Kill a Mockingbird", books.get(0).getTitle());
        assertEquals("", books.get(0).getSubtitle());
        assertEquals("9780446310789", books.get(0).getIsbn());
        assertEquals("Grand Central Publishing", books.get(0).getPublisher());
        assertEquals("10", books.get(0).getPublicationMonth());
        assertEquals("11", books.get(0).getPublicationDay());
        assertEquals("1988", books.get(0).getPublicationYear());
        assertEquals("Fiction", books.get(0).getGenre());
        assertEquals(8, books.get(0).getInventory());
    }

    @Test
    public void testReadExcelFileCd() {
        // Arrange
        String fileName = "resources/Library.xlsx";
        String sheetName = "cd";
        ArrayList<CD> cds = new ArrayList<>();
        ExcelReader excelReader = new ExcelReader();

        // Act
        excelReader.readExcelFileCd(fileName, sheetName, cds);

        // Assert
        assertEquals("Limited Edition Picture Disc CD Rare Collectible Music Display", cds.get(0).getTitle());
        assertEquals("Miley Cyrus", cds.get(0).getArtist());
        assertEquals(8, cds.get(0).getNumTracks());
        assertEquals("2019", cds.get(0).getPublicationYear());
    }

    @Test
    public void testReadExcelFileDvd() {
        // Arrange
        String fileName = "resources/Library.xlsx";
        String sheetName = "dvd";
        ArrayList<DVD> dvds = new ArrayList<>();
        ExcelReader excelReader = new ExcelReader();

        // Act
        excelReader.readExcelFileDvd(fileName, sheetName, dvds);

        // Assert
        assertEquals("American Psycho", dvds.get(1).getTitle());
        assertEquals("Mary harron", dvds.get(1).getDirector());
        assertEquals("R", dvds.get(1).getRating());
    }

}
