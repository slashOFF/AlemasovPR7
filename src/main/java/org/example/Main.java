package org.example;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        String link = "https://ru.lipsum.com/";
        try
        {
            Document doc = Jsoup.connect(link).get();
            Elements les = doc.select("div");
            for (Element element: les)
                System.out.println(element.text());
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}