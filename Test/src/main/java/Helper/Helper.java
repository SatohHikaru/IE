package Helper;

import Model.UserModel;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Helper {

    public static UserModel[] getJsonFile(String fileName) {
        final String JSON_PATH = "C:\\Users\\NVVinh\\Desktop\\Auto Test Code\\IE\\Test\\src\\main\\resources\\Data\\" + fileName;
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(JSON_PATH));
            UserModel[] userModels = gson.fromJson(reader, UserModel[].class);
            return userModels;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static UserModel getDataFromJsonFile(String fileName, String userNameTest) {
        UserModel[] userModels = getJsonFile(fileName);
        for (UserModel userModel : userModels) {
            if (userModel.getUserName().equals(userNameTest)) {
                return userModel;
            }
        }
        return null;
    }
}
