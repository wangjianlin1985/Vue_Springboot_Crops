package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JishuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JishuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JishuView;


/**
 * 技术
 *
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface JishuService extends IService<JishuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JishuVO> selectListVO(Wrapper<JishuEntity> wrapper);
   	
   	JishuVO selectVO(@Param("ew") Wrapper<JishuEntity> wrapper);
   	
   	List<JishuView> selectListView(Wrapper<JishuEntity> wrapper);
   	
   	JishuView selectView(@Param("ew") Wrapper<JishuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JishuEntity> wrapper);
   	

}

