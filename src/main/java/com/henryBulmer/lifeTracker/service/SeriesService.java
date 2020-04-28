package com.henryBulmer.lifeTracker.service;

import com.henryBulmer.lifeTracker.dao.SeriesDao;
import com.henryBulmer.lifeTracker.entity.series.ISeries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SeriesService {
    @Autowired
    private SeriesDao seriesDao;

    public Collection<ISeries> getAllSeries(){
        return seriesDao.getAllSeries();
    }

    public ISeries getSeries( int id ){
        return seriesDao.getSeries( id );
    }
}
