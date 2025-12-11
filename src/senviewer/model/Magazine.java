package senviewer.model;

public class Magazine extends Publication {

    private int id;

    public Magazine(String title, String edititionDate, String editorial) {
        super(title, edititionDate, editorial);
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + id +
                ", title='" + getTitle() + '\'' +
                ", edititionDate='" + getEdititionDate() + '\'' +
                ", editorial='" + getEditorial() + '\'' +
                ", authors=" + getAuthors() +
                '}';
    }
}
