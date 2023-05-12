package de.bsi.openai.chatgpt.Request;

/*
Created Record class because A record declaration specifies in a header a description of its contents;
 the appropriate accessors, constructor, equals, hashCode, and toString methods are created automatically.
 A record's fields are final because the class is intended to serve as a simple "data carrier".
*/

public record RequestBody(String model, String prompt,
						  double temperature, int max_tokens) {
	
	public static RequestBody defaultWith(String prompt) {
		return new RequestBody("text-davinci-003", prompt, 0.7, 100);
	}
	
}
/*why model,prompt,temperature,max_token was taken as parameter because
while using ChatGpt Api we need to have that parameter in request body
 */

/*
for more information read the documentation of chatGpt Api Reference
https://platform.openai.com/docs/api-reference/completions/create
 */
