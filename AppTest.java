package com.codealpha;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testGreeting() {
        App app = new App();
        assertNotNull(app.getGreeting());
    }

    @Test
    void testAddition() {
        App app = new App();
        assertEquals(12, app.addNumbers(5, 7));
    }
}
