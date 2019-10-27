import app.Application
import app.Foo
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [Application::class])
class FooTest {

    @Autowired
    lateinit var foo: Foo

    @Test
    fun testFoo() {
        assert(foo.getBar() == "bar")
    }
}
