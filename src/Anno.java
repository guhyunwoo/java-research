import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@interface SourceAnno {}

@Retention(RetentionPolicy.CLASS)
@interface ClassAnno {}

@Retention(RetentionPolicy.RUNTIME)
@interface RuntimeAnno {}

class Demo {
}

@SourceAnno
@ClassAnno
@RuntimeAnno
public class Anno {

}