package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxuanboEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxuanboVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxuanboView;


/**
 * 选播评论表
 *
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface DiscussxuanboService extends IService<DiscussxuanboEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuanboVO> selectListVO(Wrapper<DiscussxuanboEntity> wrapper);
   	
   	DiscussxuanboVO selectVO(@Param("ew") Wrapper<DiscussxuanboEntity> wrapper);
   	
   	List<DiscussxuanboView> selectListView(Wrapper<DiscussxuanboEntity> wrapper);
   	
   	DiscussxuanboView selectView(@Param("ew") Wrapper<DiscussxuanboEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuanboEntity> wrapper);
   	

}

