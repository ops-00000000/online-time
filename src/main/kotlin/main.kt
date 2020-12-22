fun main(){
    val time = 60
    val hour = 3600
    fun minutes():String {
        val m = when (time) {
            in 61..119, in 1260..1319, in 1260 + 600..1319 + 600, in 1260 + 600 * 2..1319 + 600 * 2, in 1260 + 600 * 3..1319 + 600 * 3, -> "минуту"
            in 120..299, in 1320..1499, in 1320 + 600..1499 + 600, in 1320 + 600 * 2..1499 + 600 * 2, in 1320 + 600 * 3..1499 + 600 * 3 -> "минуты"
            in 300..1259, in 1500..1859, in 1500 + 600..1859 + 600, in 1500 + 600 * 2..1859 + 600 * 2, in 1500 + 600 * 3..1800 + 600 * 3 -> "минут"
            in hour until hour*2, in hour*21 until hour*22 -> "час"
            in hour*2 until hour*5, in hour*22 until hour*24 -> "часа"
            in hour*5 until hour*21 -> "часов"
            else -> ""
        }
      return m
    }

    fun min(): Int{
        val min = time / 60
        (min).toInt()
        return min
    }

    fun hou(): Int{
        val hou = time / 3600
        (hou).toInt()
        return hou
    }

    fun agoToText(): Any{

        val s = when (time){
            in 0..60 -> "только что"
            in 61..60*60 ->   min() + minutes() + "назад"
            in 60*60 + 1..24*60*60 -> hou() + minutes() + "назад"
            in 24*60*60 + 1..24*60*60*2 -> "сегодня"
            in 24*60*60*2 + 1..24*60*60*3 -> "вчера"
            else -> "давно"
        }
        return  s
    }

    println(agoToText())
}

private operator fun Any.plus(minutes: String): Any {
    TODO("Not yet implemented")
}