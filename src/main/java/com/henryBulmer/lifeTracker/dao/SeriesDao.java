package com.henryBulmer.lifeTracker.dao;

import com.henryBulmer.lifeTracker.entity.entry.EntryHeader;
import com.henryBulmer.lifeTracker.entity.entry.EntryTypes;
import com.henryBulmer.lifeTracker.entity.series.ISeries;
import com.henryBulmer.lifeTracker.entity.series.Series;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class SeriesDao {
    private static Map<Integer, ISeries> series;
    private static int nextId;

    static {
        series = new HashMap<Integer, ISeries>() {
            {
                put( 1, new Series(1, new ArrayList<EntryHeader>() {
                    {
                        add(new EntryHeader(1, "Miles Run", EntryTypes.NUMERICAL));
                        add(new EntryHeader(2, "Weight", EntryTypes.NUMERICAL));
                    }
                }, "Life"
                ));
                put(2, new Series(2, new ArrayList<EntryHeader>() {
                    {
                        add(new EntryHeader(3, "Champion", EntryTypes.TEXT));
                        add(new EntryHeader(4, "Lane", EntryTypes.TEXT));
                    }
                }, "League"
                ));
            }
        };

        nextId = series.size();
    }

    public Collection<ISeries> getAllSeries(){ return series.values(); }
    public ISeries getSeries( int id ){ return series.get( id ); }
}
