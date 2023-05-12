package de.bsi.openai.chatgpt.Response;

import java.util.List;
import java.util.Optional;

/*
Created Record class because A record declaration specifies in a header a description of its contents;
 the appropriate accessors, constructor, equals, hashCode, and toString methods are created automatically.
 A record's fields are final because the class is intended to serve as a simple "data carrier".
*/

/*
In response body we have to provide two parameter usage and list of choices
whether it is string,image,audio etc but in India only text format is supported
 */
public record ResponseBody(Usage usage, List<Choice> choices) {
	
	public Optional<String> firstAnswer() {
		if (choices == null || choices.isEmpty())
			return Optional.empty();
		return Optional.of(choices.get(0).text);
	}
	
	record Usage(int total_tokens, int prompt_tokens, int completion_tokens) {}

	
	record Choice(String text) {}
}
/*
for more information read documentation
https://platform.openai.com/docs/api-reference/completions/create
 */
