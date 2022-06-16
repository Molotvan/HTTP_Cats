//import jdk.internal.access.JavaNetUriAccess;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.jfr.ContentType;
import org.apache.http.HttpHeaders;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.util.List;

public class Main {
    public static ObjectMapper mapper = new ObjectMapper();
      public static String REMOTE_SERVER_URI = "https://raw.githubusercontent.com/netology-code/jd-homeworks/master/http/task1/cats";
      public static void main(String[] args) throws IOException {
          CloseableHttpClient httpClient = HttpClientBuilder.create()
                  .setDefaultRequestConfig(RequestConfig.custom()
                          .setConnectTimeout(5000)    // максимальное время ожидание подключения к серверу
                          .setSocketTimeout(30000)    // максимальное время ожидания получения данных
                          .setRedirectsEnabled(false) // возможность следовать редиректу в ответе
                          .build())
                  .build();
          HttpGet request = new HttpGet(REMOTE_SERVER_URI);
          //request.setHeader(HttpHeaders.ACCEPT);
          CloseableHttpResponse response = httpClient.execute(request);
          List<FactAboutCat> FAC = mapper.readValue(response.getEntity().getContent(), new TypeReference<List<FactAboutCat>>(){});
      }

}
