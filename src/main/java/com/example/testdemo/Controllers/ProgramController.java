package com.example.testdemo.Controllers;

import com.example.testdemo.DTOs.ProgramDto;
import com.example.testdemo.Models.Program;
import com.example.testdemo.Services.ProgramService;
import com.example.testdemo.Services.SelfProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/programs")
public class ProgramController {

    private ProgramService programService;

    @Autowired
    public ProgramController(ProgramService programService) {
        this.programService = programService;
    }

    @PostMapping()
    public Program saveProgram(@RequestBody Program program) {
        return programService.saveProgram(program);
    }
}
