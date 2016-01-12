package com.parse.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.parse.bean.ListItemInfo;
import com.parse.mapper.ListItemInfoMapper;

public class ListItemService {

	public static void main(String[] args) {
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream("config/mybatis_config.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sessionFactory.openSession();
		ListItemInfoMapper mapper = session.getMapper(ListItemInfoMapper.class);

		ParseItemInOnePage parser = new ParseItemInOnePage();
		for(int page=1;page<51;page++){
		List<ListItemInfo> list=new ArrayList<ListItemInfo>();
		list = parser.parse("http://www.dianping.com/search/category/1/10/g132",page);
		for (ListItemInfo item : list) {
			mapper.saveListItemInfo(item);
			
		}
		session.commit();
		}
		
		ListItemInfo listItemInfo = mapper.getListItemInfo("http://www.dianping.com/shop/11573557");
		System.out.println(listItemInfo);
		session.close();
	}
}
