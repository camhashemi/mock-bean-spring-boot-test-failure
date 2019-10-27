## SpringBootTest + custom SpringExtension annotation + MockBean failure example

Run `./gradlew test -info` to reproduce the failure.

Tests pass if you remove either the custom annotation or @MockBean, but this removes desired behavior.  

What's the best way to create a custom SpringExtension annotation which doesn't lead to this failure?
