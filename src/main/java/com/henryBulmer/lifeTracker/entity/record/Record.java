package com.henryBulmer.lifeTracker.entity.record;

import com.henryBulmer.lifeTracker.entity.entry.RecordEntry;

import java.time.LocalDate;
import java.util.Collection;

public class Record implements IRecord {
    private Integer id;
    private Integer seriesId;
    private LocalDate kDate;
    private LocalDate eDate;
    private Collection<RecordEntry> entries;
    private String notes;

    public Record(int id, LocalDate kDate, LocalDate eDate, Collection<RecordEntry> entries, String notes, int seriesId ) {
        this.id = id;
        this.kDate = kDate;
        this.eDate = eDate;
        this.entries = entries;
        this.notes = notes;
        this.seriesId = seriesId;
    }

    public Record( IRecord rec ){
        this.id = rec.getId();
        this.eDate = rec.getEDate();
        this.entries = rec.getEntries();
        this.notes = rec.getNotes();

        this.kDate = LocalDate.now();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getKDate() {
        return kDate;
    }

    public void setKDate(LocalDate kDate) {
        this.kDate = kDate;
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


    public Integer getSeriesId() {
        return seriesId;
    }
}
