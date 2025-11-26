package com.comback.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ApplicationInfoEntity {

	@EqualsAndHashCode.Include
	private String serviceName;

	private String version;

	private String applicationStartTime;
	
	public ApplicationInfoEntity() {
		
	}
}
