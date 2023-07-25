fun learn() {
    val doubleNum: Double = 123.78// 54 bit number
    val floatNum: Float = 123.45f// 32 bit
    val longNum: Long = 124589765L //64 bit
    val str = " may the force \t be with you "
    println(doubleNum)
    println(str)
    //when you want to display a boolean for a given text
    val contentEquals =str.contentEquals("may the force be with you")
    print(contentEquals)
    //checking if one word is in the string
    val  contains = str.contains("be",true)
    println(contains)
    val rawCrawl = """ | A long time ago,
        |in a galaxy,
        |in far fat away kingdom,
        |i was a very good girl
    """.trimMargin()
    println(rawCrawl)
    val uppercase = str.toUpperCase()
    val lowercase = str.toLowerCase()
    println(uppercase)
    println(lowercase)
    val subsequence = str.subSequence(4,13)
    println(subsequence)
}