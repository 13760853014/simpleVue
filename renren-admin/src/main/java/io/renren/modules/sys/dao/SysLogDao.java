package io.renren.modules.sys.dao;

import io.renren.modules.sys.entity.SysLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2021-05-09 10:24:06
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
