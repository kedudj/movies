package pl.dudekjustyna.movielist.models;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository <MovieEntity, String>

{

@Query(nativeQuery = true, value="SELECT title, movie_genre, brief_description FROM `movies`")
    List<MovieEntity> movieHomeWebsite ();

@Query(nativeQuery = true, value = "SELECT * FROM `movies`")
    List<MovieEntity> movieSpec ();




}
