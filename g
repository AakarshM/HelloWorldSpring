#!/bin/bash


bold=$(tput bold)
normal=$(tput sgr0)

git add *  > /dev/null
echo ${bold}"Adding files"${normal}
git commit -m "commit"  > /dev/null
echo ${bold} "Comitting to git"${normal}
git push origin master  > /dev/null
echo ${bold} "Pushed to origin/master"${normal}
git status > /dev/null
