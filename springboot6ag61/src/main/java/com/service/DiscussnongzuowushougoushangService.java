package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussnongzuowushougoushangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussnongzuowushougoushangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussnongzuowushougoushangView;


/**
 * 农作物收购商评论表
 *
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface DiscussnongzuowushougoushangService extends IService<DiscussnongzuowushougoushangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussnongzuowushougoushangVO> selectListVO(Wrapper<DiscussnongzuowushougoushangEntity> wrapper);
   	
   	DiscussnongzuowushougoushangVO selectVO(@Param("ew") Wrapper<DiscussnongzuowushougoushangEntity> wrapper);
   	
   	List<DiscussnongzuowushougoushangView> selectListView(Wrapper<DiscussnongzuowushougoushangEntity> wrapper);
   	
   	DiscussnongzuowushougoushangView selectView(@Param("ew") Wrapper<DiscussnongzuowushougoushangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussnongzuowushougoushangEntity> wrapper);
   	

}

