package com.kangtian.util.code;

import com.kangtian.util.http.HttpServletRequestUtil;

import javax.servlet.http.HttpServletRequest;

public class CodeUtil {
	public static boolean checkVerifyCode(HttpServletRequest request) {
//		String verifyCodeExpected = (String) request.getSession().getAttribute(
//				com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
//		String verifyCodeActual = request.getParameter("verifyCodeActual");
//		if (verifyCodeActual == null
//				|| !verifyCodeActual.equalsIgnoreCase(verifyCodeExpected)) {
//			return false;
//		}
		return true;
	}
}
