package app.metatron.discovery.domain.workbook.configurations.field;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import static app.metatron.discovery.domain.workbook.configurations.field.MeasureField.AggregationType.COUNT;

@JsonTypeName("count")
public class CountField extends MeasureField {

  public final static String DEFAULT_COUNT_FIELD_NAME = "__count";

  public CountField() {
  }

  @JsonCreator
  public CountField(@JsonProperty("alias") String alias,
                    @JsonProperty("ref") String ref) {
    super(DEFAULT_COUNT_FIELD_NAME, alias, ref, COUNT.name(), null, null);
  }

}
