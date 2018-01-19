set projectLocation=C:\Users\madhubabuv\eclipse-workspace\TestNGSample
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%/lib/*
java TestNGAssertions %projectLocation%\testng.xml
pause