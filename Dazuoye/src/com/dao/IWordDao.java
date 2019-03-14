package com.dao;

import java.util.List;

import com.model.Word;

public interface IWordDao {
	public Word search(String name);
	public void add(String name,String expl,String type,List<String> title,List<String> a);
	public List<Word> allWords();
	public void update(String name,String type);
}
