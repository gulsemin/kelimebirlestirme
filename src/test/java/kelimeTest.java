import org.junit.Test;
        import static org.junit.Assert.*;

public class kelimeTest {

    @Test
    public void testConcatenate() {
        kelime kelimeson = new kelime();

        String result = kelimeson.concatenate("kelime1", "kelime2");

        assertEquals("kelimeler birlesti","kelime1kelime2", result);

        System.out.println(result);

    }
}
