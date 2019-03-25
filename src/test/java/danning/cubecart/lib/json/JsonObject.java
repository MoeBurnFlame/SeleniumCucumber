package danning.cubecart.lib.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonObject {
  Map<String, String> values;

  public JsonObject() {
    File file = new File("danning.cubecart.json");
      //createJsonFile();
      loadJsonFile();
  }

  private void createJsonFile() {
    ObjectMapper mapper = new ObjectMapper();
    CubeCartLib lib = new CubeCartLib();
    try {
      mapper.writeValue(new File("danning.cubecart.json"), lib);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void loadJsonFile(){
    ObjectMapper mapper = new ObjectMapper();
    try {
      values = mapper.readValue(new File("danning.cubecart.json"), HashMap.class);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  public Map get() {
    return values;
  }

}
