package com.my.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class User implements Serializable {

    private Integer id;         //表主键
    private String name;
    private String db_source;   //数据库来源  数据存在哪个数据库的字段 一个服务对应一个库,同一个信息可能存在不同库

}
