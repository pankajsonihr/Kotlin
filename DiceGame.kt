//This code is created by Pankaj, Rama Venkata Siva Sai and Mahroon Nisha
fun main(){
    println("Creating default dice")
    val d6 = Die()
    println("Creating die with 20 sides")
    val d20 = Die(20)
    println("Creating a die with name")
    val percentile = Die(10,"A Special Die")
    println("Current side up for ${d6.GetName()} is ${d6.GetFaceUp()}")
    println("Current side up for ${d20.GetName()} is ${d20.GetFaceUp()}")
    println("Current side up for ${percentile.GetName()} is ${percentile.GetFaceUp()}")
    println(".....................................\n")

    println("Testing dies roll functions")
    println("Rolling the ${d6.GetName()}")
    d6.Roll()
    println("The new value of ${d6.GetName()} is ${d6.GetFaceUp()}")
    println(".....................................\n")

    println("Rolling the ${d20.GetName()}")
    d20.Roll()
    println("The new value of ${d20.GetName()} is ${d20.GetFaceUp()}")
    println(".....................................\n")

    println("Rolling the ${percentile.GetName()}")
    percentile.Roll()
    println("The new value of ${percentile.GetName()} is ${percentile.GetFaceUp()}")
    println(".....................................\n")

    println("Setting the ${d20.GetName()} to show 20")
    d20.SetFaceUp(20)
    println("The side up is now ${d20.GetFaceUp()}")
    val dd1 = Die()
    val dd2 = Die()
    val dd3 = Die()
    val dd4 = Die()
    val dd5 = Die()
    println("For same kind of 5  die has took given rolls")
    println(Yahtzee(dd1,dd2,dd3,dd4,dd5))

}
fun Yahtzee(die1:Die,die2:Die,die3:Die,die4:Die,die5:Die):Int{
    var counter:Int = 0
    while (die1.GetFaceUp()!=die2.GetFaceUp() || die2.GetFaceUp()!=die3.GetFaceUp() || die3.GetFaceUp()!=die4.GetFaceUp() || die4.GetFaceUp()!=die5.GetFaceUp()){
        die1.Roll()
        die2.Roll()
        die3.Roll()
        die4.Roll()
        die5.Roll()
        counter++
    }
    return counter
}
