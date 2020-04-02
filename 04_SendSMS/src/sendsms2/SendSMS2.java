package sendsms2;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * @author Philippe SIMIER
 */
public class SendSMS2 {

    public static void main(String[] args) throws UnirestException {
        Unirest.setTimeouts(0, 0);
        HttpResponse<JsonNode> response = Unirest.post("http://touchardinforeseau.servehttp.com/Ruche/api/sendSMS")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .field("key", "O7VZJ5LOABU")
                .field("number", "0689744235")
                .field("message", "un test en Java")
                .asJson();
        System.out.print("Réponse du serveur : ");
        System.out.println( response.getStatus() );
        System.out.println( response.getBody() );
    }   
}
