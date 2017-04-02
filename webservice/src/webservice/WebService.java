package webservice;




import static com.jayway.restassured.RestAssured.given; 
import java.util.List;
import java.util.Scanner;

import org.junit.Test; 
import org.junit.runner.RunWith; 
import org.junit.runners.Parameterized; 
import org.junit.runners.Parameterized.Parameters;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response; 
import com.jayway.jsonpath.*;
import org.json.*;



   public class WebService{
      public static String[] getStateDetails(String abbr) throws NoSuchFieldException {
             String[] toDisplay = new String[2];
             Response response = given()
                                     .pathParam("abbr", abbr)
                                     .when()
                                     .get("http://services.groupkt.com/state/get/USA/{abbr}");
JSONStringer a= new JSONStringer();

JSONObject jsonobject= new JSONObject(response);
             toDisplay[0]=jsonobject.getJSONObject(abbr).getString("largest_city");
             JSONObject jsonobject1= new JSONObject(response);
             toDisplay[0]=jsonobject1.getJSONObject(abbr).getString("capital");
                  
                  
                  return toDisplay;                   
         }
  

   public static void main(String[] args) throws NoSuchFieldException
   {
     Scanner scanner = new Scanner(System.in);
      
       while (true) {

           System.out.print("Enter something : ");
           String input = scanner.nextLine();

           if ("q".equals(input)) {
               System.out.println("Exit!");
               break;
           }

           System.out.println("The State Code Entered is : " + input);
           String[] result = new String[2];
           result = WebService.getStateDetails(input);
           System.out.println("And the details regarding the state  : ");
           System.out.println("1. capital city is   : "+result[1]);
           System.out.println("1. Largest city is   : "+result[0]);
           System.out.println("-----------\n");
       }

       scanner.close();

   }
          
   }
