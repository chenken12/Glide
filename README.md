# Glide, Assignment #3

## Synopsis

Glide is an Image Loader. It can be used to load any type of images (png, jpg, etc) and it can also use gif. It's mostly use inside android application. It is fast and easy to use. It can have extra placeholder image so to have an image in place when it fetching from the urls. There a error image so if the url is dead it will use that image instead. Glide also have build in crop, resizing the image and alot of other little effects.

## Code Example

### Setup

Create a new project or an emptyActivity in Android Studio

Add to your `app/build.gradle` file and sync:
```
dependencies {
    implementation 'com.github.bumptech.glide:glide:4.7.1'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.7.1'
}
```

Next inside your `AndroidManifest.xml` file add this line single:
```
<uses-permission android:name="android.permission.INTERNET" />
```

### Basic Setup, can only load image from url
Then inside `activity_main.xml` or the the page you want, add a ImageView:
```
<ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:scaleType="centerCrop"
        android:id="@+id/img1"/>
```

Finally inside the `MainActivity.java` file :
```
import com.bumptech.glide.Glide;
```
```
ImageView img = (ImageView) findViewById(R.id.img1);
String urls = "https://cdn.saultonline.com/wp-content/uploads/2017/01/humber.jpg";
Glide.with(this).load(urls).into(img);
```
import glide and add the code to onCreate. Replace to string with the url for your choice. This currenttly only loads a url from the web and nothing else.

### Advanced Setup
If you want more customization for example, resize, crop and etc. This use `GlideApp` and not `Glide`

First create a new java class called `MyAppGlide.java` and inside we will put:
```
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

@GlideModule
public class MyAppGlide extends AppGlideModule {
    // leave empty
}
```

Now you can replace `Glide` with `GlideApp`.
To crop and/or resize an image:
```
GlideApp.with(this)
    .load(urls)
    .override(800, 600)
    .centerCrop()
    .into(img);
```
Adding a error image and/or placeholder image:
```
GlideApp.with(this)
    .load(urls)
    .placeholder(R.drawable.placeholder)
    .error(R.drawable.error404)
    .into(img);
```
For when url image didn't load yet and when url fail to get image


## Motivation

Glide exist because it makes grabbing images from a url fast and easy to use. There are time when it better to get a image from an url then to download the image.
Glide developed by bumptech.
It is a library that recommended by Google

## Installation

Provide code examples and explanations of how to get the project.


## Tests

This is the url link to the image I used
https://cdn.saultonline.com/wp-content/uploads/2017/01/humber.jpg
<img src="https://raw.githubusercontent.com/chenken12/Glide/master/Images/working_link.PNG">
when the link is working

when I broken url link https://cdn.se.com/wp-content/uds/2017/01/humber.jpg
<img src="https://raw.githubusercontent.com/chenken12/Glide/master/Images/broken_link.PNG">

## References
* https://github.com/bumptech/glide
* https://www.dev2qa.com/android-glide-example/
* https://github.com/codepath/android_guides/wiki/Displaying-Images-with-the-Glide-Library
* https://www.youtube.com/watch?v=E0YgCRnK_6c
* https://www.youtube.com/watch?v=LJw44pBrLGU


