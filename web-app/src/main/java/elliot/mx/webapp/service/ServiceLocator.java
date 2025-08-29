package elliot.mx.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import elliot.mx.webapp.service.dao.CVDao;

@Service
public class ServiceLocator {

    @Autowired
    private CVDao cvDao;   
    

    /***
     * 
     * @return regresa la clase CVDao validando una sola instanciacion de esta
     * para mas informacion checar patron Singleton
     */   
    public CVDao getInstanceCVDao(){
        if(cvDao == null){
            cvDao = new CVDao();
            return cvDao;
        }else{
            return cvDao;
        }        
    } 
   
}