package com.kopetto.sample.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.kopetto.sample.domain.entity.profile.User;

/**
 * 
 */
public class AccountUtils {
	public static Authentication getAuthentication() {
		return SecurityContextHolder.getContext().getAuthentication();
	}

	public static User getLoginUserAccount() {
		if (getAuthentication() != null
				&& getAuthentication().getPrincipal() instanceof User) {
			return (User) getAuthentication().getPrincipal();
		}
		return null;
	}

	public static String getLoginUserId() {
		User account = getLoginUserAccount();
		return (account == null) ? null : account.getUserId();
	}

	private AccountUtils() {
	}
}
