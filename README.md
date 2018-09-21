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

## Config Server : 
http://{LOCAL-IP}:8888/excella-service-provider/git

```,{
name: "excella-service-provider",
    profiles: [
    "git"
    ],
    label: "master",
    version: "9ba67f7e424f130a6b6d548f68831c79b9a279f0",
    state: null,
    propertySources: [
      {
      name: "https://github.com/tekleayele/spring-cloud-config/excella-service-provider.yml",
        source: {
        excella.message: "Message from Excella Config Server - served from excella-service-provider.yml version 1.0"
        }
      }
    ]
}
```

