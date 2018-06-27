object ServiceChargeCategory {
  sealed trait ServiceChargeCategory
  case object Drink extends ServiceChargeCategory
  case object Food extends ServiceChargeCategory
}
