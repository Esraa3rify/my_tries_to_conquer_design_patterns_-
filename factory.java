//The diagram for the program

public class pay_credit : Payment {

public void pay(){

Console.write("pay credit");
}


}

-----------------------------------------------------------------------

public class pay_cash : Payment {

public void pay(){

Console.write("pay cash");
}

-----------------------------------------------------------------------

public class TemplatePattern{

  public Paymnet get_class(String object_name){

    if(object_name.Equals("cash"))  return new pay_cash();

    else
      return pay_credit();
}
  }
}

Res: https://youtu.be/pdSsrND-7q0
