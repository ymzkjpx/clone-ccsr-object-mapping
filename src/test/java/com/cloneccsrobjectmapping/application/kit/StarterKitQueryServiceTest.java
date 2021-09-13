package com.cloneccsrobjectmapping.application.kit;

import com.cloneccsrobjectmapping.CcsrTest;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKit;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKitList;
import com.cloneccsrobjectmapping.domain.model.specification.CaseType;
import com.cloneccsrobjectmapping.domain.model.specification.Covered;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


@CcsrTest
class StarterKitQueryServiceTest {
    @Autowired
    StarterKitQueryService starterKitQueryService;

    @Test
    void 栽培キットを一覧検索できる() throws Exception {
        /**
         * # 1件目のレコードが'KIT-X123-Y9XD'であること
         */
        StarterKitList result = starterKitQueryService.findStarterKitList();
        StarterKit starterKit = result.asList().get(0);
        assertAll(() ->
                        assertEquals("KIT-X123-Y9XD", starterKit.starterKitNumber().value())
                , () -> assertEquals(CaseType.プラスチック製, starterKit.specification().caseType())
                , () -> assertEquals(Covered.NON_COVERED, starterKit.specification().covered())
        );
    }
}