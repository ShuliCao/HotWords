package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Word;
import com.util.DBUtil;

public class WordDaoImpl implements IWordDao{

	@Override
	public Word search(String name) {
		// TODO Auto-generated method stub
		Connection connection = DBUtil.getConnection();
		String sql = "select * from words where name = ?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Word word = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				word = new Word();
				word.setAll(name, resultSet.getString("expl"),
						resultSet.getString("type"));
				word.setArticle(resultSet.getString("title1")
						, resultSet.getString("title2"), resultSet.getString("title3")
						, resultSet.getString("title4"), resultSet.getString("a1")
						, resultSet.getString("a2"), resultSet.getString("a3")
						, resultSet.getString("a4"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.close(resultSet);
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
		return word;
	}

	@Override
	public void add(String name, String expl,String type,List<String> title,List<String> a) {
		// TODO Auto-generated method stub
		Connection connection = DBUtil.getConnection();
		String sql = "select * from words where name = ?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				if (resultSet.getInt(1) > 0) {
					return;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		sql = "insert into words(name,expl,type,title1,a1,title2,a2,title3,a3,title4,a4) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, expl);
			preparedStatement.setString(3, type);
			int k=0;
			for(int i=4;i<12;i++) {
				preparedStatement.setString(i++,title.get(k));
				preparedStatement.setString(i, a.get(k++));
			}
			preparedStatement.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	}

	@Override
	public List<Word> allWords() {
		// TODO Auto-generated method stub
		Connection connection = DBUtil.getConnection();
		String sql = "select * from words";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Word> words = new ArrayList<>();
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Word word = new Word();
				word.setAll(resultSet.getString("name"), resultSet.getString("expl"),
						resultSet.getString("type"));
				word.setArticle(resultSet.getString("title1")
						, resultSet.getString("title2"), resultSet.getString("title3")
						, resultSet.getString("title4"), resultSet.getString("a1")
						, resultSet.getString("a2"), resultSet.getString("a3")
						, resultSet.getString("a4"));
				words.add(word);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.close(resultSet);
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
		return words;
	}
	
	@Override
	public void update(String name,String type) {
		// TODO Auto-generated method stub
		Connection connection = DBUtil.getConnection();
		String sql = "select * from words where name = ?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Word word = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				word = new Word();
				word.setAll(name, resultSet.getString("expl"),
						resultSet.getString("type"));
				word.setArticle(resultSet.getString("title1")
						, resultSet.getString("title2"), resultSet.getString("title3")
						, resultSet.getString("title4"), resultSet.getString("a1")
						, resultSet.getString("a2"), resultSet.getString("a3")
						, resultSet.getString("a4"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		if(word == null) return ;
		sql = "update words set expl=?,type=?"
				+ ",title1=?,a1=?,title2=?,a2=?,title3=?"
				+ ",a3=?,title4=?,a4=?"
				+ " where name = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, word.getExpl());
			preparedStatement.setString(2, type);
			int k = 0;
			List<String> title = word.getTitle();
			List<String> as = word.getA();
			for(int i=3;i<11;i++) {
				preparedStatement.setString(i++, title.get(k));
				preparedStatement.setString(i, as.get(k));
				k++;
			}
			preparedStatement.setString(11, name);
			preparedStatement.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.close(resultSet);
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	}
	
}
