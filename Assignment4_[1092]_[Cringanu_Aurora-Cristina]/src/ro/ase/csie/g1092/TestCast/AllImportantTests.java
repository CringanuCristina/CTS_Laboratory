package ro.ase.csie.g1092.TestCast;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.csie.g1092.TestCast.testCategory.ImportantTest;
import ro.ase.csie.g1092.TestCast.testCategory.PerformanceTest;

@RunWith(Categories.class)
@IncludeCategory({ImportantTest.class})
@SuiteClasses({ TestMethods.class, TestMethodsMore.class, TestProduct.class })
public class AllImportantTests {

}
