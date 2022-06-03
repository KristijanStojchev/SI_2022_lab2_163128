import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    void EveryStatementtest()
    {
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(Collections.emptyList()));
        IllegalArgumentException iex ;
        iex =assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList("0", "#", "0", "0", "#")));
        assertTrue(iex.getMessage().contains("List length should be a perfect square"));
        assertEquals(Arrays.asList("#", "3", "#", "3", "#", "2", "#", "2", "0"), SILab2.function(Arrays.asList("#", "0", "#", "0", "#", "0", "#", "0", "0")));
    }

    @Test
    void EveryBranchStatement()
    {
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(Collections.emptyList()));
        IllegalArgumentException iex ;
        iex =assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList("0", "#", "0", "0", "#")));
        assertTrue(iex.getMessage().contains("List length should be a perfect square"));
        assertEquals(Arrays.asList("#", "3", "#", "3", "#", "2", "#", "2", "0"), SILab2.function(Arrays.asList("#", "0", "#", "0", "#", "0", "#", "0", "0")));
    }
}
