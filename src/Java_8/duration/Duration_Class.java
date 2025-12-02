package Java_8.duration;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;

public class Duration_Class {
	public static void main(String[] args) throws InterruptedException {
		Instant instant=Instant.now();
		Thread.sleep(10000);
		Instant end=Instant.now();
		System.out.println(Duration.between(instant, end));

	}
}
