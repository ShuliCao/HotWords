package com.util;

import java.util.ArrayList;
import java.util.List;


import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

public class CSDNScrawl implements PageProcessor {
	private static String name;
	private Site site = Site.me().setRetryTimes(5).setSleepTime(1000);
	List<String> title = new ArrayList<>();
	List<String> a = new ArrayList<>();

	public void run(String name) {// 1
		this.name = name;
		Spider.create(this).addUrl("https://so.csdn.net/so/search/s.do?q=" + name).thread(5).run();
	}

	public Site getSite() {
		// TODO Auto-generated method stub
		return site;
	}

	public void process(Page page) {// 2
		this.title = page.getHtml().xpath("//div[@class='limit_width']/a[1]/text()").all();
		this.a = page.getHtml().xpath("//div[@class='limit_width']/a[1]/@href").all();
		
	}
	public List<String> getT(){
		return title;
	}
	public List<String> getA(){
		return a;
	}
}
