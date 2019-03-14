package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
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

/**
 * Servlet implementation class WordCloudServlet
 */
@WebServlet("/WordCloudServlet")
public class WordCloudServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WordCloudServlet() {
        super();
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
		request.setCharacterEncoding("utf-8");
		response.setHeader("Access-Control-Allow-Origin","*");
		String method = request.getParameter("method");
		if(method.equals("wordCloud")) {
			JSONObject json = new JSONObject();
			List<JSONObject> data = new ArrayList<>();
			List<Word> words = new ArrayList<>();
			IWordDao dao = new WordDaoImpl();
			words = dao.allWords();
			
			for(Word word:words) {
				JSONObject wordi = new JSONObject();
				wordi.put("name",word.getName());
				wordi.put("value",(int)(Math.random()*100+1));
				data.add(wordi);
			}
			json.put("data", data);
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toJSONString());
		}
	}

}
