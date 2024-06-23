package com.example.testdemo.DTOs;

import com.example.testdemo.Models.Program;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProgramDto {
    private Long programId;
    private String type;

    public static ProgramDto from (Program program) {
        if(program == null) return null;

        ProgramDto programDto = new ProgramDto();
        programDto.programId = program.getId();
        programDto.type = program.getType();

        return programDto;
    }
}
