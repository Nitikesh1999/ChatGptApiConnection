package de.bsi.openai.dalle.Request;

/*
Created Record class because A record declaration specifies in a header a description of its contents;
 the appropriate accessors, constructor, equals, hashCode, and toString methods are created automatically.
 A record's fields are final because the class is intended to serve as a simple "data carrier".
*/

public record GenerationRequest(String prompt, int n, 
		String size, String response_format) {
	
	public static GenerationRequest defaultWith(String prompt) {
		return new GenerationRequest(prompt, 1, "1024x1024", "url");
	}
	
}
/*why prompt,int,size was taken as parameter because
while using ChatGpt Api we need to have that parameter in request body
 */

/*
for more information read documentation
https://platform.openai.com/docs/api-reference/images/create
 */

