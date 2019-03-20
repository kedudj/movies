package pl.dudekjustyna.movielist.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MovieService {


    @Autowired
    MovieRepository movieRepository;

    @Autowired
    JdbcTemplate template;


    public List<MovieEntity> findAll (){
        String sql = "SELECT * FROM `movies`";

        RowMapper<MovieEntity> rowMapper = new RowMapper<MovieEntity>() {
            @Override
            public MovieEntity mapRow(ResultSet resultSet, int i) throws SQLException {
                MovieEntity movie = new MovieEntity(resultSet.getInt("id"),
                        resultSet.getString("title"),
                        resultSet.getString("movie_genre"),
                        resultSet.getString("brief_description"));

                return  movie;

            }


        };
        return template.query(sql, rowMapper);



    }



}
