package com.dao;

import com.entity.XuanboEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuanboVO;
import com.entity.view.XuanboView;


/**
 * 选播
 * 
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface XuanboDao extends BaseMapper<XuanboEntity> {
	
	List<XuanboVO> selectListVO(@Param("ew") Wrapper<XuanboEntity> wrapper);
	
	XuanboVO selectVO(@Param("ew") Wrapper<XuanboEntity> wrapper);
	
	List<XuanboView> selectListView(@Param("ew") Wrapper<XuanboEntity> wrapper);

	List<XuanboView> selectListView(Pagination page,@Param("ew") Wrapper<XuanboEntity> wrapper);
	
	XuanboView selectView(@Param("ew") Wrapper<XuanboEntity> wrapper);
	

}
