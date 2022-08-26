import java.lang.Math
class desr2tasks {

        var n :Int=2
        var x1:Double=0.3
        var x2:Double=0.5
        var y1:Double=1.2
        var y2:Double=-4.0

        fun get_radius(xx1:Double,xx2:Double,yy1:Double,yy2:Double):Double{
            this.x1=xx1
            this.x2=xx2
            this.y1=yy1
            this.y2=yy2
            var r:Double
            r=Math.sqrt(Math.pow((x2-x1),2.0)+Math.pow((y2-y1),2.0))
            return  r
        }

        fun get_diametr(radius:Double):Double{
            var d:Double
            d=2* get_radius(this.x1,this.x2,this.y1,this.y2)
            return d
            println(d)
        }


        fun get_area(radius:Double):Double{
            var area:Double
            area= java.lang.Math.PI*get_area(radius)
        }



    }
}