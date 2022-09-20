fun makeLikeWord(likes: UInt): String {
    val likeWordForm1 = "лайк"
    val likeWordForm2 = "лайка"
    val likeWordForm3 = "лайков"

    val lastDigit = likes.toString().last().digitToInt()

    if (lastDigit == 0 || likes in 10u..19u || lastDigit in 5..9) {
        return likeWordForm3
    } else if (lastDigit in 2..4) {
        return likeWordForm2
    }

    return likeWordForm1
}

fun main() {
    for (likes in 0u..31u) {
        println("$likes ${makeLikeWord(likes)}")
    }
}