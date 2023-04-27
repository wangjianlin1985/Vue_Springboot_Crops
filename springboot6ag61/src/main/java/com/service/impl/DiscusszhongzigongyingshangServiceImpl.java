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


import com.dao.DiscusszhongzigongyingshangDao;
import com.entity.DiscusszhongzigongyingshangEntity;
import com.service.DiscusszhongzigongyingshangService;
import com.entity.vo.DiscusszhongzigongyingshangVO;
import com.entity.view.DiscusszhongzigongyingshangView;

@Service("discusszhongzigongyingshangService")
public class DiscusszhongzigongyingshangServiceImpl extends ServiceImpl<DiscusszhongzigongyingshangDao, DiscusszhongzigongyingshangEntity> implements DiscusszhongzigongyingshangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhongzigongyingshangEntity> page = this.selectPage(
                new Query<DiscusszhongzigongyingshangEntity>(params).getPage(),
                new EntityWrapper<DiscusszhongzigongyingshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhongzigongyingshangEntity> wrapper) {
		  Page<DiscusszhongzigongyingshangView> page =new Query<DiscusszhongzigongyingshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhongzigongyingshangVO> selectListVO(Wrapper<DiscusszhongzigongyingshangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhongzigongyingshangVO selectVO(Wrapper<DiscusszhongzigongyingshangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhongzigongyingshangView> selectListView(Wrapper<DiscusszhongzigongyingshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhongzigongyingshangView selectView(Wrapper<DiscusszhongzigongyingshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
