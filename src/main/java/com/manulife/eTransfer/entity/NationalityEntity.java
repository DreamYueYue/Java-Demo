package com.manulife.eTransfer.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.manulife.eTransfer.converter.LocalDateTimeConverter;
import com.manulife.eTransfer.serializer.LocalDateTimeSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "nationality")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NationalityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nationality_code", columnDefinition = "varchar(64)")
    private String nationalityCode;

    @Column(name = "name", columnDefinition = "varchar(64)")
    private String name;

    @Column(name = "nationality_en", columnDefinition = "varchar(64)")
    private String nationalityEn;

    @Column(name = "nationality_chi", columnDefinition = "varchar(64)")
    private String nationalityChi;

    @Column(name = "sort_order", columnDefinition = "varchar(2)")
    private Integer sortOrder;

    @Convert(converter = LocalDateTimeConverter.class)
    @Column(name = "create_time", columnDefinition = "DATE")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime createTime;
}
