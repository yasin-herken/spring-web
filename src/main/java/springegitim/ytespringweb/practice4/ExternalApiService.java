package springegitim.ytespringweb.practice4;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springegitim.ytespringweb.example.MyFirstBean;

@Service
public class ExternalApiService {
    private MyFirstBean myFirstBean;

    @Autowired
    public ExternalApiService(final MyFirstBean myFirstBean) {
        this.myFirstBean = myFirstBean;
    }

    public void getRestResponse() {
        myFirstBean.sendGetRequest();
    }

    public UserResponseDTO getPostResponse(@Valid UserDto userDto) {
        return myFirstBean.sendPostRequest(userDto);
    }
}
