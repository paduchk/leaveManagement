package org.paduchk.ui.view;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.paduchk.domain.employee.Employee;
import org.paduchk.tools.Caption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.data.ValueProvider;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

import lombok.Data;

@DesignRoot
@PropertySource("classpath:subtitles.properties")
@ConfigurationProperties
@Data
public class EmployeesListViewDesign extends VerticalLayout {
	
	Grid<Employee> employeesList;


	String firstNameCaption="";
	Caption lastName;
	Caption active;
	Caption email;
	
	Button addButton;
	Button editButton;
	Button removeButton;
	
	Properties properties = new Properties();
	InputStream inputStream;
	String propertiesFileName = "subtitles.properties";

	public EmployeesListViewDesign() {
		// TODO Auto-generated constructor stub
		Design.read(this);

		
		employeesList.addColumn(new ValueProvider<Employee, String>() {
			@Override
			public String apply(Employee source) {
				// TODO Auto-generated method stub
				return source.getEmployeeType().getName();
			}
		}).setId("employeeType").setCaption("Typ pracownika");

		employeesList.setColumns("firstName","lastName","email","active","employeeType");
		
		employeesList.getColumn("firstName").setCaption(firstNameCaption);		
		employeesList.getColumn("lastName").setCaption("Nazwisko");		
		employeesList.getColumn("active").setCaption("Aktywny");
		employeesList.getColumn("email").setCaption("E-mail");		
	}
}
