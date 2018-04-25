package age.perinatalproject;

public class ChatMessageGroup {
    private long id;
    private boolean isMe;
    private String message;
    private Long userId;
    private String dateTime;
    private int imageUser;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public boolean getIsme() {
        return isMe;
    }
    public void setMe(boolean isMe) {
        this.isMe = isMe;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDate() {
        return dateTime;
    }

    public void setDate(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getImageUser() {
        return imageUser;
    }

    public void setImageUser(int newImag) {
        this.imageUser = newImag;
    }
}
