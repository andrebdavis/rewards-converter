import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        double milesValue = 5000.0;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue * 0.0035, rewardValue.getCashValue(), 0.001);
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 75.0;
        RewardValue rewardValue = new RewardValue(cashValue);

        // When
        double convertedMiles = rewardValue.cashToMiles(cashValue);

        // Then
        double expectedMiles = cashValue / 0.0035;
        assertEquals(expectedMiles, convertedMiles, 0.001);
    }

    @Test
    void convert_from_miles_to_cash() {
        
    }
}
