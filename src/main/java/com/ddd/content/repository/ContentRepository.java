package com.ddd.content.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ddd.content.domain.bean.ContentAgg;

public interface ContentRepository extends JpaRepository<ContentAgg, Long> {

    ContentAgg findByAssetID(String assetId);

}
