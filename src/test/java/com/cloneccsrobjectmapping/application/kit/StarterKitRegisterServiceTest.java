package com.cloneccsrobjectmapping.application.kit;

import com.cloneccsrobjectmapping.CcsrTest;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@CcsrTest
@AutoConfigureMockMvc
class StarterKitRegisterServiceTest {
    MockMvc mockMvc;
    StarterKitQueryService starterKitQueryService;
    StarterKitRegisterService starterKitRegisterService;

    public StarterKitRegisterServiceTest(MockMvc mockMvc, StarterKitQueryService starterKitQueryService, StarterKitRegisterService starterKitRegisterService) {
        this.mockMvc = mockMvc;
        this.starterKitQueryService = starterKitQueryService;
        this.starterKitRegisterService = starterKitRegisterService;
    }

//    @Test 1件登録できること(){
//        DateOfSeed dateOfSeed = new DateOfSeed(LocalDate.of(2021, Month.SEPTEMBER,17));
//        Specification specification = new Specification(
//        );
        /**
         *     private Specification(DateOfSeed dateOfSeed, Covered covered, CaseType caseType, Features features, Rows rows) {
         *         this.dateOfSeed = dateOfSeed;
         *         this.covered = covered;
         *         this.caseType = caseType;
         *         this.features = features;
         *         this.rows = rows;
         *     }
         */
//    }

//    @Test 3件登録同時にできること(){}

//    @Test 2種類の特徴で登録できること(){}
}
