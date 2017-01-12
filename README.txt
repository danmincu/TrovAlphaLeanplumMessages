To run this sample setup LEANPLUM and replace the APP_ID DEV_KEY and PROD_KEY with real values

In _ApplicationClass_

if (BuildConfig.DEBUG) {
            Leanplum.setAppIdForDevelopmentMode("APP_ID", "DEV_KEY");
        } else {
            Leanplum.setAppIdForProductionMode("APP_ID", "PROD_KEY");
        }       






Leanplum instrumentation and registering for Push setup

Read the related article: https://support.leanplum.com/hc/en-us/articles/208467016-Setup-Leanplum-instrumentation-and-registering-for-Push-iOS-Android-

In this Setup article and sample we will see how setup Leanplum in a basic iOS and Android project, including guidance for configuring your project to setup Push Notifications. 
