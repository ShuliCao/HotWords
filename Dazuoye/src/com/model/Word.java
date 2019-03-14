package com.model;

import java.util.ArrayList;
import java.util.List;

public class Word {
	String name;
	String expl;
	String type;
	String title1,title2,title3,title4;
	String a1,a2,a3,a4;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpl() {
		return expl;
	}
	public void setExpl(String expl) {
		this.expl = expl;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setAll(String name,String expl,String type) {
		this.name = name;
		this.expl = expl;
		this.type = type;
	}
	public void setArticle(String title1,String title2,String title3,String title4
			,String a1,String a2,String a3,String a4) {
		this.title1 = title1;this.a1 = a1;
		this.title2 = title2;this.a2 = a2;
		this.title3 = title3;this.a3 = a3;
		this.title4 = title4;this.a4 = a4;
	}
	public List<String> getTitle(){
		List<String> title = new ArrayList<>();
		title.add(title1);
		title.add(title2);
		title.add(title3);
		title.add(title4);
		return title;
	}
	public List<String> getA(){
		List<String> a = new ArrayList<>();
		a.add(a1);
		a.add(a2);
		a.add(a3);
		a.add(a4);
		return a;
	}
}
