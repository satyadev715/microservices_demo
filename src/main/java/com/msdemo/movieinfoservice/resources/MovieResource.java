package com.msdemo.movieinfoservice.resources;

import com.msdemo.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {
    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId){
        return new Movie("123","Avengers: Endgame",
                "Its is a 2019 American superhero film based on the Marvel Comics superhero team the Avengers, " +
                        "produced by Marvel Studios ");
    }

}
