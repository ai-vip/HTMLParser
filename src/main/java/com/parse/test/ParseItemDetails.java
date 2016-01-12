package com.parse.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.parse.bean.Comment;
import com.parse.bean.Item;
import com.parse.bean.Tag;

public class ParseItemDetails {
	
	public static void main(String[] args){
		ParseItemDetails parser = new ParseItemDetails();
		Item item = parser.parse("http://www.dianping.com/shop/15095024");
		System.out.println(item);
	}
	
	public  Item parse(String pageUrl) {
		Document doc = null;
		try {
			doc = Jsoup.connect(pageUrl).timeout(5000)
					.header("User-Agent","Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2")
					.get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String phoneNumber=doc.select("#basic-info > p.expand-info.tel > span.item").text();
		String alias=doc.select("#basic-info > div.other.J-other > p:nth-child(1) > span.item").text();
		String openingHours=doc.select("#basic-info > div.other.J-other > p:nth-child(2) > span.item").text();
		List<Tag> tags =new ArrayList<Tag>();
		List<Comment> comments=new ArrayList<Comment>();
		
		Item item=new Item();
		
		return item;
	}
}
