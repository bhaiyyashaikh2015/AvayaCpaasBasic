package com.ex.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Utils {
	
	private static final Logger log = LogManager.getLogger(Utils.class);
	
	public static Map<String, String> splitQuery(String query) {

		Map<String, String> query_pairs = new LinkedHashMap<String, String>();

		try {
			String[] pairs = query.split("&");
			for (String pair : pairs) {
				int idx = pair.indexOf("=");
				query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"),
						URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return query_pairs;
	}

	public static void printMap(Map<String, String> map) {
		for (String key : map.keySet()) {
			log.info(key + " = " + map.get(key));
		}
	}
	
	public static String getFinalPhoneNumber(String countryCode, String phoneNumber) {
		log.info("Demo :: ");
		return "";
	}
	
	
}
