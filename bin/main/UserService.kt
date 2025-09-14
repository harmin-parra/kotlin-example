class UserService(private val repository: UserRepository) {
    fun greetUser(id: Int): String {
        val name = repository.findNameById(id)
        return "Hello, $name!"
    }
}
