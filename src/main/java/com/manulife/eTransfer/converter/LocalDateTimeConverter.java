package com.manulife.eTransfer.converter;

import javax.persistence.AttributeConverter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Timestamp> {
//    @Override
//    public Date convertToDatabaseColumn(LocalDateTime attribute) {
//        Date date = new Date(java.util.Date.from(attribute.atZone(ZoneId.systemDefault()).toInstant()).getTime());
//        return date;
//    }
//
//    @Override
//    public LocalDateTime convertToEntityAttribute(Date dbData) {
//        return LocalDateTime.ofInstant(new java.util.Date(dbData.getTime()).toInstant(), ZoneId.systemDefault());
//    }

    @Override
    public Timestamp convertToDatabaseColumn(LocalDateTime attribute) {
        return Timestamp.valueOf(attribute);
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Timestamp dbData) {
        return dbData.toLocalDateTime();
    }
}
