package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongyejishuyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongyejishuyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongyejishuyuanView;


/**
 * 农业技术员
 *
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface NongyejishuyuanService extends IService<NongyejishuyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongyejishuyuanVO> selectListVO(Wrapper<NongyejishuyuanEntity> wrapper);
   	
   	NongyejishuyuanVO selectVO(@Param("ew") Wrapper<NongyejishuyuanEntity> wrapper);
   	
   	List<NongyejishuyuanView> selectListView(Wrapper<NongyejishuyuanEntity> wrapper);
   	
   	NongyejishuyuanView selectView(@Param("ew") Wrapper<NongyejishuyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongyejishuyuanEntity> wrapper);
   	

}

