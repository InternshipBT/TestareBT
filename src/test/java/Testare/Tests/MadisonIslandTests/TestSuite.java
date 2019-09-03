package Testare.Tests.MadisonIslandTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        AddProductInCartANDAssertHF.class,
        AssertOnSearchHF.class,
        AssertOnSearchNF.class,
        DeleteItemFromCartAndAssertNF.class,
        LoginHF.class,
        LoginIncorrectPassNF.class,
        LoginNoPassNF.class,
        MadisonSearchItemDataDriven.class
})
@RunWith(Suite.class)
public class TestSuite {
}
