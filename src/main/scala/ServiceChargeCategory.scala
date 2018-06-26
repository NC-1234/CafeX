object ServiceChargeCategory {
  sealed trait ServiceChargeCategory
  case object Cola extends ServiceChargeCategory
  case object Coffee extends ServiceChargeCategory
  case object CheeseSandwich extends ServiceChargeCategory
  case object SteakSandwich extends ServiceChargeCategory
}
