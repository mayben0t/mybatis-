package bean;

import java.util.List;

public class User {
    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    private Integer id;
    private String name;

    private List<Book> bookList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
