package org.paduchk.ui.view;

import org.paduchk.tools.Subtitles;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

import lombok.Data;

@DesignRoot
public class EmployeeDetailsViewDesign extends VerticalLayout {
	
	TextField firstName;
	TextField lastName;
	TextField email;
	ComboBox<Boolean> active;
	ComboBox<String> employeeType;
	
	public EmployeeDetailsViewDesign(Subtitles subtitles) {
		Design.read(this);
	
		firstName.setCaption(subtitles.getFirstNameCaption());
		lastName.setCaption(subtitles.getLastNameCaption());
		email.setCaption(subtitles.getEmailCaption());
		active.setCaption(subtitles.getActiveCaption());
		employeeType.setCaption(subtitles.getEmployeeTypeCaption());		
	}
}
