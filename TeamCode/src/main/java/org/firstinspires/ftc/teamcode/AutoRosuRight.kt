package org.firstinspires.ftc.teamcode

import com.acmerobotics.dashboard.Mutex.Fun
import com.acmerobotics.dashboard.config.Config
import com.qualcomm.robotcore.eventloop.opmode.Autonomous
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import org.checkerframework.common.value.qual.DoubleVal
import org.firstinspires.ftc.teamcode.SleepuriRosuRight.IntoarcerePtParcare1
import org.firstinspires.ftc.teamcode.SleepuriRosuRight.IntoarcerePtParcare2
import org.firstinspires.ftc.teamcode.SleepuriRosuRight.IntoarcereStart
import org.firstinspires.ftc.teamcode.SleepuriRosuRight.MersBackBoard
import org.firstinspires.ftc.teamcode.SleepuriRosuRight.MersDeRetragere
import org.firstinspires.ftc.teamcode.SleepuriRosuRight.MersPtParcare
import org.firstinspires.ftc.teamcode.SleepuriRosuRight.MersStart
import org.firstinspires.ftc.teamcode.SleepuriRosuRight.Parcare
import org.firstinspires.ftc.teamcode.Traiectorii.IntoarcereStart
import org.firstinspires.ftc.teamcode.Traiectorii.MersBackBoard
import org.firstinspires.ftc.teamcode.Traiectorii.MersStart

@Config
object SleepuriRosuRight{
    @JvmField
    var MersStart : Long = 0
    @JvmField
    var IntoarcereStart : Long= 0
    @JvmField
    var MersBackBoard : Long= 0
    @JvmField
    var MersDeRetragere : Long=0
    @JvmField
    var IntoarcerePtParcare1 : Long= 0
    @JvmField
    var MersPtParcare : Long = 0
    @JvmField
    var IntoarcerePtParcare2 : Long = 0
    @JvmField
    var Parcare : Long= 0

}

@Autonomous
class AutoRosuRight : LinearOpMode() {


    override fun runOpMode() {
        DeclarareMotoare.initMotoare(this)









        waitForStart()

        FunctiiMiscare.MiscareVerticala(-1.0)

        sleep(MersStart)
        FunctiiMiscare.MiscareVerticala(0.0)

        FunctiiMiscare.MiscareDeRotire(-1.0)

        sleep(IntoarcereStart)

        FunctiiMiscare.MiscareDeRotire(0.0)

        FunctiiMiscare.MiscareVerticala(-1.0)

        sleep(MersBackBoard)
        //A ajuns la backboard
        FunctiiMiscare.MiscareVerticala(0.0)

        FunctiiMiscare.MiscareVerticala(1.0)

        sleep(MersDeRetragere)

        FunctiiMiscare.MiscareVerticala(0.0)

        FunctiiMiscare.MiscareDeRotire(-1.0)


        sleep(IntoarcerePtParcare1)

        FunctiiMiscare.MiscareDeRotire(0.0)

        FunctiiMiscare.MiscareVerticala(1.0)
        sleep(MersPtParcare)

        FunctiiMiscare.MiscareVerticala(0.0)

        FunctiiMiscare.MiscareDeRotire(-1.0)
        sleep(IntoarcerePtParcare2)

        FunctiiMiscare.MiscareDeRotire(0.0)

        FunctiiMiscare.MiscareVerticala(-1.0)

        sleep(Parcare)

        FunctiiMiscare.MiscareVerticala(0.0)





    }


}