package hello;
import com.google.gson.Gson;
import hello.UserSimple;

public class App {
    public static void main(String[] args) {
        System.out.println("----------app----------");

        deserializeUser();


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

}
