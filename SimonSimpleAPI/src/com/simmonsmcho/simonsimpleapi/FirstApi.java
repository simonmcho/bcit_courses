package com.simmonsmcho.simonsimpleapi;

import java.util.UUID;

public class FirstApi {
	
	private static final String WARNING_MESSAGE = "YOU SHALL NOT PASS!";
	private static final UUID SAMPLE_ID = UUID.randomUUID();
	
	public static String getWarningMessage() {
		return WARNING_MESSAGE;
	}
	
	public static UUID getSampleId() {
		return SAMPLE_ID;
	}
}
