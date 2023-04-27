package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuanboEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuanboVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuanboView;


/**
 * 选播
 *
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface XuanboService extends IService<XuanboEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuanboVO> selectListVO(Wrapper<XuanboEntity> wrapper);
   	
   	XuanboVO selectVO(@Param("ew") Wrapper<XuanboEntity> wrapper);
   	
   	List<XuanboView> selectListView(Wrapper<XuanboEntity> wrapper);
   	
   	XuanboView selectView(@Param("ew") Wrapper<XuanboEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuanboEntity> wrapper);
   	

}

