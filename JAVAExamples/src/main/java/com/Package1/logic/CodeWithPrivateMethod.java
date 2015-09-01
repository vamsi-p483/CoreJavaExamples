package com.Package1.logic;

import java.util.Random;

public class CodeWithPrivateMethod {
	public void meaningfulPublicApi() {
        if (doTheGamble("Whatever", 1 << 3)) {
            throw new RuntimeException("boom");
        }
    }

    private boolean doTheGamble(String whatever, int binary) {
        Random random = new Random(System.nanoTime());
       
        boolean gamble = random.nextBoolean();
        System.out.println(gamble);
        return gamble;
    }
	public static void main(String args[]) {
		CodeWithPrivateMethod c=new CodeWithPrivateMethod();
		System.out.println(c.doTheGamble("Whatever", 1 << 3));
	}
}
