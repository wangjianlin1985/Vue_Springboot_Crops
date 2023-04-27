package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhongzigongyingshangDao;
import com.entity.ZhongzigongyingshangEntity;
import com.service.ZhongzigongyingshangService;
import com.entity.vo.ZhongzigongyingshangVO;
import com.entity.view.ZhongzigongyingshangView;

@Service("zhongzigongyingshangService")
public class ZhongzigongyingshangServiceImpl extends ServiceImpl<ZhongzigongyingshangDao, ZhongzigongyingshangEntity> implements ZhongzigongyingshangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongzigongyingshangEntity> page = this.selectPage(
                new Query<ZhongzigongyingshangEntity>(params).getPage(),
                new EntityWrapper<ZhongzigongyingshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongzigongyingshangEntity> wrapper) {
		  Page<ZhongzigongyingshangView> page =new Query<ZhongzigongyingshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhongzigongyingshangVO> selectListVO(Wrapper<ZhongzigongyingshangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongzigongyingshangVO selectVO(Wrapper<ZhongzigongyingshangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongzigongyingshangView> selectListView(Wrapper<ZhongzigongyingshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongzigongyingshangView selectView(Wrapper<ZhongzigongyingshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
