SOAP CXF Service — TP Apache CXF + WS-Security
Ce TP illustre la création d’un service SOAP complet en Java, en utilisant Apache CXF, JAX-WS, JAXB, et une première couche d’authentification WS-Security UsernameToken.
Il couvre l’ensemble du flux code-first → WSDL → client → sécurité.

📌 Objectifs pédagogiques
Dans ce TP, vous allez apprendre à :

Concevoir un service SOAP avec JAX-WS.

Exposer un endpoint SOAP via Apache CXF.

Comprendre et exploiter un WSDL (types, messages, portType, binding, service).

Sérialiser des objets Java en XML grâce à JAXB.

Générer ou écrire un client SOAP et consommer le service.

Tester le service depuis SoapUI.

Ajouter la sécurité WS-Security UsernameToken côté serveur.

📁 Structure du projet
soap-cxf-service/
│
├── src/main/java
│   ├── com.example.api
│   │     └── HelloService.java          (interface @WebService)
│   │
│   ├── com.example.impl
│   │     └── HelloServiceImpl.java      (logique métier)
│   │
│   ├── com.example.model
│   │     └── Person.java                (POJO JAXB)
│   │
│   ├── com.example.security
│   │     └── UTPasswordCallback.java    (WS-Security Password Callback)
│   │
│   ├── com.example
│         ├── ServerApp.java             (endpoint simple non sécurisé)
│         └── SecureServer.java          (endpoint sécurisé WS-Security)
│
├── pom.xml
│
└── README.md
🚀 1. Lancer le serveur SOAP
🔹 Endpoint non sécurisé
mvn exec:java -Dexec.mainClass="com.example.ServerApp"


Accessible sur :
👉 http://localhost:8080/services/hello?wsdl

🔹 Endpoint sécurisé (UsernameToken)
mvn exec:java -Dexec.mainClass="com.example.SecureServer"


WSDL sécurisé :
👉 http://localhost:8080/services/hello-secure?wsdl
<p align="center">
  <img src="https://github.com/YASSMINEOUQUELLI12/tp12/blob/main/tp12.PNG" width="450">
  <img src="https://github.com/YASSMINEOUQUELLI12/tp12/blob/main/TP121.PNG" width="450">
  <img src="https://github.com/YASSMINEOUQUELLI12/tp12/blob/main/soapui.PNG" width="450">
  <img src="https://github.com/YASSMINEOUQUELLI12/tp12/blob/main/soapui1.PNG" width="450">
</p>
