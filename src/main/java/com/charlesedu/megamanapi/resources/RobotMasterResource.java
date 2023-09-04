package com.charlesedu.megamanapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charlesedu.megamanapi.entities.RobotMaster;
import com.charlesedu.megamanapi.services.RobotMasterService;

@RestController
@RequestMapping(value = "/robotmasters")
public class RobotMasterResource {
    
    @Autowired
    private RobotMasterService service;

    @GetMapping
    public ResponseEntity<List<RobotMaster>> findAll() {
        List<RobotMaster> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }
}
