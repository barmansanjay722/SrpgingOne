package com.blog.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {
	
	String resourceName;
	String fieldName;
	long feildValue;
	
	
	public ResourceNotFoundException(String resourceName, String fieldName, long feildValue) {
		super(String.format("%s fot found with %s: %s", resourceName,fieldName,feildValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.feildValue = feildValue;
	}
	
}
