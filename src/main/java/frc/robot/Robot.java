

//librerias
package frc.robot;
import edu.wpi.first.wpilibj.TimedRobot;



public class Robot extends TimedRobot {
 
  


  //se ejecuta solo una vez cuando el robot se enciende
  @Override
  public void robotInit() {

    

  }

 

//se ejecuta en buclesiempre que el robot este prendido
  @Override
  public void robotPeriodic() {}

 

//Se ejecuta solo una vez cuando se incia el periodo autonomo
  @Override
  public void autonomousInit() {

  

  }



//Se ejecuta en bucle cuando esta en el periodo autonomo
  @Override
  public void autonomousPeriodic() {

  }


//Se ejecuta solo una vez cuando se incia el periodo teleoperado
  @Override
  public void teleopInit() {}


//Se ejecuta en bucle cuando esta el periodo teleoperado
  @Override
  public void teleopPeriodic() {}

 

  //se ejecuta una vez cuando se desabilita el robot
  @Override
  public void disabledInit() {}




  //Se ejecuta en bucle cuando esta desabilitado el robot
  @Override
  public void disabledPeriodic() {}



//Se ejecuta solo una vez cuando inicia el periodo del test
  @Override
  public void testInit() {}



  // Es donde se hace un periodo en el test 
  @Override
  public void testPeriodic() {}
}
