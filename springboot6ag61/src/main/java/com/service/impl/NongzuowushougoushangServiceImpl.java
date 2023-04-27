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


import com.dao.NongzuowushougoushangDao;
import com.entity.NongzuowushougoushangEntity;
import com.service.NongzuowushougoushangService;
import com.entity.vo.NongzuowushougoushangVO;
import com.entity.view.NongzuowushougoushangView;

@Service("nongzuowushougoushangService")
public class NongzuowushougoushangServiceImpl extends ServiceImpl<NongzuowushougoushangDao, NongzuowushougoushangEntity> implements NongzuowushougoushangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongzuowushougoushangEntity> page = this.selectPage(
                new Query<NongzuowushougoushangEntity>(params).getPage(),
                new EntityWrapper<NongzuowushougoushangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongzuowushougoushangEntity> wrapper) {
		  Page<NongzuowushougoushangView> page =new Query<NongzuowushougoushangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongzuowushougoushangVO> selectListVO(Wrapper<NongzuowushougoushangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongzuowushougoushangVO selectVO(Wrapper<NongzuowushougoushangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongzuowushougoushangView> selectListView(Wrapper<NongzuowushougoushangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongzuowushougoushangView selectView(Wrapper<NongzuowushougoushangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
