package android.ricardoflor.turistdroid.bd.site

import android.ricardoflor.turistdroid.bd.image.Image
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

/**
 * Clase modelo de los sitios
 * @property id Long
 * @property name String
 * @property image String
 * @property site String
 * @property date String
 * @property rating Double
 * @property latitude Double
 * @property longitude Double
 */
open class Site(
    @PrimaryKey
    var id: Long = 0,
    var name: String = "",
    var site: String = "",
    var date: String = "",
    var rating: Double = 0.0,
    var longitude: Double = 0.0,
    var latitude: Double = 0.0,
    var image: RealmList<Image> = RealmList()
) : RealmObject(){
    override fun toString(): String {
        return "Site(id=$id, name='$name', image='$image', site='$site', date=$date, rating=$rating, latitude=$latitude, longitude=$longitude)"
    }
    constructor(name: String,site: String,date: String,rating: Double,longitude: Double,latitude: Double)
            :this(System.currentTimeMillis()/1000,name,site, date, rating, latitude, longitude)
}
