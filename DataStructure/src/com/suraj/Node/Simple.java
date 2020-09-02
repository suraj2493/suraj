package com.suraj.Node;

import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Simple {

	public static void main(String[] args) {
		String s="surururuuururaj";
	    char[] ch=s.toCharArray();
	    List li = new ArrayList<>();
	    for(char c: ch){
	    	li.add(c);
	    }
	    int count=0;
	    List<Character> lii=(List<Character>) li.stream().distinct().
	    collect((Collector) Collectors.toList().accumulator());
       
	    System.out.println(lii);
	}
}
