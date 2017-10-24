package org.paduchk.ui;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

@DesignRoot
public class MainLayoutDesign extends VerticalLayout {
	
	Panel header;
	VerticalLayout menu;
	VerticalLayout content;
	Panel footer;
	
	public MainLayoutDesign( ) {
		Design.read(this);
	}
}
