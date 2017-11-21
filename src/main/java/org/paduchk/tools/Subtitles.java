package org.paduchk.tools;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@PropertySource("classpath:subtitles.properties")
@ConfigurationProperties
@Data
public class Subtitles {
	String firstNameCaption;
	String lastNameCaption;
	String emailCaption;
	String activeCaption;
	String employeeTypeCaption;
	String addButtonCaption;
	String editButtonCaption;
	String removeButtonCaption;
}
