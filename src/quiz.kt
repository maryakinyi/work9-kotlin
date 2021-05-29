fun main() {
    currentAccount("7778798977","deposit",8900.0)
}
data class  Books(var title:String, var author:String,var pages:Int)
fun listOfBooks(literature:List<Books>):List<Books>{
var bookList= listOf(Books("HOOLY","ERICSA",87),Books("BORN A CRIME","Trevor noah",356),Books("kidagaa","KEN",350))
    return bookList
println( bookList.sortedByDescending { })

}

class currentAccount(var accountNumber:String,var accountName:String,var balance:Double){
    fun deposit(amount:Double){
        var amount=3990.0
        var total=amount+balance
        println(total)
    }
    fun withdraw(amount: Double){
        var decrease=amount-balance
        println(decrease)
    }
}
