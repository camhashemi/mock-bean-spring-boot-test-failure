package app

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Config {
    @Bean
    fun foo(): Foo = RealFoo()
}

interface Foo {
    fun getBar(): String
}

class RealFoo : Foo {
    override fun getBar(): String = "bar"
}
