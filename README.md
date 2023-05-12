**ChatGPT API used with Java & Spring little bit of HTML, CSS and JAVASCRIPT**

**How to running it:**

1)Clone this GIT project or just download the zip file and extract it and open on your IDE

2)Make sure it is a Maven project and Maven is executed to load dependencies.

3)Create an Account at https://openai.com & log in

4)Create API key at https://beta.openai.com/account/api-keys

5)Store the key in application.properties file in cloned project.

6)Start it as Spring Boot application.

7)For chatting with ChatGPT: http://localhost:8080/

8)For drawing images with DALL-E: http://localhost:8080/image

9)Setup proxy

**If you need a proxy to communicate with Internet (ChatGPT API is in Internet), adapt ChatGptController.java like this:**

Replace: private HttpClient client = HttpClient.newHttpClient();

with: private HttpClient client = HttpClient.newBuilder().proxy(ProxySelector.of(InetSocketAddress.createUnresolved("proxy.host.com", 8080))).build();

**More information**

OpenAI API documentation: https://beta.openai.com/docs/api-reference/completions/create
