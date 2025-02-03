package ru.netology.yavaqa.javapackage.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    public void workandrestscheduletest() {
        BonusService service = new BonusService();
        int count = 3;
        int amount = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(amount, count);
    }

}
