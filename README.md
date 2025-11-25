# Country Flag App (package: `com.country_flag`)

A simple Jetpack Compose Android application that displays the **names and flags of four countries** using **Cards stacked in a Column**.

This project demonstrates:

* Using vector drawable flags
* Displaying images + text in Material 3 Cards
* Enabling dynamic color and dark theme
* Customizing card shapes & background colors
* Using a custom font (Geo)
* Changing the app launcher icon

---

## ✨ Features

* Four country cards displayed vertically (no LazyColumn)
* Each card includes:

  * Country flag (vector drawable XML)
  * Country name (Text with Geo font)
* Custom card shapes and background colors
* Material 3 dynamic theming (light + dark)
* App icon changed to a globe image

---

## 📂 Project Structure

```
app/src/main/java/com/country_flag/
  ├─ MainActivity.kt           # Entry point, loads CountryList()
  ├─ CountryCard.kt           # UI for a single country card
  ├─ CountryData.kt           # List of country data
  └─ ui/theme/Theme.kt        # Material3 theme + dynamic colors + Geo font

app/src/main/res/drawable/
  ├─ flag_japan.xml
  ├─ flag_france.xml
  ├─ flag_nigeria.xml
  └─ flag_germany.xml

app/src/main/res/font/
  └─ geo.ttf                  # Custom font

app/src/main/res/mipmap-anydpi-v26/
  └─ ic_launcher.xml          # Globe icon
```

---

## ▶️ How to Run

1. Open project in **Android Studio**.
2. Add your `geo.ttf` font file to:

   ```
   app/src/main/res/font/geo.ttf
   ```
3. Ensure your flag XML files are inside:

   ```
   app/src/main/res/drawable/
   ```
4. Build & run the app.

---

## 🖼️ Flag Vector Example (Japan)

```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="200dp"
    android:height="200dp"
    android:viewportWidth="200"
    android:viewportHeight="200">
    <path android:fillColor="#FFFFFF" android:pathData="M0,0h200v200h-200z"/>
    <path android:fillColor="#BC002D" android:pathData="M100,50a50,50 0 1,1 0,100a50,50 0 1,1 0,-100"/>
</vector>
```

---

## 🛠️ Dependencies

* Jetpack Compose
* Material 3
* Custom fonts
* Vector drawables

---

## 📄 License

Free to use for learning, teaching, or personal Android development practice.
