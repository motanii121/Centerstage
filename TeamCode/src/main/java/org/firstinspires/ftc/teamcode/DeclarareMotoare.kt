package org.firstinspires.ftc.teamcode

import android.graphics.Color
import com.qualcomm.hardware.lynx.LynxModule
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.hardware.CRServo
import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.DcMotorEx
import com.qualcomm.robotcore.hardware.DcMotorSimple
import com.qualcomm.robotcore.hardware.HardwareMap
import com.qualcomm.robotcore.hardware.Servo
import com.qualcomm.robotcore.hardware.configuration.LynxConstants
import com.qualcomm.robotcore.util.ElapsedTime
import kotlin.math.PI
import kotlin.math.exp
import kotlin.math.floor


object DeclarareMotoare {

    @JvmStatic
    var AutoRed : Boolean = false

    @JvmStatic
    var AutoResult : Int = 0

    @JvmStatic
    lateinit var LF: DcMotor

    @JvmStatic
    lateinit var LB: DcMotor

    @JvmStatic
    lateinit var RF: DcMotor

    @JvmStatic
    lateinit var RB: DcMotor

    @JvmStatic
    lateinit var Slide: DcMotor

    @JvmStatic
    lateinit var RidicareIntake: Servo

    @JvmStatic
    lateinit var Intake: DcMotor

    @JvmStatic
    lateinit var ServoBucket: Servo

    @JvmStatic
    lateinit var RoataBucket: CRServo

    @JvmStatic
    lateinit var ServoSlideStanga: Servo

    @JvmStatic
    lateinit var ServoSlideDreapta: Servo

    lateinit var lom: LinearOpMode
    lateinit var hardwareMap: HardwareMap
    lateinit var timptrecut: ElapsedTime

    @JvmStatic
    fun floatMod(o1: Double, o2: Double): Double{
        return o1- floor(o1 / o2) * o2
    }
    @JvmStatic
    fun angDiff(o1: Double, o2: Double): Double {
        return floatMod(o2 - o1 + PI, PI * 2) - PI
    }





    fun initMotoare(lom: LinearOpMode, timptrecut : ElapsedTime) {
        this.lom = lom
        hardwareMap = lom.hardwareMap
        this.timptrecut = timptrecut


        val lynxModules = hardwareMap.getAll(LynxModule::class.java)
        lateinit var controlHub: LynxModule
        lateinit var expansionHub: LynxModule
        if (lynxModules[0].isParent && LynxConstants.isEmbeddedSerialNumber(lynxModules[0].serialNumber)) {
            controlHub = lynxModules[0]
            expansionHub = lynxModules[1]
        } else {
            controlHub = lynxModules[1]
            expansionHub = lynxModules[0]
        }
        controlHub.setConstant(Color.rgb(0, 125, 125))
        expansionHub.setConstant(Color.rgb(0, 125, 125))
        LF = hardwareMap.dcMotor["LF"]
        LB = hardwareMap.dcMotor["LB"]
        RF = hardwareMap.dcMotor["RF"]
        RB = hardwareMap.dcMotor["RB"]


        Slide = hardwareMap.get(DcMotorEx::class.java, "Slide")
        RidicareIntake = hardwareMap.servo["RidicareIntake"]
        Intake = hardwareMap.get(DcMotorEx::class.java, "Intake")

        ServoBucket = hardwareMap.servo["ServoBucket"]
        RoataBucket = hardwareMap.crservo["RoataBucket"]



        LF.zeroPowerBehavior = DcMotor.ZeroPowerBehavior.BRAKE
        LB.zeroPowerBehavior = DcMotor.ZeroPowerBehavior.BRAKE
        RF.zeroPowerBehavior = DcMotor.ZeroPowerBehavior.BRAKE
        RB.zeroPowerBehavior = DcMotor.ZeroPowerBehavior.BRAKE


        Slide.mode = DcMotor.RunMode.STOP_AND_RESET_ENCODER
        Slide.zeroPowerBehavior = DcMotor.ZeroPowerBehavior.BRAKE
        Slide.mode = DcMotor.RunMode.RUN_USING_ENCODER

        RF.direction = DcMotorSimple.Direction.REVERSE
        RB.direction = DcMotorSimple.Direction.REVERSE

        RidicareIntake.position = 0.33

        ServoSlideStanga = hardwareMap.servo["ServoSlideStanga"]
        ServoSlideDreapta = hardwareMap.servo["ServoSlideDreapta"]


        ServoSlideDreapta.direction = Servo.Direction.REVERSE

        ServoBucket.position = 0.25
        ServoSlideDreapta.position = 0.15
        ServoSlideStanga.position = 0.52


    }
}