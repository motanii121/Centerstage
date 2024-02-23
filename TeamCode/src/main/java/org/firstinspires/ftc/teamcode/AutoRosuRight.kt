package org.firstinspires.ftc.teamcode

import com.acmerobotics.dashboard.Mutex.Fun
import com.acmerobotics.dashboard.config.Config
import com.qualcomm.robotcore.eventloop.opmode.Autonomous
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.util.ElapsedTime
import org.checkerframework.common.value.qual.DoubleVal
import org.firstinspires.ftc.teamcode.DeclarareMotoare.AutoRed
import org.firstinspires.ftc.teamcode.DeclarareMotoare.AutoRosu
import org.firstinspires.ftc.teamcode.DeclarareMotoare.timptrecut
import org.firstinspires.ftc.teamcode.SleepuriRosuRight.IntoarcerePtParcare1
import org.firstinspires.ftc.teamcode.SleepuriRosuRight.IntoarcerePtParcare2
import org.firstinspires.ftc.teamcode.SleepuriRosuRight.IntoarcereStart
import org.firstinspires.ftc.teamcode.SleepuriRosuRight.MersBackBoard
import org.firstinspires.ftc.teamcode.SleepuriRosuRight.MersDeRetragere
import org.firstinspires.ftc.teamcode.SleepuriRosuRight.MersPtParcare
import org.firstinspires.ftc.teamcode.SleepuriRosuRight.MersStart
import org.firstinspires.ftc.teamcode.SleepuriRosuRight.Parcare


@Config
object SleepuriRosuRight {
    @JvmField
    var MersStart = 0

    @JvmField
    var IntoarcereStart = 0

    @JvmField
    var MersBackBoard = 0

    @JvmField
    var MersDeRetragere = 0

    @JvmField
    var IntoarcerePtParcare1 = 0

    @JvmField
    var MersPtParcare = 0

    @JvmField
    var IntoarcerePtParcare2 = 0

    @JvmField
    var Parcare = 0

}

@Autonomous
class AutoRosuRight : LinearOpMode() {


    override fun runOpMode() {
        DeclarareMotoare.initMotoare(this, ElapsedTime())



        AutoRed = true






        waitForStart()



        FunctiiMiscare.MiscareVerticala(-1.0, MersStart)





        FunctiiMiscare.MiscareDeRotire(-1.0, IntoarcereStart)



        sleep(100)


        FunctiiMiscare.MiscareVerticala(-1.0, MersBackBoard)


        //A ajuns la backboard


        FunctiiMiscare.MiscareVerticala(1.0, MersDeRetragere)



        FunctiiMiscare.MiscareDeRotire(-1.0, IntoarcerePtParcare1)






        FunctiiMiscare.MiscareVerticala(1.0, MersPtParcare)




        FunctiiMiscare.MiscareDeRotire(-1.0, IntoarcerePtParcare2)




        FunctiiMiscare.MiscareVerticala(-1.0, Parcare)



    }


}