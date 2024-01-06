import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

//Author -: Thusith Wickramasinghe
public class CurrencyConverter {
    public class Main {
        public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter currency convert from:");
            String convertFrom = sc.nextLine();
            System.out.println("Enter currency convert to:");
            String convertTo = sc.nextLine();
            System.out.println("Enter quantity to convert:");
            BigDecimal quantity = sc.nextBigDecimal();

            String apiKey = "2bf5b45f9cf0a9a0580f5dfc16d94fcb";
            String urlString = "https://api.exchangerate.host/list?access_key=" + apiKey + "&base=" + convertFrom.toUpperCase();
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url(urlString).get().build();

            Response response = client.newCall(request).execute();
            String stringResponse = response.body().string();
            System.out.println("API Response: " + stringResponse);

            JSONObject jsonObject = new JSONObject(stringResponse);
            JSONObject ratesObject = jsonObject.getJSONObject("rates");
            BigDecimal rate = ratesObject.getBigDecimal(convertTo.toUpperCase());

            BigDecimal result = rate.multiply(quantity);
            System.out.println(result);
        }
    }
}
