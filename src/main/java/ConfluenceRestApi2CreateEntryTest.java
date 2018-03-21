import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.IOException;
import java.nio.file.Paths;

@RunWith(JUnit4.class)
public class ConfluenceRestApi2CreateEntryTest {

    @Test
    public void toHtml() throws IOException {
        String res = ConfluenceRestApi2CreateEntry.toHtml(Paths.get("C:\\my\\hot-fix.md"));
        System.out.println(res);
    }

}
