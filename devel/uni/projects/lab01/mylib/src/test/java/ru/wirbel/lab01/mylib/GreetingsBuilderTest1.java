package ru.wirbel.lab01.mylib;

import org.junit.*;

/**
 * Unit test for GreetingsBuilder class.
 */
public class GreetingsBuilderTest1 {

    // Âûïîëíÿåòñÿ îäèí ðàç äî âûïîëíåíèÿ òåñò-ìåòîäîâ, íàïðèìåð, äëÿ ñîåäèíåíèÿ ñ ÁÄ, èíèöèàëèçàöèè ïóëà ñîåäèíåíèé
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }

    // Âûïîëíÿåòñÿ îäèí ðàç óæå ïîñëå âûïîëíåíèÿ âñåõ òåñò-ìåòîäîâ, íàïðèìåð, äëÿ çàêðûòèÿ ñîåäèíåíèÿ
    // è îñâîáîæäåíèÿ äðóãèõ ðåñóðñîâ
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }

    // Âûïîëíÿåòñÿ ïåðåä êàæäûì òåñò-ìåòîäîì
    // Ïîçâîëÿåò, íàïðèìåð, ñîçäàòü íîâûé ýêçåìïëÿð îáúåêòà, íåîáõîäèìîãî òåñò-ìåòîäó
    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }

    // Âûïîëíÿåòñÿ ïîñëå êàæäîãî òåñò-ìåòîäà
    @After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }

    @Test
    public void testGreetingsBuilder1() {
        System.out.println("@Test - run testGreetingsBuilder1");

        String expectedValue = "Привет, Андрей!";

        GreetingsBuilder greetings = new GreetingsBuilder();
	
        String value = greetings.to("Андрей")
                .withLanguage(Greetings.LANGUAGE_RU)
                .withStyle(Greetings.STYLE_FRIENDLY)
                .build();

        Assert.assertEquals(expectedValue, value);
    }

    @Test
    public void testGreetingsBuilder2() {
        System.out.println("@Test - run testGreetingsBuilder2");
        Assert.assertTrue(true);
    }
}
