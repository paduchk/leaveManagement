package org.paduchk.ui.view;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

@DesignRoot
@SpringView(name=test.VIEW_NAME)
public class test extends VerticalLayout implements View {
	
	public static final String VIEW_NAME = "test";

	public test() {
		// TODO Auto-generated constructor stub
		Design.read(this);
	}
}
