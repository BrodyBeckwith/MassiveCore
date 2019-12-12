# MassiveCore
MassiveCore is a Bukkit plugin development library that can be used by other plugins for easy serialization, JSON 
storage, command creation, and more.

## Building
#### Requirements
* JDK 8+
* [Spigot 1.15](https://www.spigotmc.org/) installed in your local Maven repository

```
git clone https://github.com/BrodyBeckwith/MassiveCore.git
cd MassiveCore
./gradlew build
```
The built jar will be in `build/libs/`.

## Usage
MassiveCore does not have a remote maven repository where builds are stored so before adding it as a dependency in one 
of your plugins you must run `./gradlew publishToMavenLocal` to install it to your local maven repository.
#### Gradle
```
repositories {
    mavenLocal()
}

dependencies {
    compileOnly 'com.massivecraft.massivecore:MassiveCore:2.15-SNAPSHOT'
}
```
#### Maven
```
<dependencies>
    <dependency>
        <groupId>com.massivecraft.massivecore</groupId>
        <artifactId>MassiveCore</artifactId>
    </dependency>
</dependencies>
```
