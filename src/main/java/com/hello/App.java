package com.hello;
import static spark.Spark.*;
import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App 
{
        public static void main(String[] args) {
            get("/wrx", (req, res) -> "Hello World test try");
            post ("/wrx",(req,res)->"Hello");
            
            //Devuelve algo en la pagina web
            get("/",(req,res)->
            {
                return "Root";
            });

            get("/",(req,res)->{
            res.type("application/json");
            return "{\"message\":\"Custom 404\"}";
            });

            // Pyramides pyramide = new Pyramides();
            // get("/",(req,res)->
            // {
            //     res.type(ContentType:"application/json");
            //     // res.type(contentType:"application/json");
            //     JSONObject obj = new JSONObject(pyramides);
            //     return obj;
                
            // });

            // JSONObject body = new JSONObject(req.body());
        }
    }
    
