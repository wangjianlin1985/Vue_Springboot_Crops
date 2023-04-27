package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjishuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjishuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjishuView;


/**
 * 技术评论表
 *
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface DiscussjishuService extends IService<DiscussjishuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjishuVO> selectListVO(Wrapper<DiscussjishuEntity> wrapper);
   	
   	DiscussjishuVO selectVO(@Param("ew") Wrapper<DiscussjishuEntity> wrapper);
   	
   	List<DiscussjishuView> selectListView(Wrapper<DiscussjishuEntity> wrapper);
   	
   	DiscussjishuView selectView(@Param("ew") Wrapper<DiscussjishuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjishuEntity> wrapper);
   	

}

