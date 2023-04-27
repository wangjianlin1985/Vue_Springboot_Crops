package com.dao;

import com.entity.NongzuowushougoushangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongzuowushougoushangVO;
import com.entity.view.NongzuowushougoushangView;


/**
 * 农作物收购商
 * 
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface NongzuowushougoushangDao extends BaseMapper<NongzuowushougoushangEntity> {
	
	List<NongzuowushougoushangVO> selectListVO(@Param("ew") Wrapper<NongzuowushougoushangEntity> wrapper);
	
	NongzuowushougoushangVO selectVO(@Param("ew") Wrapper<NongzuowushougoushangEntity> wrapper);
	
	List<NongzuowushougoushangView> selectListView(@Param("ew") Wrapper<NongzuowushougoushangEntity> wrapper);

	List<NongzuowushougoushangView> selectListView(Pagination page,@Param("ew") Wrapper<NongzuowushougoushangEntity> wrapper);
	
	NongzuowushougoushangView selectView(@Param("ew") Wrapper<NongzuowushougoushangEntity> wrapper);
	

}
