install.packages("rvest")
library(BeautifulSoup)
library(request)
library(tidyverse)
library(rvest)

library(dplyr)


lego_movie <- html("http://www.imdb.com/title/tt1490017/")
lego_movie %>%
  html_node("strong span") %>%
  html_text() %>%
  as.numeric()

lego_movie %>%
  html_nodes("#titleCast .itemprop span") %>%
  html_text()

lego_movie %>%
  html_nodes("table") %>%
  .[[3]] %>%
  html_table()

##Google gadget
CPadmission <- read_html("https://www.calpoly.edu/admissions/first-year-student/selection-criteria/student-profile")
CPadmission %>%
  html_nodes("table") %>%
  .[[1]]%>%
  html_table()

CPadmissionOverallDF<-html_table(CPadmission)

head(CPadmissionOverallDF)

CPadmission %>%
  html_nodes("table") %>%
  .[[2]]%>%
  html_table()

admission_2<-html_table(CPadmission)
admission_2

### h2 , #book-4 a span

abebooks <- read_html("https://www.abebooks.com/servlet/SearchResults?sts=t&cm_sp=SearchF-_-home-_-Results&kn=&an=Jeff+Smith&tn=The+Frugal+Gourmet&isbn=")
bookshtml<-html_nodes(abebooks, "#srp-item-price-2 , #book-2 a span , #book-1 a span , #srp-item-price-1") 
bookstext<-html_text(bookshtml) 
print(bookstext)

price <- abebooks %>%
  html_nodes("#srp-item-price-2 , #book-2 a span , #book-1 a span , #srp-item-price-1") %>%
  html_text() %>%
  readr::parse_number()

price

edxsubjects <- read_html("https://www.edx.org/subjects") 
subjectshtml<-html_nodes(edxsubjects, ".align-items-center") 
subjecttext<-html_text(subjectshtml) 
print(subjecttext)
