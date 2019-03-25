package com.squirrel;

import static org.junit.Assert.assertTrue;

import com.squirrel.mapper.GirlMapper;
import com.squirrel.pojo.Girl;
import com.squirrel.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void ml(){
        SqlSession sqlSession = MybatisUtil.getSessioin();
       GirlMapper mapper =  sqlSession.getMapper(GirlMapper.class);
        Girl g = new Girl();
        g.setLastName("林心如");
        g.setFlower("霍建华");
        g.setBirthday(new Date());

        mapper.insert(g);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void m2(){
        SqlSession sqlSession = MybatisUtil.getSessioin();
        GirlMapper mapper =  sqlSession.getMapper(GirlMapper.class);
        Girl girl = mapper.queryById(1L);
        System.out.println(girl.getLastName());
        sqlSession.close();
    }
    @Test
    public void m3(){
        SqlSession sqlSession = MybatisUtil.getSessioin();
        GirlMapper mapper =  sqlSession.getMapper(GirlMapper.class);
        Girl girl =  mapper.queryByName("林心如");
        System.out.println(girl.getFlower());

        sqlSession.close();
    }
    @Test
    public void m4(){
        SqlSession sqlSession = MybatisUtil.getSessioin();
        GirlMapper mapper =  sqlSession.getMapper(GirlMapper.class);
        Girl girl =  mapper.qureyByNameFlower("林心如","霍建华");
        System.out.println(girl.getFlower());

        sqlSession.close();
    }

}
