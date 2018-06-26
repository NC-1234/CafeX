object BillGenerator {

  //TODO change this menu to use the case class MenuItem
  val menu = Map("Cola" -> 0.50, "Coffee" -> 1.00 , "Cheese Sandwich" -> 2.00, "Steak Sandwich" -> 4.50)

  def bill(purchasedItems : List[String]) = {

    //use sum or foldLeft - you dont need to map
    val purchasedItemPrices = purchasedItems.map(item => menu(item) )
    val total = purchasedItemPrices.sum

    //also - think do I want the service charge to be a function - having a function that does several things isnt good
    //maybe use an inner function?
    //TODO Use some discriminator rather than the name of the item - you have something in the case class right?
    if (purchasedItems.contains("Cheese Sandwich")) total * 1.2
    else total
  }

}
