
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.TaskAction

import java.nio.file.Path

class NestedTest extends DefaultTask {

    @InputFile
    public File tool

    @Nested
    @Input
    public Metadata metadata

    @TaskAction
    def run() throws IOException {
        // do something...
    }
}
