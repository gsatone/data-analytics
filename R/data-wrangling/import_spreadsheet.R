getwd()
path <- system.file("extdata", package = "dslabs")
list.files(path)

filename <- "murders.csv"
fullpath <- file.path(path, filename)
fullpath

file.copy(fullpath, getwd())

file.exists(filename)

#Reading a file
library(dslabs)
library(tidyverse)
library(readxl)

#inspect first 3 lines
read_lines("murders.csv", n_max = 3)
#read file in csv format
dat <-read_csv(filename)

#read using full path
dat <- read_csv(fullpath)
head(dat)

path <- system.file("extdata", package = "dslabs")
files <- list.files(path)
files

filename <- "murders.csv" 
filename1 <- "life-expectancy-and-fertility-two-countries-example.csv"
filename2 <- "fertility-two-countries-example.csv" 

dat <- read.csv(file.path(path, filename))
dat1 <- read.csv(file.path(path, filename1))
dat2 <- read.csv(file.path(path, filename2))

head(dat)
head(dat1)
head(dat2)

##Importing using R-base 
dat3 <- read.csv(filename)
class(dat3$abb)
class(dat3$region)


