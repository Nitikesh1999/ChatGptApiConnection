package de.bsi.openai.dalle.Response;

import java.util.List;
import java.util.Optional;

/*
Created Record class because A record declaration specifies in a header a description of its contents;
 the appropriate accessors, constructor, equals, hashCode, and toString methods are created automatically.
 A record's fields are final because the class is intended to serve as a simple "data carrier".
*/

public record GenerationResponse(List<ImageUrl> data) {
	
	public Optional<String> firstImageUrl() {
		if (data == null || data.isEmpty())
			return Optional.empty();
		return Optional.of(data.get(0).url);
	}
	
	record ImageUrl(String url) {

	}
	
}
/*
for more information read documentation
https://platform.openai.com/docs/api-reference/images/create
 */
