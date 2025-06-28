import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WebScraper {
    public static void main(String[] args) {
        try {
            // Connect to website and parse HTML
            Document doc = Jsoup.connect("https://example.com").get();

            // Select <h1> tags
            Elements titles = doc.select("h1");

            // Print each <h1> text
            System.out.println("Titles found:");
            titles.forEach(title -> System.out.println(title.text()));

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}

