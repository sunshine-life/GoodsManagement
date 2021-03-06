package org.goodsmanagement.service.impl;

import org.goodsManagement.dao.impl.GetGoodsDaoImpl;
import org.goodsManagement.po.GetGoodsDto;
import org.goodsManagement.service.impl.GetGoodsServiceImpl;
import org.goodsManagement.vo.GetGoodsVO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by johnny on 15-9-23.
 */
public class GetGoodsServiceTest {
    private ApplicationContext applicationContext;
    private GetGoodsServiceImpl getGoodsService;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("application-config.xml");
        getGoodsService = (GetGoodsServiceImpl) applicationContext.getBean("getGoodsServiceImpl");
    }

    @Test
    public void getGoodsById() {
        GetGoodsVO vo = getGoodsService.getGoodsById(1);
        System.out.println(vo);
    }

    @Test
    public void testDeleteByPrimaryKey() throws Exception {

    }

    @Test
    public void testInsert() throws Exception {
    }

    @Test
    public void testInsertSelective() throws Exception {

    }

    @Test
    public void testSelectByPrimaryKey() throws Exception {
    }

    @Test
    public void testUpdateByPrimaryKeySelective() throws Exception {

    }

    @Test
    public void testUpdateByPrimaryKey() throws Exception {

    }
}
