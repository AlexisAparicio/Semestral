package com.hello;
import static spark.Spark.*;
import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App 
{
        public static void main(String[] args) 
        {
            Car obj = new Car();
            obj.setName("Subaru WRX STI");
            obj.setYear(2015);
          
            //Devuelve algo en la pagina web
            get("/wrx",(req,res)->{
                res.type("application/json");
                JSONObject jsonobj = new JSONObject(obj);
               return jsonobj;
            });

            post("/wrx",(req,res)->{
                res.type("application/json");
               return req.body();
            });

            get("/",(req,res)->{
            res.type("application/json");
            return "{\"message\":\"Custom 404\"}";
            });

        }
    }
    


    // Pyramides pyramide = new Pyramides();
            // get("/",(req,res)->
            // {

            //     res.type(ContentType:"application/json");
            //     // res.type(contentType:"application/json");
            //     JSONObject obj = new JSONObject(pyramides);
            //     return obj;
                
            // });
            // JSONObject body = new JSONObject(req.body());