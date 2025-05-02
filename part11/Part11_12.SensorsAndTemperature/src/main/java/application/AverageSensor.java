package application;


import application.Sensor;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLC3
 */
public class AverageSensor implements Sensor{
    
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public List<Integer> readings(){
        return readings;
    }
    
    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
       
        
        for(Sensor sensor: sensors){
            if(sensor.isOn() == false){
                return false;
            }
        }
        
        return true;
    }

    @Override
    public void setOn() {
        for(Sensor sensor: sensors){
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
         for(Sensor sensor: sensors){
            sensor.setOff();
        }
    }

    @Override
    public int read() {
       
        
        if(!isOn() || this.sensors.isEmpty()){
            throw new IllegalStateException();
        }
        
         int sum = 0;
        
         for(Sensor sensor: sensors){
            sum = sum + sensor.read();
        }
         
         readings.add(sum/sensors.size());
         return sum/sensors.size();
                 
    }
    
}
