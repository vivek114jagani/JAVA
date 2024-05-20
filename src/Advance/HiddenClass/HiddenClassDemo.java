package Advance.HiddenClass;

import jdk.jshell.execution.Util;

import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Java 15 has introduced {@code hidden classes} which cannot be used directly by other classes bytecode.
 * These {@code hidden classes} are intended to be used by frameworks that generate classes at runtime and use them using reflection.<p>
 * A hidden class is defined as a member of the Based Access Control Context and it can be unloaded irrespective of other classes.<p>
 * This proposal, JEP 371, aims at the improvement of all languages on JVM by providing a standard API to define hidden classes that are not discoverable and have a limited lifecycle.
 * JDK frameworks or external frameworks can generate classes dynamically which can generate hidden classes.<p>
 * JVM languages rely heavily on dynamic class generation for flexibility and efficiency.
 * */

public class HiddenClassDemo {
    public static void main(String[] args) throws IOException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        // create the lookup object
        MethodHandles.Lookup lookup = MethodHandles.lookup();

        // define the hidden class using the byte array of Util class Using NESTMATE option so that hidden class has access to
        // private members of classes in same nest.
        Class<?> hiddenClass = lookup.defineHiddenClass(getByteArray(),
                true, MethodHandles.Lookup.ClassOption.NESTMATE).lookupClass();

        // get the hidden class object
        Object hiddenClassObj = hiddenClass.getConstructor().newInstance();

        // get the hidden class method
        Method method = hiddenClassObj.getClass().getDeclaredMethod("square", Integer.class);

        // call the method and get result
        Object result = method.invoke(hiddenClassObj, 3);

        // print the result
        System.out.println(result);

        // as hidden class is not visible to jvm, it will print hidden
        System.out.println(hiddenClass.isHidden());

        // canonical name is null thus this class cannot be instantiated using reflection
        System.out.println(hiddenClass.getCanonicalName());
    }

    public static byte[] getByteArray() throws IOException {
        InputStream stream = Util.class.getClassLoader().getResourceAsStream("Advance/HiddenClass/Util.class");
        byte[] bytes = stream.readAllBytes();
        return bytes;
    }
}
