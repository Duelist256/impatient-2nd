class Fruit
class Orange extends Fruit


class MyContainer[+A](val a: A)(implicit manifest: scala.reflect.Manifest[A]) {
  def contents = manifest.runtimeClass.getSimpleName

  var n = 5

}

 val fruitBasket:MyContainer[Fruit] = new MyContainer[Orange](new Orange())