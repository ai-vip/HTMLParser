package com.parse.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.parse.bean.ListItemInfo;

public class ParseItemInOnePage {
	
	public static void main(String[] args){
		ParseItemInOnePage parser = new ParseItemInOnePage();
		List<ListItemInfo> list = parser.parse("http://www.dianping.com/search/category/1/10/g101",1);
		System.out.println(list);
	}
	
	public  List<ListItemInfo> parse(String pageUrl,int page) {
		pageUrl+="p"+page;
		Document doc = null;
		try {
			doc = Jsoup.connect(pageUrl).timeout(5000).userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36 SE 2.X MetaSr 1.0").get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<ListItemInfo> list=new ArrayList<ListItemInfo>();
		//获取本页20条商品信息
		for (int i = 1; i <= 20; i++) {
			Elements elements = doc.select("#shop-all-list > ul > li:nth-child(" + i + ")");
			//解析每一条商品信息
			for (Element element : elements) {
				String imageUrl = element.select("div.pic > a > img").attr("data-src");
				String title = element.getElementsByTag("h4").text();
				String itemUrl = "http://www.dianping.com" + element.getElementsByTag("a").attr("href");
				String star = element.select("div.txt > div.comment > span").get(0).attr("title");
				String commentCount = element.select("div.txt > div.comment > a.review-num > b").text();
				String avgPrice = element.select("div.txt > div.comment > a.mean-price > b").text();
				String type = element.select("div.txt > div.tag-addr > a:nth-child(1) > span").text();
				String area = element.select("div.txt > div.tag-addr > a:nth-child(3) > span").text();
				String detailedAddress = element.select("div.txt > div.tag-addr > span").text();
				String flavorScore = element.select("div.txt > span > span:nth-child(1) > b").text();
				String envirmentScore = element.select("div.txt > span > span:nth-child(2) > b").text();
				String serviceScore = element.select("div.txt > span > span:nth-child(3) > b").text();
				
				ListItemInfo item=new ListItemInfo();
				item.setImageUrl(imageUrl);
				item.setTitle(title);
				item.setItemUrl(itemUrl);
				item.setStar(star);
				item.setCommentCount(commentCount);
				item.setAvgPrice(avgPrice);
				item.setType(type);
				item.setArea(area);
				item.setDetailedAddress(detailedAddress);
				item.setFlavorScore(flavorScore);
				item.setEnvirmentScore(envirmentScore);
				item.setServiceScore(serviceScore);
				list.add(item);
				

			}
			
			System.out.println("======================================");
		}
		return list;
	}
}
