abstract class MakePizzaAlgorithm{


private fun bakePizza(){
println("Baking Pizza .")
}


abstract fun definePizzaShape()

  
private fun putAddons() {
println("Putting Pizza Addons .")
}

  
private fun heatPizza(){
println("Heating Pizza ")
}

  
fun makePizza(){
bakePizza()
definePizzaShape()
putAddons()
heatPizza()

  }



---------------------------------------------------------------

class MakeRoundedPizza : MakePizzaAlgorithm(){
  
override fun definePizzaShape() {
  
println( "Making the pizza rounded")
}
  
}

class MakeRectanglePizza : MakePizzaAlgorithm(){
override fun definePizzaShape() {
  
println("Making rectangle pizza")
}
  
}

-----------------------------------------------------------------


fun main() {
  
val orderl = MakeRoundedPizza()
order1.makePizza()
  
println(". ")
  
val order2 = MakeRectanglePizza()
order2.makePizza()
}  


--------------------------------------------------------------------


Baking Pizza
Making the pizza rounded
Putting Pizza Addons ...
Heating Pizza ...
Baking Pizza
Making rectangle pizza
Putting Pizza Addons ...
Heating Pizza ...
Process finished with exit code 0  

