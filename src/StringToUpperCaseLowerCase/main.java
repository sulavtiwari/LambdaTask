package StringToUpperCaseLowerCase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<String> name =List.of("Sulav","Sushil","Anisha");
        List upperCaseMap= name.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
        System.out.println("From Map : "+upperCaseMap);

        //*************Or we can use for each loop*************
        List<String> upperCaseFor= new ArrayList<>();
        name.forEach(str->upperCaseFor.add(str.toUpperCase()));
        System.out.println("From ForEach Loop: "+upperCaseFor);
        System.out.println("");


        //########-------------lOWERCASE CONVERSION-------------------###########

        List<String> lowerCaseMap = name.stream().map(str->str.toLowerCase()).collect(Collectors.toList());
        System.out.println("Converted to LowerCase from Map : "+lowerCaseMap);


        //*************Or we can use for each loop*************
        List<String> lowerCaseFor = new ArrayList<>();

        name.forEach(str->lowerCaseFor.add(str.toLowerCase()));
        System.out.println("Converted to LowerCase from  ForEach loop"+lowerCaseFor);
    }


}
