package models

import java.util.*

open class Articles (
                     artdate:Date,
                     title:String,
                     text:String,
                     var comments:List<Comment>){
}