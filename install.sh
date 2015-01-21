pkill -9 java
git pull
mvn clean install
cp target/GeoLocServer-0.1.0.jar ~/rest.jar
java -jar ~/rest.jar &
