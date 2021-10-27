package models
import models.Articles
import models.Reactions
import org.w3c.dom.Text
import java.util.*

open class User(val firstName: String,
                val lastName:String,
                val email:String,
                val age: Int,

                var favorites:List<Articles>,
                var comments:List<Comment>,
                var article:List<Articles>):Reactions
{
    fun like(){

    }
    fun dislike(){

    }

    fun addArticle(title:String, date:Date, text:String){
        var newarticle:Articles = Articles(
            date,
            title,
            text)

        article(newarticle)
    }

    fun trialpha(article){
        val sortedList = list.sortedWith(compareBy({it.second}))
    }

    fun tridate(article){
        val sortedList = list.sortedWith(compareBy({it.first}))
    }
}