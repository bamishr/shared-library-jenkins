import org.badrish.build.HelloWorld
import org.badrish.ioc.ContextRegistry

def call(String solutionPath) {
    ContextRegistry.registerDefaultContext(this)

    def helloworld = new HelloWorld(solutionPath)
    helloworld.build()
}