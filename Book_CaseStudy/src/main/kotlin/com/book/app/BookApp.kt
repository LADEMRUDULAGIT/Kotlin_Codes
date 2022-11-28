import com.book.modal.Book
import com.book.service.BookStore
import java.util.Scanner
fun main() {
    var bookStore= BookStore()
    println("=======================================")
    while(true){
        println("1.insert  2.delete  3.diplayAllRows 4.searchByAuthor 5.searchByTitle 6.searchById  7.ModifyBook 8.Exit")
        println("enter value:")
        var sc=Scanner(System.`in`)
        var value=sc.nextInt()
        when(value) {
            1 -> {
                println("Enter values to insert:")
                bookStore.addBook(getvalues("insert"))
            }

            2 -> {
                println("Enter id to delete:")
                bookStore.deleteproduct(getvalues("delete").bookId)
            }
            3->{
                println("==========view all books===========")
                bookStore.displayAll()
                println("=======================================")
            }
            4 -> {
                println("The given Author book Details:")
                bookStore.searchByAuthor(getvalues("searchByAuthor").author)
                println("=======================================")

            }
            5->{
                println("The given Title book Details:")
                bookStore.searchByTitle(getvalues("searchByTitle").title)
                println("=======================================")
            }
            6->{
                println("The given bookid book Details:")
                bookStore.searchBybookId(getvalues("searchBybookId").bookId)
                println("=======================================")
            }
            7->{
                println("Enter values to modify:")
                bookStore.modifyBook(getvalues("modify"))
            }
            else -> {
                println("===========execution completed===========")
                break
            }
        }
    }

}
fun getvalues(action:String):Book{
    var sc=Scanner(System.`in`)

    if(action=="insert"||action=="modify")
    {
        println("bookId:")
        var bookId=sc.next()
        println("Title:")
        var title=sc.next()
        println("Author:")
        var author=sc.next()
        println("Category:")
        var category=sc.next()
        println("price:")
        var price=sc.nextDouble()
        return Book(bookId,title,author,category,price)
    }
    else{
        if(action=="searchByAuthor"){
            println("Author:")
            var author=sc.next()
            return Book("","",author,"",0.0)
        }
        else if(action=="delete"|| action=="searchBybookId"){
            println("bookId:")
            var bookId=sc.next()
            return Book(bookId,"","","",0.0)
        }
        else if(action=="searchByTitle"){
            println("Title:")
            var title=sc.next()
            return Book("",title,"","",0.0)
        }
        else{
            return Book("","","","",0.0)
        }

    }
}