object BillGenerator {

  val menu = Map("Cola" -> 0.50, "Coffee" -> 1.00 , "Cheese Sandwich" -> 2.00, "Steak Sandwich" -> 4.50)

  def bill(purchasedItems : List[String]) = {

    val allItems = purchasedItems.map(item => menu(item) )
    val total = allItems.sum
    if (allItems.contains("Cheese Sandwich"))
      total + (total / 100 * 20)
    else
      total
  }

}
