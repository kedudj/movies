package pl.dudekjustyna.movielist.models;


import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "movies")
@Data
public class MovieEntity {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String author;
    @Column(name = "publication_year")
    private int year;
    @Column(name="movie_genre")
    private String movieGenre;
    @Column(name="brief_description")
    private String briefDescription;
    @Column(name = "long_description")
    @Lob
    private String longDescription;


    public MovieEntity(int id, String title, String movieGenre, String briefDescription) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.movieGenre = movieGenre;
        this.briefDescription = briefDescription;
        this.longDescription = longDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovieEntity)) return false;
        MovieEntity that = (MovieEntity) o;
        return getId() == that.getId() &&
                getYear() == that.getYear() &&
                Objects.equals(getTitle(), that.getTitle()) &&
                Objects.equals(getAuthor(), that.getAuthor()) &&
                Objects.equals(getMovieGenre(), that.getMovieGenre()) &&
                Objects.equals(getBriefDescription(), that.getBriefDescription()) &&
                Objects.equals(getLongDescription(), that.getLongDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getAuthor(), getYear(), getMovieGenre(), getBriefDescription(), getLongDescription());
    }
}
