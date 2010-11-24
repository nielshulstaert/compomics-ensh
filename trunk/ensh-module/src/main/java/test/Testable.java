package test;

import java.lang.annotation.*;

/**
 * Created Tue Nov 20 19:36:54 GMT 2007 <br/>
 *
 * @author JUnit 4 Synchronizer
 * @version $Revision: $ <br/> $Date: $ <br/> $Author: $
 */
@Retention(value = RetentionPolicy.SOURCE)
@Target( { ElementType.CONSTRUCTOR, ElementType.METHOD } )
public @interface Testable {

    public abstract String value() default "";

} // Testable annotation type
