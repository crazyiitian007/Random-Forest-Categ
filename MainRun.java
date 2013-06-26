package com.rf.real.categ;

import java.util.ArrayList;

public class MainRun {
  public static void main(String[] args){
		String traindata="/home/mohammad/Desktop/Material/KDDTrainSmall.txt";//data has to be separated by either ',' or ' ' only...
		String testdata="/home/mohammad/Desktop/Material/KDDTestSmall.txt";
		int numTrees=50;
		
		DescribeTreesCateg DT = new DescribeTreesCateg(traindata);
		ArrayList<ArrayList<String>> Train = DT.CreateInputCateg(traindata);
		ArrayList<ArrayList<String>> Test = DT.CreateInputCateg(testdata);
		int M=0;//set this
		int Ms=0;//set this
		
		RandomForestCateg RF = new RandomForestCateg(numTrees, M, Ms, Train, Test);
		RF.Start();
		
		//System.out.println("Printing traindata "+Train);
		
	}
}
