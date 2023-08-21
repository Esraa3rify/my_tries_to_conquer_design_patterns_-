interface PizzaComponent {
fun cost(): Double
fun print Description() : String
}


class BasicPizza() : PizzaComponent {
override fun cost(): Double {
return 10.0
}

override fun printDescription(): String {
return "Basic Pizza"
}

}


class ShrimpComponent(var pizzaComponent: PizzaComponent) : PizzaComponent {
override fun cost(): Double {
return pizzaComponent.cost() + 5.0
}
  
override fun printDescription(): Str {
return pizzaComponent.printDescription() + ", Shrimp"
}

fun main() {
val customPizza = ShrimpComponent (BasicPizza())
println(customPizza.print Description())
}
