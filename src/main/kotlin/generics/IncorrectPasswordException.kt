package generics

data class IncorrectPasswordException(override var message: String): RuntimeException(message)