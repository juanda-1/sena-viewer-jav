package senviewer.model;

public class Serie extends Film {

    private int timeViewed;
    private int sessionQuantity;

    public Serie(String title, String genre, int duration) {
        super(title, genre, null, duration); // creator se podrá definir luego con setter
    }

    public int getTimeViewed() { return timeViewed; }
    public void setTimeViewed(int timeViewed) { this.timeViewed = timeViewed; }

    public int getSessionQuantity() { return sessionQuantity; }
    public void setSessionQuantity(int sessionQuantity) { this.sessionQuantity = sessionQuantity; }

    @Override
    public String toString() {
        return "Serie{" +
                "title='" + getTitle() + '\'' +
                ", genre='" + getGenre() + '\'' +
                ", creator='" + getCreator() + '\'' +
                ", duration=" + getDuration() +
                ", year=" + getYear() +
                ", viewed=" + isViewed() +
                ", timeViewed=" + timeViewed +
                ", sessionQuantity=" + sessionQuantity +
                '}';
    }
}
