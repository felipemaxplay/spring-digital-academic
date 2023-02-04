package br.com.felipemaxplay.digitalacademic.config.jackson;

import br.com.felipemaxplay.digitalacademic.config.jackson.deserializer.LocalDateDeserializer;
import br.com.felipemaxplay.digitalacademic.config.jackson.deserializer.LocalDateTimeDeserializer;
import br.com.felipemaxplay.digitalacademic.config.jackson.serializer.LocalDateSerializer;
import br.com.felipemaxplay.digitalacademic.config.jackson.serializer.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ObjectMapperConfig implements Jackson2ObjectMapperBuilderCustomizer {

    @Override
    public void customize(Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder) {
        jackson2ObjectMapperBuilder.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .serializerByType(LocalDate.class, new LocalDateSerializer())
                .serializerByType(LocalDateTime.class, new LocalDateTimeSerializer())
                .deserializerByType(LocalDate.class, new LocalDateDeserializer())
                .deserializerByType(LocalDateTime.class, new LocalDateTimeDeserializer());
    }
}
