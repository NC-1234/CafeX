import ServiceChargeCategory.{Drink, Food, PremiumItem}

object BillGenerator {

  val menu = Map(
    "Cola" -> MenuItem("Cola", 0.50, Drink),
    "Coffee" -> MenuItem("Coffee", 1.00, Drink),
    "Cheese Sandwich" -> MenuItem("Cheese Sandwich", 2.00, Food),
    "Steak Sandwich" -> MenuItem("Steak Sandwich", 4.50, Food),
    "Lobster" -> MenuItem("Lobster", 9.50, PremiumItem)
  )

  def bill(purchasedItems: List[String]): BigDecimal = {
    def totalCost: BigDecimal = purchasedItems.foldLeft(BigDecimal(0))((tot, p) => tot + menu(p).price)

    def serviceChargeRate: BigDecimal = if (purchasedItems.exists(name => menu(name).serviceChargeCategory == PremiumItem)) 1.2
    else if (purchasedItems.exists(name => menu(name).serviceChargeCategory == Food)) 1.1
    else 1.0

    totalCost * serviceChargeRate
  }

}
 