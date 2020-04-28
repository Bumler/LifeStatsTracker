package com.henryBulmer.lifeTracker.controller;

import com.henryBulmer.lifeTracker.entity.record.IRecord;
import com.henryBulmer.lifeTracker.entity.record.Record;
import com.henryBulmer.lifeTracker.entity.record.RecordMessage;
import com.henryBulmer.lifeTracker.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/records")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @GetMapping
    public Collection<Record> getAllRecords(){
        return recordService.getAllRecords();
    }

    @GetMapping( value = "/{id}" )
    public Record getRecordById(@PathVariable("id") int id ){
        return recordService.getRecord( id );
    }

    @PostMapping
    public int saveRecord( @RequestBody RecordMessage rec ){
        return recordService.saveRecord( rec );
    }

    @GetMapping( value = "/series/{seriesId}" )
    public Collection<Record> getRecordsBySeries( @PathVariable("seriesId") int seriesId ){
        return recordService.getAllRecordsBySeries( seriesId );
    }
}
