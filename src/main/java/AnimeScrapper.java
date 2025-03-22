import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class AnimeScrapper {

    public static void main(String[] args) throws IOException {
        String url = "https://myanimelist.net/topanime.php";

        Document document = Jsoup.connect(url).get();
        Elements animes = document.select(".ranking-list");

        System.out.println("==================================");
        System.out.println("Anime - Web Scrapper");
        for (Element an : animes) {
            String title = an.select("h3 > a").text();
            String score = an.select("td > div > span").text();

            System.out.println("Title: " + title);
            System.out.println("Score: " + score);
        }
        System.out.println("==================================");

    }
}
