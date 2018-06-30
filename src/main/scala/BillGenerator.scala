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

    def serviceChargeRate: BigDecimal = purchasedItems.map { menu(_).serviceChargeCategory match {
      case PremiumItem => BigDecimal("1.2")
      case Food => BigDecimal("1.1")
      case _ => BigDecimal("1.0")
    }}.max

    totalCost * serviceChargeRate
  }
}
 