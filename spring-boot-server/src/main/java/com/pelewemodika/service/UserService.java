package com.pelewemodika.service;

import java.util.Map;
import java.util.Optional;

import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

import com.pelewemodika.dto.LocalUser;
import com.pelewemodika.dto.SignUpRequest;
import com.pelewemodika.exception.UserAlreadyExistAuthenticationException;
import com.pelewemodika.model.User;

/**
 * @author Pelewe
 * @since 07/16/2022
 */
public interface UserService {

	public User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;

	User findUserByEmail(String email);

	Optional<User> findUserById(Long id);

	LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);
}
