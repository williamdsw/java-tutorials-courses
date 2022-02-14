package com.williamdsw.behavioral.iterator.classes;

public interface ISocialNetwork {

	public IProfileIterator createFriendsIterator(String profileEmail);

	public IProfileIterator createCoworkersIterator(String profileEmail);

}