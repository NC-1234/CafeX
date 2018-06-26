object BillGenerator {

  val menu = Map("Cola" -> 0.50, "Coffee" -> 1.00 , "Cheese Sandwich" -> 2.00, "Steak Sandwich" -> 4.50)

  def bill(purchasedItems : List[String]) = {

    val purchasedItemPrices = purchasedItems.map(item => menu(item) )
    val total = purchasedItemPrices.sum

    if (purchasedItems.contains("Cheese Sandwich")) total * 1.2
    else total
  }

}
