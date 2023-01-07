package command;

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();
     
    Light livingRoomLight = new Light("Living Room");
    CeilingFan ceilingFan= new CeilingFan("Living Room");
    GarageDoor garageDoor = new GarageDoor("Garage");
    Stereo stereo = new Stereo("Living Room");

    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
    CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
    CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
     
    GarageDoorUpCommand garageDoorUp =new GarageDoorUpCommand(garageDoor);
    GarageDoorDownCommand garageDoorDown =new GarageDoorDownCommand(garageDoor);
     
    StereoOnWithCDCommand stereoOnWithCD =new StereoOnWithCDCommand(stereo);
    StereoOffCommand  stereoOff =new StereoOffCommand(stereo);
     
    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remoteControl.setCommand(1, ceilingFanOn, ceilingFanOff);
    remoteControl.setCommand(2, stereoOnWithCD, stereoOff);
    remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
      
    System.out.println(remoteControl);

    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(1);
    remoteControl.offButtonWasPushed(1);
    remoteControl.onButtonWasPushed(2);
    remoteControl.offButtonWasPushed(2);
    remoteControl.onButtonWasPushed(3);
    remoteControl.offButtonWasPushed(3);
    remoteControl.onButtonWasPushed(4);
    remoteControl.offButtonWasPushed(4);
    }
}
