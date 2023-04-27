package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongzuowushougoushangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongzuowushougoushangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongzuowushougoushangView;


/**
 * 农作物收购商
 *
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface NongzuowushougoushangService extends IService<NongzuowushougoushangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongzuowushougoushangVO> selectListVO(Wrapper<NongzuowushougoushangEntity> wrapper);
   	
   	NongzuowushougoushangVO selectVO(@Param("ew") Wrapper<NongzuowushougoushangEntity> wrapper);
   	
   	List<NongzuowushougoushangView> selectListView(Wrapper<NongzuowushougoushangEntity> wrapper);
   	
   	NongzuowushougoushangView selectView(@Param("ew") Wrapper<NongzuowushougoushangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongzuowushougoushangEntity> wrapper);
   	

}

