# excella-spring-cloud


## Instances currently registered with Eureka

![Eureka](https://github.com/tekleayele/excella-spring-cloud/blob/master/Eureka.png)

## Excella Service Consumer 
Actuator health status :
```
{  
   description:"Spring Cloud Eureka Discovery Client",
   status:"UP",
   discoveryComposite:{  
      description:"Spring Cloud Eureka Discovery Client",
      status:"UP",
      discoveryClient:{  
         description:"Spring Cloud Eureka Discovery Client",
         status:"UP",
         services:[  
            "excella-service-provider",
            "excella-service-consumer"
         ]
      },
      eureka:{  
         description:"Remote status from Eureka server",
         status:"UP",
         applications:{  
            EXCELLA-SERVICE-CONSUMER:1,
            EXCELLA-SERVICE-PROVIDER:1
         }
      }
   },
   diskSpace:{  
      status:"UP",
      total:499963174912,
      free:457605496832,
      threshold:10485760
   },
   refreshScope:{  
      status:"UP"
   },
   hystrix:{  
      status:"UP"
   }
}
```
## Excella Service Provider 
Actuator health status : 
```
{  
   description:"Spring Cloud Eureka Discovery Client",
   status:"UP",
   discoveryComposite:{  
      description:"Spring Cloud Eureka Discovery Client",
      status:"UP",
      discoveryClient:{  
         description:"Spring Cloud Eureka Discovery Client",
         status:"UP",
         services:[  
            "excella-service-provider",
            "excella-service-consumer"
         ]
      },
      eureka:{  
         description:"Remote status from Eureka server",
         status:"UP",
         applications:{  
            EXCELLA-SERVICE-CONSUMER:1,
            EXCELLA-SERVICE-PROVIDER:1
         }
      }
   },
   diskSpace:{  
      status:"UP",
      total:499963174912,
      free:457604100096,
      threshold:10485760
   },
   refreshScope:{  
      status:"UP"
   },
   configServer:{  
      status:"UP",
      propertySources:[  
         "configClient",
         "https://github.com/tekleayele/spring-cloud-config/excella-service-provider.yml"
      ]
   },
   hystrix:{  
      status:"UP"
   }
}
```

## Config Server  

Actuator health status : 
```
{  
   status:"UP",
   diskSpace:{  
      status:"UP",
      total:499963174912,
      free:457607544832,
      threshold:10485760
   },
   refreshScope:{  
      status:"UP"
   },
   configServer:{  
      status:"UP",
      repositories:[  
         {  
            name:"app",
            profiles:[  
               "default"
            ],
            label:"master"
         }
      ]
   }
}
```

App name config file end point : 
```
{  
   name:"excella-service-provider",
   profiles:[  
      "git"
   ],
   label:"master",
   version:"699f1e98b63e3c03a0b23d333f425a249e844cf8",
   state:null,
   propertySources:[  
      {  
         name:"https://github.com/tekleayele/spring-cloud-config/excella-service-provider.yml",
         source:{  
            excella.message:"Message from Excella Config Server - served from excella-service-provider.yml version 1.0",
            excella.encryptedValue:"secret"
         }
      }
   ]
}
```

