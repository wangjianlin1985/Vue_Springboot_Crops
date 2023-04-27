package com.dao;

import com.entity.ZhongzigongyingshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongzigongyingshangVO;
import com.entity.view.ZhongzigongyingshangView;


/**
 * 种子供应商
 * 
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface ZhongzigongyingshangDao extends BaseMapper<ZhongzigongyingshangEntity> {
	
	List<ZhongzigongyingshangVO> selectListVO(@Param("ew") Wrapper<ZhongzigongyingshangEntity> wrapper);
	
	ZhongzigongyingshangVO selectVO(@Param("ew") Wrapper<ZhongzigongyingshangEntity> wrapper);
	
	List<ZhongzigongyingshangView> selectListView(@Param("ew") Wrapper<ZhongzigongyingshangEntity> wrapper);

	List<ZhongzigongyingshangView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongzigongyingshangEntity> wrapper);
	
	ZhongzigongyingshangView selectView(@Param("ew") Wrapper<ZhongzigongyingshangEntity> wrapper);
	

}
