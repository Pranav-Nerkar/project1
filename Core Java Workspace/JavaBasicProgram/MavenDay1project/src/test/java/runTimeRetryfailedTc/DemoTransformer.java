package runTimeRetryfailedTc;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.util.RetryAnalyzerCount;
public class DemoTransformer implements IAnnotationTransformer{
	public void transform(ITestAnnotation annotation,Class testClass,Constructor testConstructor,Method testMethod) {
		annotation.setRetryAnalyzer(RetryAnalyzerCount.class);
	}
}