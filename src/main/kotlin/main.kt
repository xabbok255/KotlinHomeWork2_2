fun makeLikeWord(likes: UInt): String {
    val likeWordForm1 = "лайк"
    val likeWordForm2 = "лайка"
    val likeWordForm3 = "лайков"

    val lastDigit = likes.toString().last().digitToInt()
    val lastTwoDigits = likes.toString().takeLast(2).toInt()

    if (lastDigit == 0 || (lastTwoDigits in 10..19) || lastDigit in 5..9) {
        return likeWordForm3
    } else if (lastDigit in 2..4) {
        return likeWordForm2
    }

    return likeWordForm1
}

fun main() {
    for (likes in 1u..125u) {
        println("$likes ${makeLikeWord(likes)}")
    }
}