package com.dao;

import com.entity.DiscussnongzuowushougoushangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussnongzuowushougoushangVO;
import com.entity.view.DiscussnongzuowushougoushangView;


/**
 * 农作物收购商评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface DiscussnongzuowushougoushangDao extends BaseMapper<DiscussnongzuowushougoushangEntity> {
	
	List<DiscussnongzuowushougoushangVO> selectListVO(@Param("ew") Wrapper<DiscussnongzuowushougoushangEntity> wrapper);
	
	DiscussnongzuowushougoushangVO selectVO(@Param("ew") Wrapper<DiscussnongzuowushougoushangEntity> wrapper);
	
	List<DiscussnongzuowushougoushangView> selectListView(@Param("ew") Wrapper<DiscussnongzuowushougoushangEntity> wrapper);

	List<DiscussnongzuowushougoushangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussnongzuowushougoushangEntity> wrapper);
	
	DiscussnongzuowushougoushangView selectView(@Param("ew") Wrapper<DiscussnongzuowushougoushangEntity> wrapper);
	

}
