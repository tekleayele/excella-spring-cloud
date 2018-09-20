package demo.config;

import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ConditionalOnProperty(name="myproperty",havingValue="valuetocheck",matchIfMissing=false)
@Import(RabbitAutoConfiguration.class)
class RabbitOnConditionalConfiguration{

}