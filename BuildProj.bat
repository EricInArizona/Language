rem @echo off

SET JAVA_HOME="C:\Javajdk"
SET JDK_HOME=%JAVA_HOME%
SET JRE_HOME="C:\Javajdk\jre"

SET CLASSPATH=C:\Javajdk\lib;C:\Javajdk\jre\lib;
SET PATH=%PATH%;%JAVA_HOME%\bin;


rem Javac *.java

rem The directory tree where these files are
rem corresponds to their Jar package tree.

rem Compile all of them.
cd \Eric\Main\MathGraph
del *.class
cls
Javac -Xlint -Xstdout Build.log *.java

type Build.log
