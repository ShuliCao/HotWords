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
 * Servlet implementation class FenleiServlet
 */
@WebServlet("/FenleiServlet")
public class FenleiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FenleiServlet() {
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
		response.setHeader("Access-Control-Allow-Origin","*");
		request.setCharacterEncoding("utf-8");
		JSONObject json = new JSONObject();
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		IWordDao wordDao = new WordDaoImpl();
		wordDao.update(name, type);
		Word word = wordDao.search(name);
		if(word==null) {
			return;
		}else {
			List<String> title = word.getTitle();
			List<String> a = word.getA();
			json.put("type", word.getType());
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toJSONString());
		}
	}

}
