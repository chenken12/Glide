# Glide

## Synopsis

Glide is an Image Loader. It can be used to load any type of images (png, jpg, etc). It's mostly use inside android application. It is fast and easy to use. It can have extra placeholder image so to have an image in place when it fetching from the urls. There a error image so if the url is dead it will use that image instead. Glide also have build in crop, resizing the image and alot of other little effects.

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

Finally inside the `MainActivity.java` file import glide and add the code to onCreate:
```
import com.bumptech.glide.Glide;
```
```
ImageView img = (ImageView) findViewById(R.id.img1);
String urls = "https://cdn.saultonline.com/wp-content/uploads/2017/01/humber.jpg";
Glide.with(this).load(urls).into(img);
```

## Motivation

A short description of the motivation behind the creation and maintenance of the project. This should explain **why** the project exists.

## Installation

Provide code examples and explanations of how to get the project.

## API Reference

Depending on the size of the project, if it is small and simple enough the reference docs can be added to the README. For medium size to larger projects it is important to at least provide a link to where the API reference docs live.

## Tests

Describe and show how to run the tests with code examples.

## Contributors

Let people know how they can dive into the project, include important links to things like issue trackers, irc, twitter accounts if applicable.

## License
