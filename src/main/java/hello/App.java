package hello;
import com.google.gson.Gson;
import hello.UserSimple;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("----------app----------");

        deserializeReadUser();


        System.out.println("----------app end----------");
    }

    private static void serializeUser(){
        UserSimple userObject = new UserSimple(
                "taixingbi",
                "tb@gmail.com",
                38,
                true
        );

        Gson gson = new Gson();
        String userJson = gson.toJson(userObject);
        System.out.println("userJson"+ userJson);
    }

    private static void deserializeUser() {
        String userJson= "{\"name\":\"hunter\",\"email\":\"tb@gmail.com\",\"age\":38,\"isDeveloper\":true}";
        Gson gson = new Gson();
        UserSimple userObject = gson.fromJson(userJson, UserSimple.class);

        System.out.println("getName: "+ userObject.getName());
    }

    private static void deserializeReadUser() throws IOException {
        String fileName = "./src/test/resources/userSimple.json";
        String userJson = new String(Files.readAllBytes(Paths.get(fileName)));
        System.out.println("userJson: "+ userJson);

        Gson gson = new Gson();
        UserSimple userObject = gson.fromJson(userJson, UserSimple.class);
        System.out.println("getName: "+ userObject.getName());
    }
}
