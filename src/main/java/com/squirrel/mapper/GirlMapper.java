package com.squirrel.mapper;

import com.squirrel.pojo.Girl;

public interface GirlMapper {
        int insert(Girl girl);
        Girl queryById(Long id);
        Girl queryByName(String name);

        /**
         * 
         * @param name
         * @param flower
         * @return
         */
        Girl qureyByNameFlower(String name,String flower);

}
