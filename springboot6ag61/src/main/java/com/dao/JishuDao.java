package com.dao;

import com.entity.JishuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JishuVO;
import com.entity.view.JishuView;


/**
 * 技术
 * 
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface JishuDao extends BaseMapper<JishuEntity> {
	
	List<JishuVO> selectListVO(@Param("ew") Wrapper<JishuEntity> wrapper);
	
	JishuVO selectVO(@Param("ew") Wrapper<JishuEntity> wrapper);
	
	List<JishuView> selectListView(@Param("ew") Wrapper<JishuEntity> wrapper);

	List<JishuView> selectListView(Pagination page,@Param("ew") Wrapper<JishuEntity> wrapper);
	
	JishuView selectView(@Param("ew") Wrapper<JishuEntity> wrapper);
	

}
