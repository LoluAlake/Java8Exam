package com.dtcc.exams.part1;

import java.util.ArrayList;
import java.util.Scanner;

public class DelTechConcatenator {
	
	
   Integer input;
   
   public DelTechConcatenator(Integer input) {
	   this.input = input;   
   }

    public Boolean isDel(){
        if(input % 3 == 0){
            return true;
        }else
            return false;
    }

    public Boolean isTech(){
        if(input % 5 == 0){
            return true;
        }else
            return false;
    }

    public Boolean isDelTech(){
        if(input % 3 == 0 && input % 5 == 0){
            return true;
        }else
            return false;
    }
}
