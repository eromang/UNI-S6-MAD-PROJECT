# Android Developer Fundamentals

## Resources

- [Android Developer Fundamentals](https://developer.android.com/courses/fundamentals-training/overview-v2)
- [Codelabs for Android Developer Fundamentals](https://developer.android.com/courses/fundamentals-training/toc-v2)
- [Android Developer Fundamentals (Version 2) — Concepts](https://google-developer-training.github.io/android-developer-fundamentals-course-concepts-v2/)
- [Android API reference](https://developer.android.com/reference)

## Unit 1: Get started

### Lesson 1: Build your first app

By convention, log tags are defined as constants for the Activity:

```java
private static final String LOG_TAG = MainActivity.class.getSimpleName();

Log.d(LOG_TAG, "Hello World"); 
```
### Lesson 2: Activities and intents

#### Lifecycle and state

- Start of application
    - onCreate
    - onStart
    - onResume
- Rotation of application and re-rotation
    - onPause
    - onStop
    - onDestroy
    - onCreate
    - onStart
    - onResume
- Background or sleeping
    - onPause
    - onStop
- Forground or wakeup
    - onRestart
    - onStart
    - onResume
- Kill
    - onPause
    - onStop
    - onDestroy
- Intent to secondActivity from MainActivity
    - MainActivity : onPause
    - SecondActivity : onCreate
    - SecondActivity : onStart
    - SecondActivity : onResume
    - MainActivity : onStop
- Back with back button from SecondActivity to MainActivity
    - SecondActivity : onPause
    - MainActivity : onDestroy
    - MainActivity : onCreate
    - MainActivity : onStart
    - MainActivity : onResume
    - SecondActivity : onStop
    - SecondActivity : onDestroy
- Back with the narrow from SecondActivity to MainActivity
    - SecondActivity : onPause
    - MainActivity : onRestart
    - MainActivity : onStart
    - MainActivity : onResume
    - SecondActivity : onStop
    - SecondActivity : onDestroy


To keep from losing data in an Activity when it is unexpectedly destroyed and recreated, you need to implement the **onSaveInstanceState()** method. The system calls this method on your Activity (between **onPause()** and **onStop()**) when there is a possibility the Activity may be destroyed and recreated.




