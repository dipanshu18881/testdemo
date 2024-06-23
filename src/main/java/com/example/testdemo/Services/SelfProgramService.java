package com.example.testdemo.Services;

import com.example.testdemo.Models.Program;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("selfProgramService")
public class SelfProgramService implements ProgramService{
    @Override
    public Program saveProgram(Program program) {
        return program;
    }
}
