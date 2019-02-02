package com.tyraka.server.controllers;

import com.tyraka.server.entities.Test;
import com.tyraka.server.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "tests", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Test> list(Model model) { return testService.listAllTests(); }

    @RequestMapping(value = "test", method = RequestMethod.POST)
    public ResponseEntity<Test> create(@RequestBody @Valid @NotNull Test test) {
        testService.saveTest(test);
        return ResponseEntity.ok().body(test);
    }

    @RequestMapping(value = "/test/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        testService.deleteTest(id);
        return new ResponseEntity<>((HttpStatus.OK));

    }
}
