set basePath=D:\work\Alkaid\alltest\alltest-common\target\classes

del performance.jar

mkdir com\alkaid\common\perfmon
xcopy /S %basePath%\com\alkaid\common\perfmon\Performance.class com\alkaid\common\perfmon\

jar -xvf postgresql-9.4.1208.jar
jar cvfm performance.jar MANIFEST.MF com\* org\*

rmdir /S /Q .\com
rmdir /S /Q .\org

pause
