package com.pelewemodika.dto;

/**
  * @author Pelewe
 * @since 07/16/2022
 */
public enum SocialProvider {

	FACEBOOK("facebook"), TWITTER("twitter"), LINKEDIN("linkedin"), GOOGLE("google"), GITHUB("github"), LOCAL("local");

	private String providerType;

	public String getProviderType() {
		return providerType;
	}

	SocialProvider(final String providerType) {
		this.providerType = providerType;
	}

}
