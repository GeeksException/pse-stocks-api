package org.geeksexception.pse.stocks.api.deserializer;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class CustomJsonDoubleDeserializer extends JsonDeserializer<Double> {

	@Override
	public Double deserialize(JsonParser jsonParser, DeserializationContext arg1)
			throws IOException, JsonProcessingException {

		try {
			return DecimalFormat.getInstance().parse(jsonParser.getText()).doubleValue();
		} catch (ParseException e) { return 0D; }
		
	}
	
}