-injars 'C:\Users\Corsair\Documents\GitHub\osrs-client\obfuscate\EdgevilleClientIn.jar'
-outjars 'C:\Users\Corsair\Documents\GitHub\osrs-client\obfuscate\EdgevilleClient.jar'

-libraryjars 'C:\Program Files (x86)\Java\jre1.8.0_91\lib\rt.jar'

-dontskipnonpubliclibraryclassmembers
-dontshrink
-dontoptimize
-dontnote
-dontwarn

-verbose

-keep class Loader {
    public static void main(...);
}

-keepclasseswithmembernames,includedescriptorclasses class * {
    native <methods>;
}

-keep class mypackage.MyCallbackClass {
    void myCallbackMethod(java.lang.String);
}

-keep class mybeans.** {
    void set*(***);
    void set*(int, ***);

    boolean is*(); 
    boolean is*(int);

    *** get*();
    *** get*(int);
}