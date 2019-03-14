package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.dao.IWordDao;
import com.dao.WordDaoImpl;
import com.model.Word;
import com.util.BaikeScrawl;

/**
 * Servlet implementation class FindServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SearchServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setHeader("Access-Control-Allow-Origin","*");
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setHeader("Access-Control-Allow-Origin","*");
		request.setCharacterEncoding("utf-8");
		JSONObject json = new JSONObject();
		String name = request.getParameter("name2");
		if(name == null || name.equals("")) {
			name = request.getParameter("name1");
		}
		if(name==null||name.equals("")) {
			return ;
		}
		IWordDao wordDao = new WordDaoImpl();
		Word word = wordDao.search(name);
		if(word==null) {
			BaikeScrawl baike = new BaikeScrawl();
			baike.run(name);
			word = wordDao.search(name);
			List<String> title = word.getTitle();
			List<String> a = word.getA();
			json.put("name", name);
			json.put("expl", word.getExpl());
			json.put("type", word.getType());
			json.put("title1",title.get(0));
			json.put("a1",a.get(0));
			json.put("title2",title.get(1));
			json.put("a2",a.get(1));
			json.put("title3",title.get(2));
			json.put("a3",a.get(2));
			json.put("title4",title.get(3));
			json.put("a4",a.get(3));
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toJSONString());
		}else {
			List<String> title = word.getTitle();
			List<String> a = word.getA();
			json.put("name", name);
			json.put("expl", word.getExpl());
			json.put("type", word.getType());
			json.put("title1",title.get(0));
			json.put("a1",a.get(0));
			json.put("title2",title.get(1));
			json.put("a2",a.get(1));
			json.put("title3",title.get(2));
			json.put("a3",a.get(2));
			json.put("title4",title.get(3));
			json.put("a4",a.get(3));
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toJSONString());
		}
	}

}
