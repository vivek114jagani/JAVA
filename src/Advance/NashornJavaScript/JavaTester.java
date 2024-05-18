package Advance.NashornJavaScript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaTester {
    public static void main(String[] args) {
        // creat the script engin manager
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();

        // load the Nashorn javascript engine
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

        String name = "VIVEK";
        Integer result = null;

        try {
            // call the javascript function, pass a java variable
            nashorn.eval("print('" + name + "')");

            // call the javascript function and get the result back in java
            result = (Integer) nashorn.eval("10 + 2");

        } catch (ScriptException e) {
            System.out.println("Error executing script: "+ e.getMessage());
        }

        System.out.println(result.toString());
    }
}
