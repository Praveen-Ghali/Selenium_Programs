package com.actiTime.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class TaskListPage {

	@FindBy(xpath ="//a[@class='content tasks']")
	private WebElement addUser;
	
}
