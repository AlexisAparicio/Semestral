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
            // Car obj = new Car();
            // obj.setName("Subaru WRX STI");
            // obj.setYear(2015);

            Cars objCars= new Cars();
            // objCars.addCar(obj);
            // objCars.addCar(obj);
            // objCars.addCar(obj);
            // objCars.addCar(obj);

            //Devuelve algo en la pagina web
            get("/wrx",(req,res)->{
                res.type("application/json");
                JSONObject jsonobj = new JSONObject(objCars);
               return jsonobj;
            });

            post("/wrx",(req,res)->{
                res.type("application/json");
                Car car = new Car();
                JSONObject body = new JSONObject(req.body());
                car.setName(body.getString("name"));
                car.setYear(body.getInt("year"));
                objCars.addCar(car);
                JSONObject jsonobj= new JSONObject(objCars);
               return jsonobj;
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