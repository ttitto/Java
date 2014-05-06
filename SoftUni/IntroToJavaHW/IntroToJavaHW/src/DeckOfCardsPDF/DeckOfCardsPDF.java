package DeckOfCardsPDF;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeckOfCardsPDF {

    static String[] suits = new String[]{"\u2660", "\u2661", "\u2662", "\u2663"};
    static String[] cards = new String[]{"A", "K", "D", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
    static PdfPTable table = createTable();

    public static void main(String[] args) throws FileNotFoundException, DocumentException, IOException {
        printDeck();

        Document doc = createDocument("C:\\Users\\ttitto\\Desktop\\cards.pdf");
        doc.open();
        GeneratePdfPCells(suits, cards, table);
        doc.add(table);

        doc.close();

    }

    public static void printDeck() {

        for (String suit : suits) {
            for (String card : cards) {

                System.out.print(card);
                System.out.println(suit);
            }
        }
    }

    public static Document createDocument(String fileName) throws FileNotFoundException, DocumentException {

        Document pdfDoc = new Document();
        PdfWriter.getInstance(pdfDoc, new FileOutputStream(fileName));

        return pdfDoc;
    }

    public static void GeneratePdfPCells(String[] suits, String[] cards, PdfPTable tabl) throws DocumentException, IOException {

        for (String suit : suits) {
            for (String card : cards) {
                Phrase ph;
                if (suit == "\u2661" || suit == "\u2662") {

                    ph = new Phrase(card + suit, createFont(BaseColor.RED));
                } else {
                    ph = new Phrase(card + suit, createFont(BaseColor.BLACK));
                }

                PdfPCell cell = new PdfPCell(ph);
                cell.setBorderWidth(1);
                cell.setPadding(5);
                cell.setPaddingBottom(50);
                cell.setPaddingTop(50);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setVerticalAlignment(Element.ALIGN_CENTER);

                tabl.addCell(cell);
            }
        }
    }

    public static PdfPTable createTable() {
        PdfPTable tabl = new PdfPTable(4);
        try {
            tabl.setWidths(new float[]{95, 95, 95, 95});
        } catch (DocumentException ex) {
            Logger.getLogger(DeckOfCardsPDF.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tabl;
    }

    public static Font createFont(BaseColor clr) throws DocumentException, IOException {
        BaseFont bf = BaseFont.createFont("c:/windows/fonts/ARIALUNI.TTF", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        Font f = new Font(bf,12);
        f.setColor(clr);
        return f;
    }

}
