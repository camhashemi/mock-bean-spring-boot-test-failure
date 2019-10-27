import app.Application
import app.Foo
import com.nhaarman.mockitokotlin2.whenever
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit.jupiter.SpringExtension

class CustomSpringExtension : SpringExtension()

@ExtendWith(CustomSpringExtension::class)
annotation class MySpringExtension

@MySpringExtension
@SpringBootTest(classes = [Application::class])
class MockFooTest {

    @MockBean
    lateinit var foo: Foo

    @Test
    fun testMockFoo() {
        whenever(foo.getBar()).thenReturn("baz")
        assert(foo.getBar() == "baz")
    }
}
