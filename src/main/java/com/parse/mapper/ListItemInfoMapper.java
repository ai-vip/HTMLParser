package com.parse.mapper;

import com.parse.bean.ListItemInfo;

public interface ListItemInfoMapper {
	public ListItemInfo getListItemInfo(String id);
	public void saveListItemInfo(ListItemInfo item);
}
