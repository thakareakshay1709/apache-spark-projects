//Basic program to count words from readme file of this repo

val textFile = sc.textFile("D:/Programming/Scala/apache-spark-projects/README.md")

val tokenizedFileData = textFile.flatMap(line=>line.split(" "))

val countPrep = tokenizedFileData.map(word=>(word, 1))

val sortedCounts = counts.sortBy(KyPair=>kyPair._2, false)

val sortedCounts = counts.sortBy(kyPair=>kyPair._2, false)

sortedCounts.saveAsTextFile("D:/Programming/Scala/apache-spark-projects/ReadMeWordCount")