package json;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhujunjie on 2017/9/13.
 */
public class GsonUtils {

    /**
     * 字符串转化为对象
     *
     * @param str
     * @param clazz 转化的类
     * @param <T>
     * @return
     */
    public static <T> T str2Obj(String str, Class<T> clazz) {
        Gson gson = new Gson();
        T t = gson.fromJson(str, clazz);
        return t;
    }

    /**
     * 将Map转化为Json
     * @param map
     * @return String
     */
    public static <T> String map2Json(Map<String, T> map) {
        Gson gson = new Gson();
        if (map == null) {
            return null;
        }
        String jsonStr = gson.toJson(map);
        return jsonStr;
    }

    /**
     *  json字符串数组转化为set集合
     * @param str 待转化的json字符串数组（每个元素不能为json对象）
     * @return
     */
    public static Set<String> str2SetString(String str) {
        Set<String> set = new HashSet<String>();
        JsonArray jsonArray = new Gson().fromJson(str, JsonArray.class);
        Iterator<JsonElement> iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JsonElement next = iterator.next();
            String value = next.getAsString();
            set.add(value);
        }
        return set;
    }

    /**
     * 任意类型的json字符串数据类型转化
     * @param str json字符串
     * @param t 要转化的类型
     * @param <T> 类型
     * @return 返回对应类型数据
     */
    public static <T> T fromJson2Obj(String str,T t){
        Type type = new TypeToken<T>() {}.getType();
        T data = (T) new Gson().fromJson(str, type);
        return data;
    }

    /**
     * 对象转化为json
     * @param t
     * @param <T>
     * @return
     */
    public static <T> String Obj2Json(T t) {
        String json = new Gson().toJson(t);
        return json;
    }

}
