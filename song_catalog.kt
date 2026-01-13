//Properties for the title, artist, year published, and play count
//A property that indicates whether the song is popular. If the play count is less than 1,000, consider it unpopular.
//A method that prints a song description in this format:
//"[Title], performed by [artist], was released in [year published]."
class Song {
    val title: String = "Good song"
    val artist: String = "Rosa"
    val year: Int = 1990
    val playCount: Int = 99099
    val isPopular: Boolean
    get() = playCount >= 1000
    fun printDescription () {
        println("$title, performed by $artist, was released in $year.")
    }
}

fun main () {
    println("hello bold")
    val songInstance = Song()
    songInstance.printDescription()
}