//Разное поведение объектов поддерживающих общий интерфейс в
//зависимости от их реальных типов

interface IPublication {
    public void printItem();
}

abstract class Publication implements IPublication{
    public int id;
    public String title;
    public String date;
    public String shortContent;
    public String content;
    public String preview;
    public String author;
    public String type;

    public abstract void printItem();

    Publication(
        int id,
        String title,
        String date,
        String shortContent,
        String content,
        String preview,
        String author,
        String type) {
            this.id = id;
            this.title = title;
            this.date = date;
            this.shortContent = shortContent;
            this.content = content;
            this.preview = preview;
            this.author = author;
            this.type = type;
    }
}

class NewsPublication extends Publication {
    NewsPublication(
        int id,
        String title,
        String date,
        String shortContent,
        String content,
        String preview,
        String author,
        String type
    ) {
        super(id, title, date, shortContent, content, preview, author,type);
    }

    public void printItem() {
        System.out.println("News: " + this.title);
        System.out.println("Date: " + this.date);
    }
}

class ArticlePublication extends Publication {
    ArticlePublication(
        int id,
        String title,
        String date,
        String shortContent,
        String content,
        String preview,
        String author,
        String type
    ) {
        super(id, title, date, shortContent, content, preview, author,type);
    }

    public void printItem() {
        System.out.println("Article: " + this.title);
        System.out.println("Author: " + this.author);
    }
}

class PhotoReportPublication extends Publication {
    PhotoReportPublication(
        int id,
        String title,
        String date,
        String shortContent,
        String content,
        String preview,
        String author,
        String type
    ) {
        super(id, title, date, shortContent, content, preview, author,type);
    }

    public void printItem() {
        System.out.println("Photo report: " + this.title);
        System.out.println("Description: " + this.preview);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Publication[] arr = {
            new NewsPublication(
                1,
                "news title",
                "news date",
                "news short content",
                "news content",
                "news preview",
                "news author",
                "news"
            ),
            new ArticlePublication(
                2,
                "article title",
                "article date",
                "article short content",
                "article content",
                "article preview",
                "article author",
                "article"
            ),
            new PhotoReportPublication(
                3,
                "photo report title",
                "photo report date",
                "photo report short content",
                "photo report content",
                "photo report preview",
                "photo report author",
                "photo report"
            )
        };

        for (int i = 0; i < 3; i++) {
            arr[i].printItem();
            System.out.println("\n");
        }
    }
}

/**
 * В методі main циклом перебирається масив об`єктів, що реалізують інтерфейс IPublication і викликається
 * метод printItem, що залежно від підкласу NewsPublication, ArticlePublication чи PhotoReportPublication
 * виводить в консоль: title - для всих підкласів, date - для NewsPublication,
 * author - для ArticlePublication, preview - для PhotoReportPublication.
 */