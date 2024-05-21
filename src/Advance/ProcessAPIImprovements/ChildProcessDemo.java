package Advance.ProcessAPIImprovements;

import java.io.IOException;
import java.util.stream.Stream;

public class ChildProcessDemo {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 3; i++) {
            ProcessBuilder processBuilder = new ProcessBuilder("java.exe", "-version");
            processBuilder.inheritIO().start();
        }

        Stream<ProcessHandle> childProcesses = ProcessHandle.current().children();
        String notPresent = "Not present";
        childProcesses.filter(ProcessHandle::isAlive).forEach(
                childProcesse -> {
                    System.out.printf("Process ID :- %s%n", childProcesse.pid());
                    System.out.printf("Command Name :- %s%n", childProcesse.info().command().orElse(notPresent));
                    System.out.printf("Command Line :- %s%n", childProcesse.info().commandLine().orElse(notPresent));
                }
        );
    }
}
