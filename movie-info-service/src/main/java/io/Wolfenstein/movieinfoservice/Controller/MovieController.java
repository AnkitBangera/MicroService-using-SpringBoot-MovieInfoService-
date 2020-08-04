package io.Wolfenstein.movieinfoservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.Wolfenstein.movieinfoservice.entity.Movie;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@GetMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId) {
		return new Movie(movieId, "John wick");
	}
}
