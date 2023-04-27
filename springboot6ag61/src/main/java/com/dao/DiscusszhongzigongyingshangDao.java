package com.dao;

import com.entity.DiscusszhongzigongyingshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhongzigongyingshangVO;
import com.entity.view.DiscusszhongzigongyingshangView;


/**
 * 种子供应商评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface DiscusszhongzigongyingshangDao extends BaseMapper<DiscusszhongzigongyingshangEntity> {
	
	List<DiscusszhongzigongyingshangVO> selectListVO(@Param("ew") Wrapper<DiscusszhongzigongyingshangEntity> wrapper);
	
	DiscusszhongzigongyingshangVO selectVO(@Param("ew") Wrapper<DiscusszhongzigongyingshangEntity> wrapper);
	
	List<DiscusszhongzigongyingshangView> selectListView(@Param("ew") Wrapper<DiscusszhongzigongyingshangEntity> wrapper);

	List<DiscusszhongzigongyingshangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhongzigongyingshangEntity> wrapper);
	
	DiscusszhongzigongyingshangView selectView(@Param("ew") Wrapper<DiscusszhongzigongyingshangEntity> wrapper);
	

}
