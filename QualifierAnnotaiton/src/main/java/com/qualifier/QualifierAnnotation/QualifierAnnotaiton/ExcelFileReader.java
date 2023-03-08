package com.qualifier.QualifierAnnotation.QualifierAnnotaiton;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("EXCEL")
public class ExcelFileReader implements Reader{
    @Override
    public String readFile() {
        return "EXCEL File";
    }
}
