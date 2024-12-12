// Class: ResearchPaper
package researches;

import java.util.List;

public class ResearchPaper {
    private String title;
    private String abstractText;
    private List<String> authors;
    private int publishedDate;
    private String journal;

    public ResearchPaper(String title, String abstractText, List<String> authors, int publishedDate, String journal) {
        this.title = title;
        this.abstractText = abstractText;
        this.authors = authors;
        this.publishedDate = publishedDate;
        this.journal = journal;
    }

    public void addAuthors(List<String> newAuthors) {
        authors.addAll(newAuthors);
    }

    public void publish() {
        System.out.println("Published in: " + journal + " on " + publishedDate);
    }
}
 // New Methods
    public boolean isPublished() {
        return publishedDate > 0;
    }

    public String getAbstractSnippet() {
        return abstractText.length() > 50 ? abstractText.substring(0, 50) + "..." : abstractText;
    }

    public void updateJournal(String newJournal) {
        this.journal = newJournal;
    }
}
