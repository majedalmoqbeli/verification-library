# Verification-Library-Android
This library to verification the username and email .. etc

# Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

  `allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
  `

# Step 2. Add the dependency 

	`dependencies {
	        implementation 'com.github.majedalmoqbeli:verification-library:1.0'
	}
  `
  
  # Example : 
  
  You can call the Verification class in any activity , there is two function :
  
  1 ) isValidUsername : this function to check if the user name is valid.
  
  2 ) isValidEmail : this function to check if the email is valid.
  
  ```
  
  if(Verification.isValidUsername(txt)){
      Toast.makeText(this, "User Name Is Valid", Toast.LENGTH_SHORT).show();
  } else {
    Toast.makeText(this, "Not Valid User Name", Toast.LENGTH_SHORT).show();
  }
  ```
  
  
  #         with my love ♥.

  
