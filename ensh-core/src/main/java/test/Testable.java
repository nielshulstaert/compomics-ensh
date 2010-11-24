package test;

import java.lang.annotation.*;

/**
 * Created Tue Oct 02 11:27:14 BST 2007 <br/>
 *
 * @author JUnit 4 Synchronizer
 * @version $Revision: $ <br/> $Date: $ <br/> $Author: $
 */
@Retention(value = RetentionPolicy.SOURCE)
@Target( { ElementType.CONSTRUCTOR, ElementType.METHOD } )
public @interface Testable {

    String value() default "";

} // Testable annotation type
