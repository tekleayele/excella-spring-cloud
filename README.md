# excella-spring-cloud


## Instances currently registered with Eureka

Application	                AMIs	    Availability    Zones	    Status


EXCELLA-SERVICE-CONSUMER	n/a             (1)	        (1)	         UP (1) - {LOCAL-IP}:excella-service-consumer:8080

EXCELLA-SERVICE-PROVIDER	n/a             (1)	        (1)	         UP (1) - {LOCAL-IP}:excella-service-provider:8181

![Eureka](https://github.com/tekleayele/excella-spring-cloud/blob/master/Eureka.png)


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

