package com.macro.mall.portal.service;

import com.macro.mall.dto.PmsProductCategoryParam;
import com.macro.mall.dto.PmsProductCategoryWithChildrenItem;
import com.macro.mall.model.CmsSubjectCategory;
import com.macro.mall.model.PmsProductCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 产品分类Service
 * https://gitee.com/zscat-platform/mall on 2018/4/26.
 */
public interface PmsProductCategoryService {
    @Transactional
    int create(PmsProductCategoryParam pmsProductCategoryParam);

    @Transactional
    int update(Long id, PmsProductCategoryParam pmsProductCategoryParam);

    List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum);

    int delete(Long id);

    PmsProductCategory getItem(Long id);

    int updateNavStatus(List<Long> ids, Integer navStatus);

    int updateShowStatus(List<Long> ids, Integer showStatus);

    List<PmsProductCategoryWithChildrenItem> listWithChildren();

    List<CmsSubjectCategory> list(PmsProductCategory productCategory, Integer pageSize, Integer pageNum);
}
