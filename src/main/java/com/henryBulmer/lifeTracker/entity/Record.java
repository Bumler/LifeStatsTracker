package com.henryBulmer.lifeTracker.entity;

import com.henryBulmer.lifeTracker.entity.entries.RecordEntry;

import java.time.LocalDate;
import java.util.Collection;

public class Record {
    private int id;
    private LocalDate kDate;
    private LocalDate eDate;
    private Collection<RecordEntry> entries;
    private String notes; //may need to be a notes object

    public Record(int id, LocalDate kDate, LocalDate eDate, Collection<RecordEntry> entries, String notes) {
        this.id = id;
        this.kDate = kDate;
        this.eDate = eDate;
        this.entries = entries;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public void setEDate(LocalDate eDate) {
        this.eDate = eDate;
    }

    public Collection<RecordEntry> getEntries() {
        return entries;
    }

    public void setEntries(Collection<RecordEntry> entries) {
        this.entries = entries;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
