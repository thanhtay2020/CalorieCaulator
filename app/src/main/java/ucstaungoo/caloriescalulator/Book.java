package ucstaungoo.caloriescalulator;

public class Book {
    private String Title;
    private String Category;
    private String Description;
    private int Thunbail;

    public Book() {
    }

    public Book(String title, String category, String description, int thunbail) {
        Title = title;
        Category = category;
        Description = description;
        Thunbail = thunbail;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getThunbail() {
        return Thunbail;
    }

    public void setThunbail(int thunbail) {
        Thunbail = thunbail;
    }
}
