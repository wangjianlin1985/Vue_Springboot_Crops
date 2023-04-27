package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhongzigongyingshangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhongzigongyingshangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhongzigongyingshangView;


/**
 * 种子供应商评论表
 *
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface DiscusszhongzigongyingshangService extends IService<DiscusszhongzigongyingshangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhongzigongyingshangVO> selectListVO(Wrapper<DiscusszhongzigongyingshangEntity> wrapper);
   	
   	DiscusszhongzigongyingshangVO selectVO(@Param("ew") Wrapper<DiscusszhongzigongyingshangEntity> wrapper);
   	
   	List<DiscusszhongzigongyingshangView> selectListView(Wrapper<DiscusszhongzigongyingshangEntity> wrapper);
   	
   	DiscusszhongzigongyingshangView selectView(@Param("ew") Wrapper<DiscusszhongzigongyingshangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhongzigongyingshangEntity> wrapper);
   	

}

