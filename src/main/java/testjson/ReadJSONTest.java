package testjson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class ReadJSONTest {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try (FileReader fileReader = new FileReader("employee.json")){
            //read JSON file
            Object obj = jsonParser.parse(fileReader);
            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);
            //Iterate over employee array
            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public static void parseEmployeeObject(JSONObject employee){
        JSONObject employeeObject = (JSONObject) employee.get("employee");
        String firstName = (String) employeeObject.get("firstName");
        System.out.println(firstName);
        String lastName = (String) employeeObject.get("LastName");
        System.out.println(lastName);
        String website = (String) employeeObject.get("website");
        System.out.println(website);
    }
}
