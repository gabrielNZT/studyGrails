package myapp

import grails.gorm.services.Service

@Service(Make)
interface MakeService{
    Make save(String name)
}
