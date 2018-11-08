package com.manulife.eTransfer.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.manulife.eTransfer.domain.Natinality;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-06T16:44:34.407+08:00")

@Controller
public class NatinalityApiController implements NatinalityApi {

    private static final Logger log = LoggerFactory.getLogger(NatinalityApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public NatinalityApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addNatinality(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Natinality body) {
        System.out.println("add.....");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteNatinality(@ApiParam(value = "natinality id to delete",required=true) @PathVariable("id") Long id) {
        System.out.println(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Natinality> getNatinalityById(@ApiParam(value = "ID of pet to return",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Natinality>(objectMapper.readValue("{  \"nationalityChi\" : \"美國\",  \"nationalityCode\" : \"nationalityCode\",  \"nationalityEn\" : \"USA\",  \"name\" : \"doggie\",  \"SortOrder\" : 1,  \"id\" : 0}", Natinality.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Natinality>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Natinality>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateNatinality(@ApiParam(value = "Natinality object that needs to be added to the store" ,required=true )  @Valid @RequestBody Natinality body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
