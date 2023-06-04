import okhttp3.*;

import java.io.IOException;

public class TelegramSender {

    private static final String BOT_TOKEN = "YOUR_BOT_TOKEN";
    private static final String CHAT_ID = "YOUR_CHAT_ID";

    public static void main(String[] args) {
        String message = "Hello, Telegram!";

        try {
            sendMessage(message);
            System.out.println("Message sent successfully!");
        } catch (IOException e) {
            System.err.println("Failed to send message: " + e.getMessage());
        }
    }

    private static void sendMessage(String message) throws IOException {
        OkHttpClient client = new OkHttpClient();

        HttpUrl.Builder urlBuilder = HttpUrl.parse("https://api.telegram.org/bot" + BOT_TOKEN + "/sendMessage").newBuilder();
        urlBuilder.addQueryParameter("chat_id", CHAT_ID);
        urlBuilder.addQueryParameter("text", message);
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected response code: " + response);
            }
        }
    }
}
