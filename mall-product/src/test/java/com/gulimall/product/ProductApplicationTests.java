package com.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulimall.product.entity.BrandEntity;
import com.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

//        brandEntity.setDescript("遥遥领先");
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");


//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("不要总数领先，给别人机会");
//        brandService.updateById(brandEntity);
//        System.out.println("修改成功");

        List<BrandEntity> list = brandService.list(new LambdaQueryWrapper<BrandEntity>().eq(BrandEntity::getBrandId, 1L));
        System.out.println(list);

//        brandEntity.setDescript("yaoyaolingxian");
//        brandEntity.setName("huawei");
//
//        brandService.save(brandEntity);
//        System.out.println("今天是个好日子");

//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("遥遥领先");
//        brandService.updateById(brandEntity);

//        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
//        list.forEach((item)->{
//            System.out.println(item);
//        });

    }

}
