package demo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Todo implements Serializable {

    @GenericGenerator(name = "id", strategy = "increment")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "id")
    @Column(columnDefinition = "int")
    @Id
    private Integer id;
    private String title;
    private String text;

    public Todo() {
    }

    public Todo(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public Todo(Integer id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}