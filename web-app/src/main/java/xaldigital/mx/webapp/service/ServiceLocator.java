package xaldigital.mx.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xaldigital.mx.webapp.service.dao.XalDigitalDao;

@Service
public class ServiceLocator {

    @Autowired
    private XalDigitalDao xalDigitalDao;   
    

    /***
     * 
     * @return regresa la clase XalDigitalDao validando una sola instanciacion de esta
     * para mas informacion checar patron Singleton
     */   
    public XalDigitalDao getInstanceXalDigitalDao(){
        if(xalDigitalDao == null){
            xalDigitalDao = new XalDigitalDao();
            return xalDigitalDao;
        }else{
            return xalDigitalDao;
        }        
    } 
   
}