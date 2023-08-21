fun main() {
  
val employee Employee (security Level = 4, name = "Tico")
val access ProxyInternet ()
  
access.grant Internet Access (employee)
  
println("Increased the security level for the employee")
  
employee.securityLevel = 6
  
access.grantInternetAccess (employee)



  
class Employee(var securityLevel: Int, val name: String)


  
interface Internet{
  
fun grant Internet Access (employee: Employee)
}


  
// act as firewall
class ProxyInternet : Internet {
override fun grant Internet Access (employee: Employee) {
  
if(employee.securityLevel > 5){
  
RealInternetConnection().grant Internet Access (employee)
  
}else{
  println("Permission Denied")
}



  
I
//Window to the real internet
class RealInternetConnection : Internet|{

  
override fun grantInternetAccess(employee: Employee) {

  
println("Granted Internet Permission for ${employee.name}")

  }
}


res:  https://youtu.be/ZdQ9-j65rJM
