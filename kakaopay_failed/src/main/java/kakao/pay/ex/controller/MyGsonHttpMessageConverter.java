//package kakao.pay.ex.controller;
//
//import java.util.List;
//
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.json.GsonHttpMessageConverter;
//
//public class MyGsonHttpMessageConverter extends GsonHttpMessageConverter {
//    public MyGsonHttpMessageConverter() {
//        List<MediaType> types = Arrays.asList(
//                new MediaType("text", "html", DEFAULT_CHARSET),
//                new MediaType("application", "json", DEFAULT_CHARSET),
//                new MediaType("application", "*+json", DEFAULT_CHARSET)
//        );
//        super.setSupportedMediaTypes(types);
//    }
//}