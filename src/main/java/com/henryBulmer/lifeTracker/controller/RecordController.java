package com.henryBulmer.lifeTracker.controller;

import com.henryBulmer.lifeTracker.entity.Record;
import com.henryBulmer.lifeTracker.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/records")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @RequestMapping( method = RequestMethod.GET )
    public Collection<Record> getAllRecords(){
        return recordService.getAllRecords();
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.GET )
    public Record getRecordById(@PathVariable("id") int id ){
        return recordService.getRecord( id );
    }
}
