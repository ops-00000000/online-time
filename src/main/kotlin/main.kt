fun main(){
    val time = 7997
    println(agoToText(time))
}

fun agoToText(time:Int): String{

    val s = when (time){
        in 0..60 -> "только что"
        in 61..60*60 ->  secondsToMinutes(time)
        in 60*60 + 1..24*60*60 -> secondsToHours(time)
        in 24*60*60 + 1..24*60*60*2 -> "сегодня"
        in 24*60*60*2 + 1..24*60*60*3 -> "вчера"
        else -> "давно"
    }
    return  s
}

fun secondsToMinutes(seconds: Int): String{
    val formattedMinutes = seconds / 60
    var stringResultInMinutes: String = ""
    if (formattedMinutes in 10..20 || formattedMinutes % 10 in 5..9) {
        stringResultInMinutes = "$formattedMinutes минут назад"
    } else if (formattedMinutes % 10 == 1) {
        stringResultInMinutes = "$formattedMinutes минуту назад"
    } else if (formattedMinutes % 10 in 2..4) {
        stringResultInMinutes = "$formattedMinutes минуты назад"
    }
    return stringResultInMinutes
}

fun secondsToHours(seconds: Int): String{
    val formattedHours = seconds / 3600
    var stringResultInHours: String = ""
    if (formattedHours in 10..20 || formattedHours % 10 in 5..9) {
        stringResultInHours = "$formattedHours часов назад"
    } else if (formattedHours % 10 == 1) {
        stringResultInHours = "$formattedHours час назад"
    } else if (formattedHours % 10 in 2..4) {
        stringResultInHours = "$formattedHours часа назад"
    }
    return stringResultInHours
}