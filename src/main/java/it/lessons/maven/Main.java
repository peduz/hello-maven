package it.lessons.maven;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		LOGGER.info("Entrato nel main");
		
		System.out.println("Ciao");
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Inserisci un numero");
			double scelta = scan.nextDouble();
			System.out.println("Hai scelto " + scelta);
		} catch(Exception e) {
			LOGGER.error("Errore nella scelta: ", e);
		}
		
		LOGGER.info("Usita dal main");
	}
}
