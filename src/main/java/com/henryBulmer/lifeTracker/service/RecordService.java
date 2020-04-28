package com.henryBulmer.lifeTracker.service;

import com.henryBulmer.lifeTracker.dao.RecordDao;
import com.henryBulmer.lifeTracker.entity.record.IRecord;
import com.henryBulmer.lifeTracker.entity.record.Record;
import com.henryBulmer.lifeTracker.entity.record.RecordMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;

@Service
public class RecordService {
    @Autowired
    private RecordDao recordDao;

    public Collection<Record> getAllRecords(){
        return this.recordDao.getAllRecords();
    }

    public Record getRecord( int id ){ return this.recordDao.getRecord( id ); }

    public Integer saveRecord( RecordMessage recMessage ) {
        Record rec = new Record( recMessage );

        if ( rec.getId() == null )
            return recordDao.addRecord( rec );
        else if ( recordDao.getRecord( rec.getId() ) != null ){
            recordDao.updateRecord( rec );
            return rec.getId();
        }

        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Invalid record id provided." );
    }
}
