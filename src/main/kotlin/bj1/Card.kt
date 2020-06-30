package bj1

class Card(val value: Int, val suit: Int) {

    init {
        require(value in 1..13, { "Bad value" + value })
        require(suit in 1..4, { "Bad suit" + suit })
    }

    val suitName: String get() =
        if (suit == 1) {
            "Spades"
        } else if (suit == 2) {
            "Hearts"
        } else if (suit == 3) {
            "Clubs"
        } else if (suit == 4) {
            "Diamonds"
        } else {
            throw IllegalStateException()
        }

    val valueName: String get() =
        if (value == 1) {
            "Ace"
        } else if (value in 2..10) {
            value.toString()
        } else if (value == 11) {
            "Jack"
        } else if (value == 12) {
            "Queen"
        } else if (value == 13) {
            "King"
        } else {
            throw IllegalStateException()
        }

    val name: String get() = valueName + "of" + suitName

    val points: Int get() =
        if (value in 1..9) {
            value
        } else if (value in 10..13) {
            10
        } else {
            throw IllegalStateException()
        }
}
