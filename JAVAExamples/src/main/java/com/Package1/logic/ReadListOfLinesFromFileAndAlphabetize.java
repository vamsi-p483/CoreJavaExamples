package com.Package1.logic;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.io.FileUtils;

public class ReadListOfLinesFromFileAndAlphabetize {
	@SuppressWarnings("unused")
	private final Logger Logger = LoggerFactory
			.getLogger(ReadListOfLinesFromFileAndAlphabetize.class);

	public static void main(String[] args) {
		try {
			File file = new File("test.txt");
			List<String> lines = FileUtils.readLines(file);

			Collections.sort(lines);

			for (String line : lines) {
				System.out.println("line:" + line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
