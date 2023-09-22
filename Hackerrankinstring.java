import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
    
    //Brute Force Way 
    for(char i = [i] ; i < s; i++){
        if (char[0]!= "H"){
            return "NO"
        }
        else if(next.char != "A" || "C"){
            return "NO"
        }
        else if(next.char != "C" || "K"){
            return "NO"
        }
        else if(next.char != "K" || "E"){
            return "NO"
        }
        else if(next.char != "E" || "R"){
            return "NO"
        }
        else if(next.char != "R" || "A"){
            return "NO"
        }
        else if(next.char != "A" || "N"){
            return "NO"
        }
        else if(next.char != "N" || "K"){
            return "NO"
        }
        else{
            return "YES"
        }
        }
    }
    
    //Recursive Try 
    
    for (i : s); 
    //Base Case 
    if(i[0] != "H")
        return "NO"
    
    //Recursive Case
    else {
        s.char[i] - 1 == s.char[i] + 1 
    }
    Return true;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            String result = Result.hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
