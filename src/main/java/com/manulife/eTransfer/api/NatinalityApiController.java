package com.manulife.eTransfer.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.manulife.eTransfer.domain.Natinality;
import com.manulife.eTransfer.entity.NationalityEntity;
import com.manulife.eTransfer.service.NationalityService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-06T16:44:34.407+08:00")

@Controller
public class NatinalityApiController implements NatinalityApi {

    @Autowired
    private NationalityService nationalityService;

    private static final Logger log = LoggerFactory.getLogger(NatinalityApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public NatinalityApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> addNatinality(@ApiParam(value = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody Natinality body) {
        System.out.println("add.....");
        NationalityEntity nationalityEntity = new NationalityEntity();
        BeanUtils.copyProperties(body, nationalityEntity);
        nationalityEntity.setCreateTime(LocalDateTime.now());
        return new ResponseEntity<Object>(nationalityService.add(Arrays.asList(nationalityEntity)), HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteNatinality(@ApiParam(value = "natinality id to delete", required = true) @PathVariable("id") Long id) {
        System.out.println(id);
        nationalityService.delete(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<NationalityEntity> getNatinalityById(@ApiParam(value = "ID of pet to return", required = true) @PathVariable("id") Long id) {
        return new ResponseEntity<NationalityEntity>(nationalityService.getById(id), HttpStatus.OK);
    }

    public ResponseEntity<Object> updateNatinality(@ApiParam(value = "Natinality object that needs to be added to the store", required = true) @Valid @RequestBody Natinality body) {
        NationalityEntity nationalityEntity = new NationalityEntity();
        BeanUtils.copyProperties(body, nationalityEntity);
        return new ResponseEntity<Object>(nationalityService.update(Arrays.asList(nationalityEntity)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Object> getNatinality() {
        return new ResponseEntity<>(nationalityService.getAll(), HttpStatus.OK);
    }
}
