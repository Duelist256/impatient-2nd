package chapter14

object Exercise4 extends App {
  // Add a case class Multiple that is a subclass of the Item class. For example,
  // Multiple(10, Article("Blackwell Toaster", 29.95)) describes ten toasters. Of course,
  // you should be able to handle any items, such as bundles or multiples, in
  // the second argument. Extend the price function to handle this new case.

  abstract class Item
  case class Article(description: String, price: Double) extends Item
  case class Bundle(description: String, discount: Double, items: Item*) extends Item
  case class Multiple(quantity: Int, item: Item) extends Item

  def price(it: Item): Double = it match {
    case Article(_, p) => p
    case Bundle(_, disc, its @ _*) => its.map(price).sum - disc
    case Multiple(q , item) => q * price(item)
  }

  val article = Article("Trololo", 12.5)
  val tenArticles = Multiple(10, article)
  val hundredArticles = Multiple(10, tenArticles)
  val bundleOfArticles = Bundle("2 articles", 10, article, article)
  val twoBundles = Multiple(2, bundleOfArticles)
  println(price(article))
  println(price(tenArticles))
  println(price(hundredArticles))
  println(price(bundleOfArticles))
  println(price(twoBundles))
}
