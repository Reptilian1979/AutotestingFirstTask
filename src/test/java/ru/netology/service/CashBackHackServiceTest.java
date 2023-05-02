package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashBackHackServiceTest {

    @org.testng.annotations.Test
    public void ShouldStart() {
        CashBackHackService service = new CashBackHackService();

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void ShouldReturn750() {
        CashBackHackService service = new CashBackHackService();

        int amount = 250;

        int expected = 750;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void ShouldReturn1() {
        CashBackHackService service = new CashBackHackService();

        int amount = 1999;

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void ShouldFinish() {
        CashBackHackService service = new CashBackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

}