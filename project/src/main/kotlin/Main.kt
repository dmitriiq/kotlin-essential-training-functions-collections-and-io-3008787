
class Solution {
    fun trap(height: IntArray): Int {
        var lastMax = 0
        var water = 0

        val size = height.size

        var i = 0
        while (i < size) {

            var j = i
            while (j < size) {
//                println( "i=$i j=$j" )
                if (height[j] >= lastMax) {
                    println( "i=$i j=$j" )
                    i = j + 1
                    break
                }
                ++j
            }
            if (lastMax < height[i]) {
                lastMax = height[i]
            }
            ++i
        }


        return water
    }
}


fun main() {
    val h: IntArray = intArrayOf ( 0,1,0,2,1,0,1,3,2,1,2,1 )

    val s = Solution()

    s.trap(h)
}