package com.dao;

import com.entity.DiscussxuanboEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuanboVO;
import com.entity.view.DiscussxuanboView;


/**
 * 选播评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface DiscussxuanboDao extends BaseMapper<DiscussxuanboEntity> {
	
	List<DiscussxuanboVO> selectListVO(@Param("ew") Wrapper<DiscussxuanboEntity> wrapper);
	
	DiscussxuanboVO selectVO(@Param("ew") Wrapper<DiscussxuanboEntity> wrapper);
	
	List<DiscussxuanboView> selectListView(@Param("ew") Wrapper<DiscussxuanboEntity> wrapper);

	List<DiscussxuanboView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuanboEntity> wrapper);
	
	DiscussxuanboView selectView(@Param("ew") Wrapper<DiscussxuanboEntity> wrapper);
	

}
