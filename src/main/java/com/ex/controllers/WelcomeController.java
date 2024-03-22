package com.ex.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ex.utils.Utils;

@Controller
public class WelcomeController {
	
	private static final Logger log = LogManager.getLogger(WelcomeController.class);

	@Value("${rootContext}")
	String rootContext;

	@GetMapping("/welcome")
	@ResponseBody
	public String sayWelcome(HttpServletRequest request) {
		
		Map<String, String> requestQueryMap = null;
//	int retryMainMenu = 0;

	log.info("Root context path in welcome method :: " + request.getContextPath());
	log.info("request.getRequestURL() :: " + request.getRequestURL());
	log.info("request.getRequestURI() :: " + request.getRequestURI());
	log.info("request.query String :: " + request.getQueryString());

	String requestQueryString = request.getQueryString();

	if (requestQueryString != null) {
		requestQueryMap = Utils.splitQuery(requestQueryString);
		Utils.printMap(requestQueryMap);
	}
		
		log.info("Inside WelcomeController");
		log.info("Inside sayWelcome()");

		return "<Response>\r\n"
				+ "    <Say voice=\"man\" language=\"en-us\" loop=\"0\">Welcome to Voicera Analytics IVR Support.</Say>\r\n"
				+ "</Response>";
	}

}
