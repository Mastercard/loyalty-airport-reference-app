package com.mastercard.developer.loyalty_airport_client;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.util.Properties;

public class RequestHelper {
	
	private static String CONSUMER_KEY ="mastercard.airport.ref.app.consumer.key";
	
	private static String KEYSTORE_PATH ="mastercard.airport.ref.app.keystore.path";
	
	private static String KEYSTORE_PASSWORD ="mastercard.airport.ref.app.keystore.password";
	
	private static String KEYSTORE_ALIAS ="mastercard.airport.ref.app.keystore.alias";
	
	private static String BASE_URL = "mastercard.airport.ref.app.url";
	
	private static Properties prop = null;
	
	 public static PrivateKey getPrivateKey() throws Exception {
		 KeyStore ks = KeyStore.getInstance("PKCS12");
		 ks.load(new FileInputStream(prop.getProperty(KEYSTORE_PATH)), prop.getProperty(KEYSTORE_PASSWORD).toCharArray());
		 PrivateKey privateKey = (PrivateKey) ks.getKey(prop.getProperty(KEYSTORE_ALIAS), prop.getProperty(KEYSTORE_PASSWORD).toCharArray());
		 if (privateKey == null) {
			 throw new Exception("No key found.");
	     }
		 return privateKey;
	 }
	 
	 public static String getConsumerkey() {
		 return prop.getProperty(CONSUMER_KEY);
	 }
	 
	 public static String getBaseURL() {
		 return prop.getProperty(BASE_URL);
	 }
	 
	public static void loadProperties() {
		if (prop == null || prop.isEmpty()) {
			try (InputStream input = RequestHelper.class.getClassLoader()
					.getResourceAsStream("application.properties")) {
				prop = new Properties();
				if (input == null) {
					return;
				}
				prop.load(input);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
