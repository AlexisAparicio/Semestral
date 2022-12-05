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
            // get("/wrx", (req, res) -> "Hola Mundo");
           // post ("/wrx",(req,res)->"Hello");

            //Devuelve algo en la pagina web
            get("/wrx",(req,res)->{
                res.type("application/json");
               return "{\"message\":\"Custom 500 handling\"}";
            });

            post("/wrx",(req,res)->{
                res.type("application/json");
               //return "{\"message\":\"Custom 500 handling\"}";
               return req.body();
            });

            // {
            //     return "Root";
            // });

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
    
