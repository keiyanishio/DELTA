package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MediaTest {
	
	private String nome = "Batman";
	
	
	@BeforeEach
	void setUp() {
	}

	@Test
	void FiveSeconds() {
		assertEquals("0:00:05", new Media(nome, 5).getDurationString());
	}

	@Test
	void FiftyFiveSeconds() {
		assertEquals("0:00:55", new Media(nome, 55).getDurationString());

	}

	@Test
	void FiveMinutesFiveSeconds() {
		assertEquals("0:05:05", new Media(nome, 305).getDurationString());

	}

	@Test
	void FiveMinutesFiftyFiveSeconds() {
		assertEquals("0:05:55", new Media(nome, 355).getDurationString());

	}

	@Test
	void FiftyFiveMinutesFiveSeconds() {
		assertEquals("0:55:05", new Media(nome, 3305).getDurationString());

	}

	@Test
	void FiftyFiveMinutesFiftyFiveSeconds() {
		assertEquals("0:55:55", new Media(nome, 3355).getDurationString());

	}

	@Test
	void OneHourFiveSeconds() {
		assertEquals("1:00:05", new Media(nome, 3605).getDurationString());

	}

	@Test
	void OneHourFiftyFiveSeconds() {
		assertEquals("1:00:55", new Media(nome, 3655).getDurationString());

	}

	@Test
	void OneHourFiveMinutesFiveSeconds() {
		assertEquals("1:05:05", new Media(nome, 3905).getDurationString());

	}

	@Test
	void OneHourFiveMinutesFiftyFiveSeconds() {
		assertEquals("1:05:55", new Media(nome, 3955).getDurationString());

	}

	@Test
	void OneHourFiftyFiveMinutesFiveSeconds() {
		assertEquals("1:55:05", new Media(nome, 6905).getDurationString());

	}

	@Test
	void OneHourFiftyFiveMinutesFiftyFiveSeconds() {
		assertEquals("1:55:55", new Media(nome, 6955).getDurationString());

	}
}
