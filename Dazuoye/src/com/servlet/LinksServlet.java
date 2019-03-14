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
 * Servlet implementation class LinksServlet
 */
@WebServlet("/LinksServlet")
public class LinksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LinksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		String method = request.getParameter("method");
		if(method.equals("links")) {
			JSONObject json = new JSONObject();
			List<JSONObject> data = new ArrayList<>();
			List<JSONObject> categories = new ArrayList<>();
			List<JSONObject> links = new ArrayList<>();
			IWordDao dao = new WordDaoImpl();
			
			List<Word> words = dao.allWords();
			for(Word word:words) {
				JSONObject datai = new JSONObject();
				datai.put("name", word.getName());
				datai.put("draggable", true);
				datai.put("symbolSize", new int[] {50,50});
				datai.put("itemStyle", new JSONObject().put("color", "#000"));
				datai.put("category", "收入支出分析");
				data.add(datai);
				
				JSONObject linksi = new JSONObject();
				linksi.put("target", word.getName());
				linksi.put("source", word.getType());
				linksi.put("category", "收入+");
				links.add(linksi);
				
			}
			
			JSONObject json21 = new JSONObject();
			json21.put("name", "收入支出分析");
			categories.add(json21);
			
			
			
			
			json.put("data", data);
			json.put("categories", categories);
			json.put("links", links);
			
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toJSONString());
		}
		//System.out.println("NO");
	}

}
