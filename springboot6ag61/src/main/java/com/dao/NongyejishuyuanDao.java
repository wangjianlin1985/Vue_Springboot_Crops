package com.dao;

import com.entity.NongyejishuyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongyejishuyuanVO;
import com.entity.view.NongyejishuyuanView;


/**
 * 农业技术员
 * 
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface NongyejishuyuanDao extends BaseMapper<NongyejishuyuanEntity> {
	
	List<NongyejishuyuanVO> selectListVO(@Param("ew") Wrapper<NongyejishuyuanEntity> wrapper);
	
	NongyejishuyuanVO selectVO(@Param("ew") Wrapper<NongyejishuyuanEntity> wrapper);
	
	List<NongyejishuyuanView> selectListView(@Param("ew") Wrapper<NongyejishuyuanEntity> wrapper);

	List<NongyejishuyuanView> selectListView(Pagination page,@Param("ew") Wrapper<NongyejishuyuanEntity> wrapper);
	
	NongyejishuyuanView selectView(@Param("ew") Wrapper<NongyejishuyuanEntity> wrapper);
	

}
