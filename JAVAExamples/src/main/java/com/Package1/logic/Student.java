package com.Package1.logic;

public class Student {
	public int getMathScore() {
		ScoreGrader grader = new ScoreGrader();

		return grader.getScore();
	}

}
