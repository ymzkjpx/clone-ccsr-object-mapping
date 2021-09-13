package com.cloneccsrobjectmapping.application.kit;

import com.cloneccsrobjectmapping.CcsrTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


@CcsrTest
class StarterKitQueryServiceTest {
    @Autowired
    StarterKitQueryService starterKitQueryService;

    @Test
    void 本を一覧検索できる() throws Exception{
        /**
         * # レコード数の一致性を検証する。
         * DBからレコード数を取得
         * 一覧を取得する
         * レコード数を比較し一致すればTrue
         */
    }

}