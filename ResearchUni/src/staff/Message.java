package staff;

public class Message {

    private Integer id;
    private String sender;
    private String recipient;
    private String messageContent;
    private boolean isRead; // Поле для статуса "Прочитано"
    private boolean isArchived; // Поле для статуса "В архиве"

    // Constructor
    public Message(Integer id, String sender, String recipient, String messageContent) {
        this.id = id;
        this.sender = sender;
        this.recipient = recipient;
        this.messageContent = messageContent;
        this.isRead = false; // По умолчанию сообщение не прочитано
        this.isArchived = false; // По умолчанию сообщение не в архиве
    }

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public boolean isRead() {
        return isRead;
    }

    public boolean isArchived() {
        return isArchived;
    }

    // Operations

    /**
     * Marks the message as read.
     */
    public void markAsRead() {
        if (!isRead) {
            isRead = true;
            System.out.println("Message marked as read.");
        } else {
            System.out.println("Message is already marked as read.");
        }
    }

    /**
     * Marks the message as unread.
     */
    public void markAsUnread() {
        if (isRead) {
            isRead = false;
            System.out.println("Message marked as unread.");
        } else {
            System.out.println("Message is already marked as unread.");
        }
    }

    /**
     * Archives the message.
     */
    public void archiveMessage() {
        if (!isArchived) {
            isArchived = true;
            System.out.println("Message archived.");
        } else {
            System.out.println("Message is already archived.");
        }
    }

    /**
     * Restores the message from the archive.
     */
    public void restoreFromArchive() {
        if (isArchived) {
            isArchived = false;
            System.out.println("Message restored from archive.");
        } else {
            System.out.println("Message is not archived.");
        }
    }

    /**
     * Returns a summary of the message details.
     */
    public String getMessageDetails() {
        return "Message Details:\n" +
                "ID: " + id + "\n" +
                "Sender: " + sender + "\n" +
                "Recipient: " + recipient + "\n" +
                "Content: " + messageContent + "\n" +
                "Status: " + (isRead ? "Read" : "Unread") + "\n" +
                "Archived: " + (isArchived ? "Yes" : "No");
    }
}