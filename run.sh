#!/bin/sh
rm -rf temp
mkdir temp
unzip build/distributions/WalkingSkeleton.zip -d temp/
java -cp temp/WalkingSkeleton/lib/*:temp/WalkingSkeleton/WalkingSkeleton.jar ServerStarter
