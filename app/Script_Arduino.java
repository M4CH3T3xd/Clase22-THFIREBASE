
#include <FirebaseESP8266.h>
#include <ESP8266Wifi.h>

#define FIREBASE_HOST "https://temperatura-82c59-default-rtdb.firebaseio.com"
#define FIREBASE_AUTH "mcWIYSVV3ESBAsRqzF0vKyefG9TyDOiPm7FctMQg"
FirebaseData mydb;
String ruta = "Sensor";

const char* ssid = "" // Nombre de la Red
const char* pass = "" // Contraseña de la Red

#include "DHT.h"
#define DHTPIN 2
#define DHTTYPE DHT11
DHT dht (DHTPIN, DHTTYPE);

float h;
float t;

void setup() {
  Serial.begin(115200);

  //conexion wifi
  Wifi.begin(ssid, pass);
  delay(1000);
  Serial.print("Se esta conectando a la red ");
  Serial.print(ssid);
  /* Mientras se realiza la conexion a la red apareceran ....
  while(Wifi.status() != WL_CONNECTED){
          delay(1000);
          Serial.print(".")
          }
          /* con la conexion ya realizada se imprimen algunos datos
          Serial.println("");
          Serial.println("WIFI connected");
          Serial.println("Ip address: ");
          Serial.println(Wifi.localIP());

          dht.begin();

          //Conexion a Firebase
          Firebase.begin(FIREBASE_HOST, FIREBASE_AUTH);
          Firebase.reconnectWifi(true);
          }

          void loop() {

          delay(1000);
          h = dht.readHumidity();
          t = dht.readTemperature();

          Serial.print("Humedad: ");
          Serial.print(h);
          Serial.print(" , Temperatura: ");
          Serial.print(t);
          Serial.print("");

          if(!isnan(h) && !isnan(t)){
          Firebase.setInt(mydb, ruta + "/Temperatura", t);
          Firebase.setInt(mydb, ruta + "/Humedad", h);
          }
          }
 */