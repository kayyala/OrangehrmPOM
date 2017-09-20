package com.orange.Testcase;

import com.orangehrm.Pages.HomePage;
import org.testng.annotations.Test;

/**
 * Created by Sudhakar on 20/09/2017.
 */
public class Add_Newemp {
HomePage homePage= new HomePage();

    @Test
    public void addnewemp() {
        
homePage.addemp();


    }
}
