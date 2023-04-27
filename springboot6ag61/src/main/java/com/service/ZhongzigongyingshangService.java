package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongzigongyingshangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongzigongyingshangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongzigongyingshangView;


/**
 * 种子供应商
 *
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface ZhongzigongyingshangService extends IService<ZhongzigongyingshangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongzigongyingshangVO> selectListVO(Wrapper<ZhongzigongyingshangEntity> wrapper);
   	
   	ZhongzigongyingshangVO selectVO(@Param("ew") Wrapper<ZhongzigongyingshangEntity> wrapper);
   	
   	List<ZhongzigongyingshangView> selectListView(Wrapper<ZhongzigongyingshangEntity> wrapper);
   	
   	ZhongzigongyingshangView selectView(@Param("ew") Wrapper<ZhongzigongyingshangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongzigongyingshangEntity> wrapper);
   	

}

