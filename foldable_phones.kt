open class Phone(var isScreenLightOn: Boolean = false){
   open fun switchOn() {
        isScreenLightOn = true
    }
    
    open fun switchOff() {
        isScreenLightOn = false
    }
    
  
    
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}
class FoldablePhone(isScreenLightOn: Boolean) :Phone (isScreenLightOn){
      var isFolded = false
    
    override fun switchOn() {
        if(!isFolded) {
        super.switchOn()
        }
    }
    
    fun fold() {
        isFolded = true
switchOff()


        
    } 
    fun unfold() {
              isFolded = false

    } 
    
}
fun main() {
    val phone = FoldablePhone(false)

    phone.switchOn()
    phone.checkPhoneScreenLight()

    phone.fold()
    phone.switchOn()
    phone.checkPhoneScreenLight()

    phone.unfold()
    phone.switchOn()
    phone.checkPhoneScreenLight()
}