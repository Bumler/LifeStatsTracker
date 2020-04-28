package com.henryBulmer.lifeTracker.controller;

import com.henryBulmer.lifeTracker.entity.series.ISeries;
import com.henryBulmer.lifeTracker.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/series")
public class SeriesController {
    @Autowired
    private SeriesService seriesService;

    @GetMapping
    public Collection<ISeries> getAllSeries( ){ return seriesService.getAllSeries(); }

    @GetMapping( value = "/{id}")
    public ISeries getSeries(@PathVariable int id ){ return seriesService.getSeries( id ); }
}
