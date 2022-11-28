
# Turn Web to Android App
[![MIT License](https://shields.io/badge/Licence-MIT-green?badge&style=for-the-badge)](https://choosealicense.com/licenses/mit/)
[![Android Studio](https://shields.io/badge/Android--Studio-4.8-blue?badge&logo=androidstudio&style=for-the-badge)](https://opensource.org/licenses/)
[![Kotlin](https://shields.io/badge/Kotlin-4.8-yellow?badge&logo=kotlin&style=for-the-badge)](http://www.gnu.org/licenses/agpl-3.0)


This application turn a responsive website into an Android Apk using Android Studio.




## Screenshots

![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)


## Next steps

- Splash preview screen
- Local storage data
- Custom 404 and fail network Screen



## Install and run

Clone this project

```bash
  git clone https://link-para-o-projeto
```

Import the project into android studio


```bash
  file -> Import
```

find the ``` webScreen.kv ``` activity

Change the url myWeb function atribute 

```kotlin
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //only you need is change your url bellow
        myWeb("https://www.android.com/")


    }
```


## Change the icons and project name

Now do you want to change the project name and icons used in this tutorial. Right!


## Author

- [@Angelo Abrita](https://www.github.com/octokatherine)



