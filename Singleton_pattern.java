class Singleton {
  //I used a static instance so that any changes can affect the whole program.
private static instance = null;

//used private constructor to prevent any object from creating and instnce/ create copy from the class
private Singleton (){};

//this function to check if this instance created before or not, then it can create a copy just if it is the only one.
//it is important to make sure that there is just one instance of the class so that we can manage our memory well and keep our code logic from getting messy. 
public static get_instance(){

if (instance==null)  instance= new Singleton();

return instance;  
}

}



