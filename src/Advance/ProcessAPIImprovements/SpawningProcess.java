package Advance.ProcessAPIImprovements;

import java.io.IOException;
import java.time.ZoneId;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**In Java 9 Process API which is responsible to control and manage operating system processes has been improved considerably.
 * ProcessHandle Class now provides process's native process ID, start time, accumulated CPU time, arguments, command, user, parent process, and descendants.
 * ProcessHandle class also provides method to check processes' liveness and to destroy processes.
 * It has onExit method, the CompletableFuture class can perform action asynchronously when process exits.
 * */

public class SpawningProcess {

    public static void main(String[] args) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");
        String notPresent = "Not Present";
        Process process = processBuilder.start();
        ProcessHandle.Info info = process.info();

        System.out.printf("Process ID :- %s%n", process.pid());
        System.out.printf("Command name :- %s%n", info.command().orElse(notPresent));
        System.out.printf("Command line :- %s%n", info.commandLine().orElse(notPresent));

        System.out.printf("Start Time :- %s%n",
                info.startInstant().map(i -> i.atZone(ZoneId.systemDefault())
                .toLocalDateTime().toString()).orElse(notPresent));

        System.out.printf("Arguments :- %s%n",
                info.arguments().map(a -> Stream.of(a).collect(
                Collectors.joining(" "))).orElse(notPresent));

        System.out.printf("User :- %s%n", info.user().orElse(notPresent));
    }
}
