# testLibrary
This a test project for practicing how create an Android library


# Gradle
Step 1. Add the JitPack repository to your build file

```Groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  
  Step 2. Add the dependency
  
  ```Groovy
  
  dependencies {
	        implementation 'com.github.mihabgit:Test_Library:1.0.1'
	}
  
  ```
  
  # Maven
  Step 1. Add the JitPack repository to your build file
  
  ```Groovy
  <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  ```
  
  Step 2. Add the dependency
  
  ```Groovy
  <dependency>
	    <groupId>com.github.mihabgit</groupId>
	    <artifactId>Test_Library</artifactId>
	    <version>1.0.0</version>
	</dependency>
  ```
