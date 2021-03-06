package com.allstate.controllers;

import com.allstate.entities.Movie;
import com.allstate.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/movies")
public class MovieController {
    private MovieService service;

    @Autowired
    public void setService(MovieService service){
        this.service = service;
    }

    //post /movies
    @RequestMapping(value={"","/"}, method = RequestMethod.POST)
    public Movie create(@RequestBody Movie movie){
      return this.service.create(movie);
    };

    //put /movies/3
    public void update(){};

    //delete /movies/3
    public void delete(){};

    //get /movies
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Movie findById(@PathVariable int id){
        return this.service.findById(id);
    };
}
