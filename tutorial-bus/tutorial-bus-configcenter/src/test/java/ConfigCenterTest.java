import okhttp3.*;
import org.junit.Test;

import java.io.IOException;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/2 12:22
 * @Description:
 */
public class ConfigCenterTest {
    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");
    OkHttpClient client = new OkHttpClient();

    @Test
    public void refreshTest() throws IOException {
        String url = "http://localhost:9999/bus/refresh?destination=service0:**";
        String respBodyStr = post(url, "");
        System.out.println(respBodyStr);
    }

    String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
