import static spark.Spark.*;

public class Api {
    public static void main(String[] args) {
        get("/", (req, res) -> "Api FleaMarket");
        get("/hello", (req, res) -> "Hello World");
    }


}
