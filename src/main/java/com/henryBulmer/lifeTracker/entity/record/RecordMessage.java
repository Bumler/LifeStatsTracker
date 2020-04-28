package com.henryBulmer.lifeTracker.entity.record;

import com.henryBulmer.lifeTracker.entity.entry.RecordEntry;

import java.time.LocalDate;
import java.util.Collection;

public class RecordMessage implements IRecord {
    private Integer id;
    private LocalDate eDate;
    private Collection<RecordEntry> entries;
    private String notes;
    private Integer seriesId;

    public RecordMessage(Integer id, LocalDate eDate, Collection<RecordEntry> entries, String notes, Integer seriesId ) {
        this.id = id;
        this.eDate = eDate;
        this.entries = entries;
        this.notes = notes;
        this.seriesId = seriesId;
    }

    public LocalDate getEDate() {
        return eDate;
    }

    public Collection<RecordEntry> getEntries() {
        return entries;
    }

    public String getNotes() {
        return notes;
    }

    public Integer getId() {
        return id;
    }

    public Integer getSeriesId() { return seriesId; }
}
