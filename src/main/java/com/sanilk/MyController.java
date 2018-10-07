package com.sanilk;

import flexjson.JSONSerializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/users", method = RequestMethod.POST)
public class MyController {

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<String> handleJson(@RequestBody Contact c) {
        System.out.println(c);
        return new ResponseEntity<String>(new JSONSerializer().serialize(c), HttpStatus.OK);
    }

//    @RequestMapping(method = RequestMethod.GET, consumes = "application/json")
//    public void handleGet() {
//        System.out.println("a");
//    }
}
