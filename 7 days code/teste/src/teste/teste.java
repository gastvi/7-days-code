package a;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class teste {
	public static void main(String[] args) {
		
	
	HttpClient client = HttpClient.newHttpClient();
	HttpRequest request = HttpRequest.newBuilder()
	      .uri(URI.create("http://openjdk.org/"))
	      .build();
	client.sendAsync(request, BodyHandlers.ofString())
	      .thenApply(HttpResponse::body)
	      .thenAccept(System.out::println)
	      .join();
	}
}
