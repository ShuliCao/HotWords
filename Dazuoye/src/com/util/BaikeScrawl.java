package com.util;

import java.util.List;

import com.dao.IWordDao;
import com.dao.WordDaoImpl;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

public class BaikeScrawl implements PageProcessor  {
	private static String name;
	private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

	public void run(String name) {// 1

		this.name = name;
		Spider.create(this).addUrl("https://baike.baidu.com/item/" + name).thread(5).run();
	}

	@Override
	public Site getSite() {
		// TODO Auto-generated method stub
		return site;
	}

	@Override
	public void process(Page page) {// 2
		System.setProperty("https.protocols", "TLSv1");
		String expl = page.getHtml().xpath("//meta[@name='description']/@content").toString();// 找到name='description'的meta,获取meta的content属性的内容
		CSDNScrawl csdn = new CSDNScrawl();
		csdn.run(name);
		List<String> title = csdn.getT();
		List<String> a = csdn.getA();
		IWordDao dao = new WordDaoImpl();
		String[] f = new String[] {"编程语言","IT人物","算法","大数据"};
		int t = (int)(Math.random()*3);
		dao.add(name, expl,f[t],title,a);
//		page.addTargetRequest("https://so.csdn.net/so/search/s.do?q=" + name);
	}

}
