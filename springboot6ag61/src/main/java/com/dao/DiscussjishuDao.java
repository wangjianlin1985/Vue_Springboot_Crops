package com.dao;

import com.entity.DiscussjishuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjishuVO;
import com.entity.view.DiscussjishuView;


/**
 * 技术评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface DiscussjishuDao extends BaseMapper<DiscussjishuEntity> {
	
	List<DiscussjishuVO> selectListVO(@Param("ew") Wrapper<DiscussjishuEntity> wrapper);
	
	DiscussjishuVO selectVO(@Param("ew") Wrapper<DiscussjishuEntity> wrapper);
	
	List<DiscussjishuView> selectListView(@Param("ew") Wrapper<DiscussjishuEntity> wrapper);

	List<DiscussjishuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjishuEntity> wrapper);
	
	DiscussjishuView selectView(@Param("ew") Wrapper<DiscussjishuEntity> wrapper);
	

}
