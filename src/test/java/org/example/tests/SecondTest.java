package org.example.tests;

import org.example.BaseTest;
import org.example.screens.TablesPage;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest {

    @Test
    public void secondTest() {
        TablesPage tablesPage = new TablesPage();
        tablesPage.verifySortChange();
    }
}
