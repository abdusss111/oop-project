package staff;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class News {

    private String newsTitle;
    private String newsContent;
    private LocalDateTime creationDate; // Используем современный API даты/времени
    private String category;
    private boolean isPublished; // Поле для отслеживания публикации
    private static final Set<News> newsList = new HashSet<>(); // Статический список новостей

    // Constructor
    public News(String newsTitle, String newsContent, String category) {
        this.newsTitle = newsTitle;
        this.newsContent = newsContent;
        this.creationDate = LocalDateTime.now();
        this.category = category;
        this.isPublished = false; // По умолчанию новость не опубликована
    }

    // Getters and setters

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public static Set<News> getNewsList() {
        return newsList;
    }

    // Operations

    /**
     * Publishes the news.
     */
    public void publish() {
        if (!isPublished) {
            isPublished = true;
            newsList.add(this);
            System.out.println("News published: " + newsTitle);
        } else {
            System.out.println("News is already published.");
        }
    }

    /**
     * Unpublishes the news.
     */
    public void unpublish() {
        if (isPublished) {
            isPublished = false;
            newsList.remove(this);
            System.out.println("News unpublished: " + newsTitle);
        } else {
            System.out.println("News is not published.");
        }
    }

    /**
     * Updates the content of the news.
     */
    public void updateContent(String newContent) {
        this.newsContent = newContent;
        System.out.println("News content updated.");
    }

    /**
     * Updates the title of the news.
     */
    public void updateTitle(String newTitle) {
        this.newsTitle = newTitle;
        System.out.println("News title updated.");
    }

    /**
     * Updates the category of the news.
     */
    public void updateCategory(String newCategory) {
        this.category = newCategory;
        System.out.println("News category updated.");
    }

    /**
     * Returns the details of the news.
     */
    public String getNewsDetails() {
        return "News Details:\n" +
                "Title: " + newsTitle + "\n" +
                "Content: " + newsContent + "\n" +
                "Category: " + category + "\n" +
                "Creation Date: " + creationDate + "\n" +
                "Published: " + (isPublished ? "Yes" : "No");
    }
}

