import kotlin.random.Random

class Die(name:String="D6", sides:Int=6, _colour:String="Green"){
    private var Name:String = name
    private var Colour:String = _colour
    private var Sides:Int = sides
    private var FaceUp:Int =Random.nextInt(1,Sides)

    constructor(_sides: Int) : this(sides =_sides){
        Name ="D$Sides"
    }
    constructor(_sides: Int,_name:String):this(sides =_sides,name =_name){
    }
    // this will update the curent face up
    fun SetFaceUp(faceToUp:Int){
        FaceUp = faceToUp
        Name ="D$Sides"
    }
    //this will update the current sides
    fun SetSides(sideAmount:Int){
        Sides =sideAmount
    }
    //this will update the color of the die
    fun SetColour(colourName:String){
        Colour = colourName
    }
    fun SetName(NewName:String){
        Name = NewName
    }
    fun GetFaceUp():Int{
        return FaceUp
    }
    fun GetSides():Int{
        return Sides
    }
    fun GetColour():String{
        return Colour
    }
    fun GetName():String{
        return Name
    }
    // roll to change the current face up of our die
    fun Roll(){
        FaceUp = Random.nextInt(1,Sides)
    }
}
