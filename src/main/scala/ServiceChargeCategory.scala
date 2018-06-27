object ServiceChargeCategory {
  sealed trait ServiceChargeCategory
  case object Drink extends ServiceChargeCategory
  case object Food extends ServiceChargeCategory
  case object PremiumItem extends ServiceChargeCategory
}
