class SubSystemClassA:
@staticmethod
def method():
return "A"
class SubSystemClassB:
@staticmethod
def method():
return "B"
class SubSystem ClassC:
@staticmethod
def method():
return "C"



class Facade:
def _init_(self):
self.sub_system_class_a = SubSystemClassA()
self.sub_system_class_b = SubSystemClassB()
self. sub_system_class_c = SubSystemClassC()
def create(self):
result = self.sub_system_class_a.method()
result += self. sub_system_class_b.method()
result += self. sub_system_class_c.method()
return result
FACADE = : Facade ()
RESULT = FACADE.create()
print(RESULT)

//will print ABC


Res: https://youtu.be/VrRDami28N0
