package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
//    Before/After will run before any scenario, applied to all feature files. If no tags added
    @Before("@NetBanking")
    public void netBankingSetup()
    {
        System.out.println(("********************************"));
        System.out.println(("setup the entries in NetBanking DB"));
    }

    @After
    public void tearDown()
    {
        System.out.println(("clear the entries"));
    }

    @Before("@Mortgage")
    public void mortgageSetup()
    {
        System.out.println(("********************************"));
        System.out.println(("setup the entries in Mortgage DB"));
    }
}
//Before -> Background -> Scenario -> After