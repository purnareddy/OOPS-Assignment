package com.test.app;

public class App 
{
    public static void main( String[] args )
    {
    	EvaluationService evaluate1 = new EvaluationService(EvaluationService.inputMarks());
		System.out.println(evaluate1.evaluateSubjectMarks(evaluate1.getMarks()));
    }
}
