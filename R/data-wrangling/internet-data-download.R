url <- "https://raw.githubusercontent.com/rafalab/dslabs/master/inst/extdata/murders.csv"
dat <- read_csv(url)
download.file(url, "murders.csv")
tempfile()

tmp_filename <- tempfile()
download.file(url, tmp_filename )
dat <- read_csv(tmp_filename)
file.remove(tmp_filename)

print("**************** Here is the result ************")
race_times <- read_csv("times.txt")
race_times

race_times <- read.csv("times.txt")
race_times

race_times <- read_csv("times.txt", col_names = TRUE)
race_times

race_times <- read_delim("times.txt", delim = ",")
race_times

library(tidyverse)
url <- "http://mlr.cs.umass.edu/ml/machine-learning-databases/breast-cancer-wisconsin/wdbc.data"

dat <- read_csv(url,col_names = FALSE)
view(dat)


