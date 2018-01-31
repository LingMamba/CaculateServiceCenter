package com.mcc.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.mcc.impl.math.LinearImpl;
import com.mcc.impl.math.MatrixImpl;
import com.mcc.vo.DataFrame;


@RestController
public class MatrixControler {
	@RequestMapping(value = "/matrix/inverse", method = RequestMethod.POST)
	public DataFrame matrixInverse(@RequestBody DataFrame df){
		
		double[][] datas = df.getDatas();
		DataFrame reultDf = new MatrixImpl().inverse(datas);
		
		return reultDf;
		
	}
	
	
	@RequestMapping(value = "/matrix/transpose", method = RequestMethod.POST)
	public DataFrame matrixTranspose(@RequestBody DataFrame df){
		
		double[][] datas = df.getDatas();
		DataFrame reultDf = new MatrixImpl().inverse(datas);
		
		return reultDf;
		
	}
	
	
	@RequestMapping(value = "/matrix/multiply", method = RequestMethod.POST)
	public DataFrame multiply(@RequestBody Map<String,Object> df){
		
		
		
		
		Object var1 = df.get("var1");
		System.out.println(var1.getClass());
		String var2 = df.get("var2").toString();
		

		
		
		DataFrame resultDf = new DataFrame();
		return resultDf;
		
	}
	
	
	
	
	
}
