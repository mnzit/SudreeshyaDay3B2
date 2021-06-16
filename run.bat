rmdir /s /q "build/classes/com"
javac src/com/sudreeshya/day3/Main.java -sourcepath src -d build/classes 
java -cp build/classes com.sudreeshya.day3.Main 