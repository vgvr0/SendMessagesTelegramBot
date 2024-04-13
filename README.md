# Telegram Message Sender with Java
This Java project demonstrates how to send messages to a Telegram chat using the Telegram Bot API and the OkHttp library.

## Prerequisites
Before running the code, make sure you have the following:
- Java Development Kit (JDK) installed on your system
- Telegram Bot Token obtained from the BotFather
- Chat ID of the Telegram chat where you want to send messages

## Setup
1. Clone the repository or download the source code files.
2. Open the `TelegramSender.java` file in your preferred Java IDE or text editor.
3. Replace `"YOUR_BOT_TOKEN"` with your actual Telegram Bot Token.
4. Replace `"YOUR_CHAT_ID"` with the Chat ID of the Telegram chat where you want to send messages.
5. Make sure you have the OkHttp library added to your project dependencies. You can add the following dependency to your pom.xml file if you're using Maven:
```java
xml
<dependency>
    <groupId>com.squareup.okhttp3</groupId>
    <artifactId>okhttp</artifactId>
    <version>4.10.0</version>
</dependency>
```
Alternatively, you can download the OkHttp JAR file and add it to your project's classpath.

## Usage
1. Compile the TelegramSender.java file using the following command:
```bash
javac TelegramSender.java
```
2. Run the compiled Java class using the following command:
```bash
java TelegramSender
```
3. The program will send the message "Hello, Telegram!" to the specified Telegram chat using the provided Bot Token and Chat ID.
4. If the message is sent successfully, you will see the output "Message sent successfully!" in the console. Otherwise, an error message will be displayed.

## Customization
- To change the message content, modify the message variable in the main method of the TelegramSender class.
- If you want to send messages to a different Telegram chat, update the `CHAT_ID` constant with the appropriate `Chat ID`.
- You can extend the functionality of this project by adding more methods to send different types of messages (e.g., photos, documents) or by integrating it into a larger application.

## Error Handling
The code includes basic error handling. If an exception occurs during the message sending process, an error message will be printed to the console, indicating the reason for the failure.

## Dependencies
This project relies on the following dependencies:
OkHttp: A popular HTTP client library for Java. It is used to make HTTP requests to the Telegram Bot API.
Make sure to include the necessary dependencies in your project for the code to compile and run successfully.

## References
- Telegram Bot API Documentation
- OkHttp Documentation

Feel free to explore the Telegram Bot API documentation and the OkHttp documentation for more information on how to interact with Telegram bots and make HTTP requests in Java.
