package com.hanfeiyang.framework.business.ddns.mapper;

import com.hanfeiyang.framework.business.ddns.entity.Domain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hanfeiyang
 * @since 2022-03-07
 */
@Repository
@Mapper
public interface DomainMapper extends BaseMapper<Domain> {

}
