package pl.dudekjustyna.movielist.movie_form;


import lombok.Data;

@Data
public class MovieForm {

    private String title;
    private String author;
    private int year;
    private String movieGenre;
    private String briefDescription;
    private String longDescription;
}


