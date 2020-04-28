package com.henryBulmer.lifeTracker.entity.series;

import com.henryBulmer.lifeTracker.entity.entry.EntryHeader;

import java.util.Collection;

public class Series implements ISeries {
    Integer id;
    Collection<EntryHeader> entries;
    String name;

    public Series(Integer id, Collection<EntryHeader> entries, String name) {
        this.id = id;
        this.entries = entries;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Collection<EntryHeader> getEntries() {
        return entries;
    }

    public String getName() {
        return name;
    }
}
