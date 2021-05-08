package com.bw.springbootdubbomybatisplusdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bw.springbootdubbomybatisplusdemo.model.TestTable;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestTableMapper extends BaseMapper<TestTable> {

}
